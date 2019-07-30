package com.learn.demo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author: 李浩然
 * @Date: 2019/7/28 15:50
 * @Description:
 */
@Data
@Entity
@Table
public class Role {
    /**
     * ID
     */
    @Id
    @GeneratedValue
    @Column(length = 20 ,name = "ID")
    private Integer id;
    /**
     * 角色名称
     */
    @Column(length = 40, nullable = false ,name = "NAME")
    private String name;
    /**
     * 类型
     */
    @Column(length = 40, nullable = false ,name = "TYPE")
    private String type;
}
