package com.atguigu.springcloud.cfgbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {//ConfigBean=applicationContext.xml
    @Bean
    @LoadBalanced //调用时开启ribbon负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
