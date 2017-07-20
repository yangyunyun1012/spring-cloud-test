package com.arvatosystem.web.controller;

import com.arvatosystem.web.model.User;
import com.arvatosystem.web.remote.RedisClientRemote;
import com.arvatosystem.web.service.UserService;
import com.google.gson.Gson;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Celine.Yang on 2017/7/4.
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private RedisClientRemote redisClientRemote;

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String findUser(){
        List<User> list=userService.findUser();
        Gson gson = new Gson();
        return gson.toJson(list);
    }

    @ResponseBody
    @RequestMapping(value = "/{userId}",method = RequestMethod.GET)
    public String findUserById(@PathVariable int userId){
        if(StringUtils.isEmpty(String.valueOf(userId))){
            return "parameter userId is need";
        }
        try {
            User user=null;
            Gson gson = new Gson();
            String redis_user_key="user_"+userId;
            if(StringUtils.isNotEmpty(redisClientRemote.getRedisKey(redis_user_key))){
                String a=redisClientRemote.getRedisKey(redis_user_key);
                user=gson.fromJson(redisClientRemote.getRedisKey(redis_user_key),User.class);
            }else{
                user=userService.findUserById(userId);
                redisClientRemote.setRedisKey(redis_user_key,gson.toJson(user));
            }
            return gson.toJson(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String createUser(User user){
        if(StringUtils.isEmpty(String.valueOf(user.getName()))){
            return "parameter name is need";
        }
        int result=userService.addUser(user);
        if(result>0){
            return "success";
        }
        return "failed";
    }
}
