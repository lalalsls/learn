package com.learn.demo.controller;

import com.learn.demo.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Author 施振寰
 * @Datr 2019/7/28 11:05
 **/
@RestController
@RequestMapping("/szh")
public class TestController extends BaseController {
    @RequestMapping("/a")
    public String Test(){
        return "SUCCESS";
    }
}
