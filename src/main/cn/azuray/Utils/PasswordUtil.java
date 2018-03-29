package azuray.Utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtil {

    /**
     * 加密密码
     * @param password 密码
     * @return 加密后密码
     */
    public static String encodePassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return  encoder.encode(password);
    }

    /**
     * 密码验证
     * @param password 密码
     * @param encodePassword 加密后密码
     * @return boolean
     */
    public static boolean verifyPassword(String password, String encodePassword) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(password, encodePassword);
    }


}
