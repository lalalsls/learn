package com.learn.demo.controller;

import com.learn.demo.base.BaseController;
import com.learn.demo.base.BaseService;
import com.learn.demo.dto.Result;
import com.learn.demo.util.ResultUtil;
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
    @Override
    public BaseService getService() {
        return null;
    }

    @RequestMapping("/a")
    public Result<String> Test() {
        return new ResultUtil<String>().setData("Success!!!");
    }
}
