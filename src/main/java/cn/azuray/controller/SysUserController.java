package cn.azuray.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.azuray.commonResponse.CommonResponse;
import cn.azuray.commonResponse.ICommonResponse;
import cn.azuray.entity.User;
import cn.azuray.service.IUserService;

@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public CommonResponse addUser(@RequestBody User user) {
        boolean insert = userService.insert(user);
        if (insert) {
            return new CommonResponse(ICommonResponse.SUCCESS_CODE, "操作成功", user);
        }
        return new CommonResponse(ICommonResponse.FAIL_CODE, "操作失败");
    }

    @RequestMapping(value = "1test",method = RequestMethod.POST)
    public String test() {
        return  "a";
    }
}
