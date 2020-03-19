package com.productor.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pojoapi.pojo.User;
import com.productor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductorController {

  @Autowired
  UserService userService;

    @RequestMapping("/productor/getUserByid/{id}")
    @HystrixCommand(fallbackMethod = "HystrixGet") //失败熔断的回调方法
    public User getUserById(@PathVariable("id") Integer id){
      User userByid = userService.getUserByid(id);
      if (userByid == null){
        throw new RuntimeException("没有相应的数据");
      }
      return userByid;
    }

    //备选方法
  public User HystrixGet(@PathVariable("id") Integer id){
      return new User(id,"没有对应的用户","没有对应的数据库");
  }

    @GetMapping("/productor/getUserList")
    public List<User> getUserList(){

      return userService.getUserList();
  }
}
