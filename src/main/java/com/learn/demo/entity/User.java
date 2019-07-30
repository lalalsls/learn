package com.learn.demo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName com.learn.demo.entity
 * @Author 施振寰
 * @Datr 2019/7/30 9:56
 **/
@Data
@Table
@Entity
public class User {
    /**
     * 用户ID
     */
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    /**
     * 用户name（请在数据库设置唯一性）
     */
    private String userName;
    /**
     * 用户密码
     */
    private String passWord;

}
