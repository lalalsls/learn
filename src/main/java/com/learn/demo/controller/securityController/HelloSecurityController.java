package com.learn.demo.controller.securityController;

import com.learn.demo.dto.Result;
import com.learn.demo.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

    private RequestCache requestCache = new HttpSessionRequestCache(); //读取缓存中的所有session
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();//页面跳转

    @RequestMapping("/authentication/login")
    @ResponseStatus(code = HttpStatus.UNAUTHORIZED)//401状态码
    //@ResponseBody
    public String securityLogin(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        SavedRequest request = requestCache.getRequest(httpServletRequest, httpServletResponse);
        if (request != null){
            String redirectUrl = request.getRedirectUrl();
            log.info("引发跳转的URL是{}",redirectUrl);
            //自定义逻辑 如果url是html请求 返回自定义页面，否则也是这样（我为了方便调试，你也可以返回json状态码）
            if (StringUtils.endsWithIgnoreCase(redirectUrl,".html")){
                try {
                    redirectStrategy.sendRedirect(httpServletRequest,httpServletResponse,"/securityLogin.html");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        //redirectStrategy.sendRedirect(httpServletRequest,httpServletResponse,"/securityLogin.html");
        //return ResultUtil.error("你需要登陆他"); //状态代码
        return "securityLogin";
    }
}
