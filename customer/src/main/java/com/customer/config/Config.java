package com.customer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
    @Bean
    @LoadBalanced//配置负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();

    }
    //自定义算法

    @Bean
    public IRule MyRule() {
        return new RandomRule();
    }
}
