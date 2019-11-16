package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
//服务熔断处理异常 服务降级处理宕机
//feign解耦 增加服务降级处理 让客户端在服务端不可用时获得提示信息，不会挂起耗死的服务器
//提供注释可以在控制层直接调用此api的service
@FeignClient(value = "MICROSERVICE-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @PostMapping("/dept/add")
    public boolean add (@RequestBody Dept dept);

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id);

    @GetMapping("/dept/list")
    public List<Dept> list();
}