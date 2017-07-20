package com.arvatosystem.web.quartz;

import com.arvatosystem.web.config.RedisTemplate;
import com.arvatosystem.web.model.User;
import com.arvatosystem.web.remote.UserServiceRemote;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

/**
 * Created by Celine.Yang on 2017/7/11.
 */
@Configuration
@EnableScheduling
@ComponentScan(basePackages="com.arvatosystem.web")
public class SyncUserToRedis {
    @Autowired
    UserServiceRemote userServiceRemote;

    @Autowired
    private RedisTemplate redisTemplate;

    @Scheduled(cron = "0 30/0 * * * ?")
    public void scheduler(){
        Gson gson=new Gson();
        List<User> list=gson.fromJson(userServiceRemote.findUser(), new TypeToken<List<User>>(){}.getType());  ;
        for(User user:list){
            redisTemplate.setKey("user_"+user.getUserId(),gson.toJson(user));
        }
    }
}
