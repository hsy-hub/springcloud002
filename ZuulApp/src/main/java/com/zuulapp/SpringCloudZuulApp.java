package com.zuulapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy//开启路由功能
public class SpringCloudZuulApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulApp.class,args);
    }
}
