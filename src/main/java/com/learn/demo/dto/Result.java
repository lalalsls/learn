package com.learn.demo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName com.learn.demo.common.vo
 * @Author 施振寰
 * @Datr 2019/7/28 12:09
 **/
@Data
public class Result <T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 成功标志
     */
    private boolean success;

    /**
     * 失败消息
     */
    private String message;

    /**
     * 返回代码
     */
    private Integer code;

    /**
     * 时间戳
     */
    private long timestamp = System.currentTimeMillis();

    /**
     * 结果对象
     */
    private T result;
}
