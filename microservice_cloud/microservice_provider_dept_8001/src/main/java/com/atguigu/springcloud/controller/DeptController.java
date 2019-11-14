package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }
    @RequestMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        return deptService.get(id);
    }
    @RequestMapping("/dept/list")
    public List<Dept> list(){
        return deptService.list();
    }
}
