package com.arvatosystem.web.service.impl;

import com.arvatosystem.web.mapper.UserMapper;
import com.arvatosystem.web.model.User;
import com.arvatosystem.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Celine.Yang on 2017/7/18.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> findUser(){
        return userMapper.findUser();
    }

    @Override
    public User findUserById(int userId) {
        return userMapper.findUserById(userId);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
