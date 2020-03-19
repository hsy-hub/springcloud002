package com.customer.controller;

import com.pojoapi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class Controller {
    String url = "http://productor";//ribbon 负载均衡的访问地址通过服务名来进行访问

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("getUserByid/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        User user = restTemplate.getForObject(url+"/productor/getUserByid/" + id, User.class);
        return user;
    }

    @GetMapping("getUserList")
    public List<User> getUserList() {
        List<User> users = restTemplate.getForObject(url + "/productor/getUserList/", List.class);
        return users;
    }
}
