package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
@EnableHystrixDashboard//开启dashboard仪表盘监控注解 //其他提供者 添加被监控的pom注解
public class DpetConsumer80HystrixDashboard {

    public static void main(String[] args) {
        SpringApplication.run(DpetConsumer80HystrixDashboard.class,args);
    }
}

