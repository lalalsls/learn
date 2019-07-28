package com.learn.demo.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @ClassName com.learn.demo.base
 * @Author 施振寰
 * @Datr 2019/7/28 12:03
 **/
public interface BaseDao <E, ID extends Serializable> extends JpaRepository<E, ID>, JpaSpecificationExecutor<E> {
}
