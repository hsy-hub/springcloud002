package com.productor8001.service;

import com.pojoapi.pojo.User;

import java.util.List;

public interface UserService {
    public User getUserByid(Integer id);
    public List<User> getUserList();
}

