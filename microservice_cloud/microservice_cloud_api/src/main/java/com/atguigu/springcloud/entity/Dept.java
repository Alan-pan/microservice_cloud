package com.atguigu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)//链式风格访问
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    //一个微服务架构对应一个服务数据库
    private String db_source;

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}