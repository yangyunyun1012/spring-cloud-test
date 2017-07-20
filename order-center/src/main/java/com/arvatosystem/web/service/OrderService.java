package com.arvatosystem.web.service;

import com.arvatosystem.web.model.Order;

import java.util.List;

/**
 * Created by Celine.Yang on 2017/7/19.
 */
public interface OrderService {
    List<Order> findAllOrder();

    Order  findOrderByUser(int userId);
}
