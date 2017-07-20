package com.arvatosystem.web.remote;

import com.arvatosystem.web.remote.remoteHystrix.RedisClientRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Celine.Yang on 2017/7/19.
 */
@FeignClient(name="redis-server",fallback = RedisClientRemoteHystrix.class)
public interface RedisClientRemote {
    @RequestMapping(value = "/redis/getRedisKey")
    public String getRedisKey(@RequestParam(value = "key") String key);

    @RequestMapping(value = "/redis/setRedisKey")
    public String setRedisKey(@RequestParam(value = "key") String key,@RequestParam(value = "value") String value);
}