package com.arvatosystem.web.remote.remoteHystrix;

import com.arvatosystem.web.remote.RedisClientRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Celine.Yang on 2017/7/19.
 */
@Component
public class RedisClientRemoteHystrix implements RedisClientRemote{

    @Override
    public String getRedisKey(@RequestParam(value = "key") String key) {
        return "get redis key failed";
    }

    @Override
    public String setRedisKey(@RequestParam(value = "key") String key, @RequestParam(value = "value") String value) {
        return "set redis key failed";
    }
}
