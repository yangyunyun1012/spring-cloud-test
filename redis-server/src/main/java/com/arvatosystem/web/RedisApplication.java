package com.arvatosystem.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Celine.Yang on 2017/7/19.
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients//启用feign进行远程调用
public class RedisApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class,args);
    }
}
