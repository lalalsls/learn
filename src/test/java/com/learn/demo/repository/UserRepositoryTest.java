package com.learn.demo.repository;

import com.learn.demo.entity.User;
import com.learn.demo.util.SnowFlakeUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Test
    public void userTestSave(){
        User user = new User();
        SnowFlakeUtil snowFlakeUtil = SnowFlakeUtil.getFlowIdInstance();
        //System.out.println(snowFlakeUtil.nextId());
        user.setId(String.valueOf(snowFlakeUtil.nextId()));

        user.setPassWord(passwordEncoder.encode("123456"));
        user.setUserName("szhuan");
        userRepository.save(user);

    }
}