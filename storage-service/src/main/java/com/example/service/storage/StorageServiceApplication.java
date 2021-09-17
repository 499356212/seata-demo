package com.example.service.storage;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.service.storage"})
@MapperScan(basePackages = {"com.example.service.storage.mapper"}, annotationClass = Mapper.class)
@DubboComponentScan(basePackages = {"com.example.service.storage"})
public class StorageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageServiceApplication.class, args);
    }

}
