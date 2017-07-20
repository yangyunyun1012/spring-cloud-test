package com.arvatosystem.web.controller;

import com.arvatosystem.web.model.Order;
import com.arvatosystem.web.service.OrderService;
import com.google.gson.Gson;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Celine.Yang on 2017/7/19.
 */
@RestController
@RequestMapping(value = "order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ResponseBody
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String findAllOrder(){
        List<Order> list=orderService.findAllOrder();
        Gson gson = new Gson();
        return gson.toJson(list);
    }

    @ResponseBody
    @RequestMapping(value = "/{userId}",method = RequestMethod.GET)
    public String findOrderByUser(@PathVariable int userId){
        if(StringUtils.isEmpty(String.valueOf(userId))){
            return "parameter userId is need";
        }
        Order order=orderService.findOrderByUser(userId);
        Gson gson = new Gson();
        return gson.toJson(order);
    }
}
