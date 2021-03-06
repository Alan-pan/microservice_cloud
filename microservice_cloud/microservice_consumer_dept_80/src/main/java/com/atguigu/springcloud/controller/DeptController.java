package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.Dept;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    RestTemplate restTemplate;//用于访问rest的客户端模块

    private static final String REST_URL_PREFIX="http://localhost:8001";

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        //postForObject                     url requestMap ResponseBean.class
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept,Boolean.class);
    }
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        //getForObject                      url ResponseBean.class
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }
    @RequestMapping("/consumer/dept/list")
    public List<Dept> add(){
        //getForObject                      url ResponseBean.class
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }
}
