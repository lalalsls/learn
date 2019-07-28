package com.learn.demo.base;

import com.learn.demo.constant.Status;
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

    public BaseException(Status status){
        super(status.getMessage());
    }
    public BaseException(Integer code,String message){
        super(message);
        this.code =code;
        this.message=message;
    }
}
