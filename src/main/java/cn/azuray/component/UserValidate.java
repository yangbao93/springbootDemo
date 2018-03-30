package cn.azuray.component;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import cn.azuray.Exception.ProjectRuntimeExcption;
import cn.azuray.entity.User;

@Component
public class UserValidate {

    public void validateUserLogin(User user) {

        if (StringUtils.isBlank(user.getUserCode())) {
            throw new ProjectRuntimeExcption("9999", "账号不能为空");
        }

        if (StringUtils.isBlank(user.getPassWord())) {
            throw new ProjectRuntimeExcption("9999", "密码不能为空");
        }
    }
}
