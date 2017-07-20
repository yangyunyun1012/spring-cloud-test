package com.arvatosystem.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**
 * Created by Celine.Yang on 2017/7/7.
 */
@Component
public class RedisClient {
//    @Autowired
//    private JedisPool jedisPool;
//
//    public void set(String key, String value) throws Exception {
//        Jedis jedis = null;
//        try {
//            jedis = jedisPool.getResource();
//            jedis.set(key, value);
//        } finally {
//            //返还到连接池
//            jedis.close();
//        }
//    }
//
//    public String get(String key) throws Exception  {
//
//        Jedis jedis = null;
//        try {
//            jedis = jedisPool.getResource();
//            return jedis.get(key);
//        } finally {
//            //返还到连接池
//            jedis.close();
//        }
//    }
    @Autowired
    private StringRedisTemplate template;

    public  void setKey(String key,String value){
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key,value);//1分钟过期
    }

    public String getKey(String key){
        ValueOperations<String, String> ops = this.template.opsForValue();
        return ops.get(key);
    }
}
