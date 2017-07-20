package com.arvatosystem.web.client;

import com.arvatosystem.web.config.RedisTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Celine.Yang on 2017/7/19.
 */
@RestController
@RequestMapping(value="redis")
public class RedisClient {
    @Autowired
    RedisTemplate redisTemplate;

    @ResponseBody
    @RequestMapping(value = "/getRedisKey",method = RequestMethod.GET)
    public String getRedisKey(String key){
        return redisTemplate.getKey(key);
    }

    @ResponseBody
    @RequestMapping(value = "/setRedisKey",method = RequestMethod.GET)
    public String setRedisKey(String key,String value){
        redisTemplate.setKey(key,value);
        return "success";
    }
}
