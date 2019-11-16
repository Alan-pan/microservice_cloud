package com.atguigu.springcloud;

import com.atguigu.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient //eureka客户端
@RibbonClient(name = "MICROSERVICE-DEPT",configuration = MySelfRule.class)//自定义负载均衡规则
public class DpetConsumer80 {

    public static void main(String[] args) {
        SpringApplication.run(DpetConsumer80.class,args);
    }
}
