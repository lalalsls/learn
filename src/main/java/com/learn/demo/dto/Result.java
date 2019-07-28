package com.learn.demo.dto;

import cn.hutool.core.date.DateUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName com.learn.demo.common.vo
 * @Author 施振寰
 * @Datr 2019/7/28 12:09
 **/
@Data
@AllArgsConstructor
@Accessors(chain = true)
@NoArgsConstructor
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
     * 时间
     */
    private Date date = DateUtil.date();

    /**
     * 结果对象
     */
    private T result;

    public static Result error(boolean b, String message) {

        return new Result().setSuccess(b).setMessage(message);
    }
}
