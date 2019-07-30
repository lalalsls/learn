package com.learn.demo.base;

import com.learn.demo.dto.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Authr: 李浩然
 * @Date: 2019/7/28 12:46
 * @Description:
 */
@Slf4j
public class BaseExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result jsonErrorHandler(Exception exception) {
        log.error("【Exception】:{}", exception.getMessage());
        return new Result().setSuccess(false).setMessage(exception.getMessage());
    }

}
