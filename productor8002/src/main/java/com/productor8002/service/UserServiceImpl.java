package com.productor8002.service;

import com.pojoapi.pojo.User;
import com.productor8002.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public User getUserByid(Integer id) {
        return userMapper.getUserByid(id);
    }

    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
