package com.learn.demo.Controller;

import com.learn.demo.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName 施振寰
 * @Author 75424
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
