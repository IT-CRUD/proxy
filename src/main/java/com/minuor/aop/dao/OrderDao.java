package com.minuor.aop.dao;

import com.minuor.aop.model.OrderModel;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: minuor
 * @Date: 2018/4/26
 * @Desc:
 */
public interface OrderDao {

    int insert(@Param("model") OrderModel build);
}
