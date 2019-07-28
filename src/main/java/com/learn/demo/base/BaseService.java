package com.learn.demo.base;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName com.learn.demo.base
 * @Author 施振寰
 * @Datr 2019/7/28 11:58
 **/
// JDK8函数式接口注解 仅能包含一个抽象方法
//@FunctionalInterface
public interface BaseService <E, ID extends Serializable> {

    public BaseDao<E, ID> getRepository();

    /**
     * 获取所有列表
     * @return
     */
    public default List<E> getAll() {
        return getRepository().findAll();
    }

}
