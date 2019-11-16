package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient //eureka客户端
@EnableFeignClients(basePackages = "com.atguigu.springcloud")
@ComponentScan("com.atguigu.springcloud")
public class DpetConsumer80Feign {

    public static void main(String[] args) {
        SpringApplication.run(DpetConsumer80Feign.class,args);
    }
}
