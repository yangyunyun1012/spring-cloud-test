package com.arvatosystem.web.service;

import com.arvatosystem.web.model.User;

import java.util.List;

/**
 * Created by Celine.Yang on 2017/7/18.
 */
public interface UserService {
    List<User> findUser();

    User  findUserById(int userId);

    int addUser(User user);
}
