package com.learn.demo.service.securityService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * com.learn.demo.service.securityService class
 *
 * @author Create By SZHuan
 * @date 2019/07/29  21:58
 */
@Slf4j
@Service
//@Component
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        log.info("用户名信息{}",userName);
//        return new User(userName,password,authorities);
        //AuthorityUtils.commaSeparatedStringToAuthorityList("admin") 把字符串转换成第三个参数的类型
        return new User(userName,"123456", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
