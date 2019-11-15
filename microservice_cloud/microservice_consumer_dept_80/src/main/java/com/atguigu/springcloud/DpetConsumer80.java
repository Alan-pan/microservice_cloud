package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //eureka客户端
public class DpetConsumer80 {

    public static void main(String[] args) {
        SpringApplication.run(DpetConsumer80.class,args);
    }
}
