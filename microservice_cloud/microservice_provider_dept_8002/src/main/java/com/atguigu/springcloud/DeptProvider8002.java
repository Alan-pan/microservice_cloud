package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient//服务发现
@SpringBootApplication
public class DeptProvider8002 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002.class,args);
    }
}
