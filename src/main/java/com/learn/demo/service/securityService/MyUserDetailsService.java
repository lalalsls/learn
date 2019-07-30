package com.learn.demo.service.securityService;

import com.learn.demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * com.learn.demo.service.securityService class
 *
 * @author Create By SZHuan
 * @date 2019/07/29  21:58
 */
@Slf4j
@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        log.info("------接收输入的username 开始比对");
        log.info("用户名信息------{}",userName);

        com.learn.demo.entity.User byUserName = userRepository.findByUserName(userName);
        String passWord = byUserName.getPassWord();
        log.info("用户名数据库中的密码------{}",passWord);
//        return new User(userName,password,authorities);
        //AuthorityUtils.commaSeparatedStringToAuthorityList("admin") 把字符串转换成第三个参数的类型
        return new User(userName,passWord, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
//        return new User(userName,passwordEncoder.encode("123456"), AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
