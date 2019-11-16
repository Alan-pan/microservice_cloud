package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {

    @Resource
    private DeptService service;


    @PostMapping("/dept/add")
    public boolean add (@RequestBody Dept dept){
        return service.add(dept);
    }


    @GetMapping("/dept/get/{id}")
//解耦了使用fallbackfactory在cloud-api中
//@HystrixCommand(fallbackMethod = "hystrix_get")
    public Dept get(@PathVariable("id")Long id){
        Dept dept = service.get(id);
        if (null==dept){
            throw new RuntimeException("该ID:"+id+"没有此数据");
        }
        return dept;
    }
    public Dept hystrix_get(@PathVariable("id")Long id){
        return new Dept().setDeptno(id).setDname("服务熔断处理（服务端）").setDb_source("no mysql");
    }

    @GetMapping("/dept/list")
    public List<Dept> list(){
        return service.list();
    }

}

