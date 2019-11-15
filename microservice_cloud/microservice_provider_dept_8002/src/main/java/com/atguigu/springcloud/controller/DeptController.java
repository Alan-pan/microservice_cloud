package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    @RequestMapping("/dept/list")
    public List<Dept> list() {
        return deptService.list();
    }


    //服务发现
    @Resource
    private DiscoveryClient client;
    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("**********" + list);
        List<ServiceInstance> srvList = client.getInstances("MICROSERVICE_DEPT");

        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }
}
