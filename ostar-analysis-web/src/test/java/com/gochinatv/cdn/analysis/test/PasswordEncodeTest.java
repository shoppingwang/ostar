package com.gochinatv.cdn.analysis.test;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 密码加密测试
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/24 16:04
 */
public class PasswordEncodeTest
{
    @Test
    public void testPasswdEncode()
    {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        System.out.println(encoder.encode("admin"));

        System.out.println(encoder.matches("jimi", "$2a$10$S2jXUUP.ppjv2SQNdR9L9uwKjzz/FXgdzfDzCj5eSDMkDYc7nZPUO"));
    }
}
