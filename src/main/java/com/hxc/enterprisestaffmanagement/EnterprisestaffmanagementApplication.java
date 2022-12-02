package com.hxc.enterprisestaffmanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.hxc.enterprisestaffmanagement.Mapper")
public class EnterprisestaffmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnterprisestaffmanagementApplication.class, args);
    }

}
