package com.example.service.account;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.service.account"})
@MapperScan(basePackages = {"com.example.service.account.mapper"}, annotationClass = Mapper.class)
@DubboComponentScan(basePackages = {"com.example.service.account"})
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }

}
