package com.learn.demo.config;

import com.learn.demo.service.securityService.MyUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @ClassName com.learn.demo.config
 * @Author 施振寰
 * @Datr 2019/7/29 13:47
 **/
@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/", "/home").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .withUser("user").password("password").roles("USER");
//    }
    /**
     * formLogin() 表单登陆  &&http.httpBasic() 验证
     * authorizeRequests() 表示下面全是授权的配置
     * anyRequest() 任何的请求授权
     * authenticated() 都需要身份认证
     * @param http
     * @throws Exception
     */
    /**
     * 生成定义一个PasswordEncoder的Bean，配置加密方式，这里生成BCryptPasswordEncoder的Bean对象
     */
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * 生成一个自定义的UserDetailsServiceImpl的Bean，交给Spring IOC容器
     */
    @Bean
    UserDetailsService detailsService() {
        return new MyUserDetailsService();
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.httpBasic();
        http.formLogin()
                .loginPage("/authentication/login")
                .loginProcessingUrl("/authentication/form")
                .and()
                .authorizeRequests()
                .antMatchers("/authentication/login","/securityLogin.html").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable();
    }
    // 自定义配置认证规则
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("zhangsan").password("12345").roles("SuperAdmin")
//                .and()
//                .withUser("lisi").password("12345").roles("Admin")
//                .and()
//                .withUser("wangwu").password("12345").roles("Employee")
//                .and()
//                .passwordEncoder(new CustomPasswordEncoder());
        auth.userDetailsService(detailsService()) // 用户认证
                .passwordEncoder(passwordEncoder()); // 使用加密验证

    }

    /**
     * 开发其他模块时候把这个取消注释就解除权限验证了
     * @param web
     * @throws Exception
     */
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/**");
//    }
}
