package com.productor8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //开启client
public class ProductorApp3 {
    public static void main(String[] args) {

        SpringApplication.run(ProductorApp3.class,args);
    }
}
