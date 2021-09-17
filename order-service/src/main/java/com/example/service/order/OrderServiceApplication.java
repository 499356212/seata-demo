package com.example.service.order;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.service.order"})
@MapperScan(basePackages = {"com.example.service.order.mapper"}, annotationClass = Mapper.class)
@DubboComponentScan(basePackages = {"com.example.service.order"})
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}
