package com.arvatosystem.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Celine.Yang on 2017/7/4.
 */
@EnableAutoConfiguration
@EnableDiscoveryClient //添加@EnableDiscoveryClient注解后，项目就具有了服务注册的功能
@SpringBootApplication
@MapperScan("com.arvatosystem.web.mapper")
@ServletComponentScan
@EnableFeignClients
public class OrderCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderCenterApplication.class,args);
    }
}
