package com.arvatosystem.web.remote;

import com.arvatosystem.web.remote.remoteHystrix.UserServiceRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Celine.Yang on 2017/7/19.
 */
@FeignClient(name="user-center",fallback=UserServiceRemoteHystrix.class)
public interface UserServiceRemote {
    @RequestMapping(value = "/user")
    public String findUser();
}
