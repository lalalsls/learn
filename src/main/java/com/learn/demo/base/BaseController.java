package com.learn.demo.base;

import com.learn.demo.dto.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: 李浩然
 * @Date: 2019/7/28 10:26
 * @Description:
 */
public abstract class BaseController<E, ID extends Serializable> {

    /**
     * 获取service
     *
     * @return
     */
    @Autowired
    public abstract BaseService<E, ID> getService();

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
//    @ApiOperation(value = "获取全部数据")
    public Result<List<E>> getAll() {

        List<E> list = getService().getAll();
        return new ResultUtil<List<E>>().setData(list);
    }


}
