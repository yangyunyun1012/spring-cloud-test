package com.arvatosystem.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**
 * Created by Celine.Yang on 2017/7/7.
 */
@Component
public class RedisTemplate {
    @Autowired
    private StringRedisTemplate template;

    public  void setKey(String key,String value){
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key,value);
    }

    public String getKey(String key){
        ValueOperations<String, String> ops = this.template.opsForValue();
        return ops.get(key);
    }
}
