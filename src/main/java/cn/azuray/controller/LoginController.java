package cn.azuray.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import cn.azuray.Exception.ProjectRuntimeExcption;
import cn.azuray.Utils.PasswordUtil;
import cn.azuray.commonResponse.CommonResponse;
import cn.azuray.commonResponse.ICommonResponse;
import cn.azuray.component.RedisService;
import cn.azuray.component.UserValidate;
import cn.azuray.entity.RedisTokenEnum;
import cn.azuray.entity.User;
import cn.azuray.service.IUserService;

@RestController
@RequestMapping("/userLogin")
public class LoginController {

    @Autowired
    private UserValidate userValidate;
    @Autowired
    private IUserService userService;
    @Autowired
    private RedisService redisService;


    @RequestMapping(value = "login", method = RequestMethod.POST)
    public CommonResponse userLogin(@RequestBody User user) {
        //检验数据完整性
        userValidate.validateUserLogin(user);
        //验证用户是否存在
        User userDB = userService.selectOne(new EntityWrapper<User>().eq("usercode", user.getUserCode()));
        if (userDB == null) {
            throw new ProjectRuntimeExcption("9999", "用户不存在");
        }
        // 验证密码正确性
        boolean verifyPassword = PasswordUtil.verifyPassword(user.getPassWord(), userDB.getPassWord());
        if (!verifyPassword) {
            throw new ProjectRuntimeExcption("9999", "用户密码不正确");
        }
        // 放入缓存
        UUID uuid = UUID.randomUUID();
        String jsonString = JSONObject.toJSONString(userDB);
        redisService.set(RedisTokenEnum.LOGIN.value + uuid, jsonString);
        return new CommonResponse(ICommonResponse.SUCCESS_CODE, "操作成功", uuid);
    }

    @RequestMapping(value = "logout", method = RequestMethod.POST)
    public void userLogout(HttpServletRequest request) {
        // 获取session
        HttpSession session = request.getSession();
        Object token = session.getAttribute("token");
        if (token == null) {
            throw new ProjectRuntimeExcption(ICommonResponse.FAIL_CODE, "数据异常");
        }
        // 获取对应的个人信息，如果存在就删除，不存在则不处理
        String jsonString = JSONObject.toJSONString(token);
        if (StringUtils.isBlank(redisService.get(jsonString))) {
            return;
        }
        redisService.remove(jsonString);
    }
}
