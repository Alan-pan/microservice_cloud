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

    /*@Bean//如果配置文件中有默认的 此注解会覆盖原来的注入
    public IRule myRule(){
        //RoundRobinRule 轮询
        //RandomRule     随机
        //RetryRule      高可用,轮询

        return new RetryRule();
    }*/
}
