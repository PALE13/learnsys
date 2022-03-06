package com.gqzdev.learnsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description:
 * @Author：+QQ 2027776292
 * @Date： 2020/4/11 19:10
 */
//指定要扫描的mybatis映射类的路径
@MapperScan("com.gqzdev.learnsys.dao")
@SpringBootApplication
public class LearnsysApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearnsysApplication.class, args);
    }

}
