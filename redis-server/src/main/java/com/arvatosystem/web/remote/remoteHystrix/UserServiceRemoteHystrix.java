package com.arvatosystem.web.remote.remoteHystrix;

import com.arvatosystem.web.remote.UserServiceRemote;
import org.springframework.stereotype.Component;

/**
 * Created by Celine.Yang on 2017/7/14.
 */
@Component
public class UserServiceRemoteHystrix implements UserServiceRemote{

    @Override
    public String findUser() {
        return "get user failed";
    }
}
