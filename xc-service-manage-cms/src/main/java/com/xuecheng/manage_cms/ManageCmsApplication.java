package com.xuecheng.manage_cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EntityScan("com.xuecheng.framework.domain.cms")
@ComponentScan(basePackages ={"com.xuecheng.api"} )// 扫描所有的接口
@ComponentScan(basePackages = {"com.xuecheng.manage_cms"})// 扫描本项目下的所有类
public class ManageCmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageCmsApplication.class, args);
    }
}
