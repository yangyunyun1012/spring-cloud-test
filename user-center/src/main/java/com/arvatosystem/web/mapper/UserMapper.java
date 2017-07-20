package com.arvatosystem.web.mapper;

import com.arvatosystem.web.model.User;

import java.util.List;

/**
 * Created by Celine.Yang on 2017/7/7.
 */
//@Mapper
public interface UserMapper {

    public List<User> findUser();

    public User  findUserById(int userId);

    public int addUser(User user);
}
