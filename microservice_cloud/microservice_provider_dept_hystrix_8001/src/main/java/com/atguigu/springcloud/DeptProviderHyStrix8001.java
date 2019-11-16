package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient//提供方eureka
@EnableDiscoveryClient//提供方服务发现
@EnableCircuitBreaker //提供方服务熔断
@SpringBootApplication
public class DeptProviderHyStrix8001 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHyStrix8001.class,args);
    }
}
