package com.productor8001.dao;

import com.pojoapi.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public User getUserByid(Integer id);
    public List<User> getUserList();
}
