package com.learn.demo.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @ClassName com.learn.demo.base
 * @Author 施振寰
 * @Datr 2019/7/28 12:03
 **/
// 自定义接口 不会创建接口的实例 必须加此注解
@NoRepositoryBean
public interface BaseDao <E, ID extends Serializable> extends JpaRepository<E, ID>, JpaSpecificationExecutor<E> {
}
