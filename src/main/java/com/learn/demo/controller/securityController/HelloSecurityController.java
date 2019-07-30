package com.learn.demo.controller.securityController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName com.learn.demo.controller.securityController
 * @Author 施振寰
 * @Datr 2019/7/29 14:09
 **/
@Slf4j
@Controller
//@RequestMapping("/")
public class HelloSecurityController {

    @RequestMapping("/")
    public String index() {
        return "/index";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        log.info("hello!!!!");
        return "/hello";
    }

    @RequestMapping("/logina")
    public String login() {
        return "/logina";
    }
    @RequestMapping("/error ")
    @ResponseBody
    public String error () {
        return "/error ";
    }
}
