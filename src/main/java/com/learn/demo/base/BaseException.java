package com.learn.demo.base;

import lombok.Data;

/**
 * @Author: 李浩然
 * @Date: 2019/7/28 10:54
 * @Description:
 */
@Data
public class BaseException extends RuntimeException {
    private Integer code;
    private String message;
//
//    public BaseException(Status status)
}
