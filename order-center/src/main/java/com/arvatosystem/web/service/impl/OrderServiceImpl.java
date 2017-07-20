package com.arvatosystem.web.service.impl;

import com.arvatosystem.web.mapper.OrderMapper;
import com.arvatosystem.web.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Celine.Yang on 2017/7/19.
 */
@Service
public class OrderServiceImpl implements com.arvatosystem.web.service.OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> findAllOrder(){
        return orderMapper.findAllOrder();
    }

    @Override
    public Order  findOrderByUser(int userId){
        return orderMapper.findOrderByUser(userId);
    }
}
