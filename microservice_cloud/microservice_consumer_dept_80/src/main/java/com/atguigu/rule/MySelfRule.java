package com.atguigu.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MySelfRule  {
    @Bean
    public IRule myRule(){
        return new FiveRule();
    }

}
