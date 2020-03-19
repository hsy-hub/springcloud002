package com.productor8001.controller;

import com.pojoapi.pojo.User;
import com.productor8001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductorController {

  @Autowired
  UserService userService;

    @GetMapping("/productor/getUserByid/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        return userService.getUserByid(id);
    }

  @GetMapping("/productor/getUserList")
  public List<User> getUserList(){
    return userService.getUserList();
  }
}
