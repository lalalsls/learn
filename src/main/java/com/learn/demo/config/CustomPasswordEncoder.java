package com.learn.demo.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * com.learn.demo.config class
 *
 * @author Create By SZHuan
 * @date 2019/07/29  22:34
 */
public class CustomPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
