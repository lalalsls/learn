package com.learn.demo.repository;

import com.learn.demo.base.BaseDao;
import com.learn.demo.entity.User;

/**
 * @ClassName com.learn.demo.repository
 * @Author 施振寰
 * @Datr 2019/7/30 9:54
 **/
public interface UserRepository extends BaseDao<User,String> {

    User findByUserName(String userName);

}
