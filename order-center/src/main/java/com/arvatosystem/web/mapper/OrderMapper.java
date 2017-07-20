package com.arvatosystem.web.mapper;

import com.arvatosystem.web.model.Order;

import java.util.List;

/**
 * Created by Celine.Yang on 2017/7/7.
 */
//@Mapper
public interface OrderMapper {

    public List<Order> findAllOrder();

    public Order findOrderByUser(int userId);

}
