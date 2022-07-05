package com.ddamit.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@EnableTransactionManagement
@SpringBootApplication
@EnableScheduling
@ComponentScan(value = "com.ddamit")
@MapperScan(basePackages = "com.ddamit.mapper.mapper")//用于扫描mapper接口层，指向mapper接口类的统一父级目录
public class DdamitApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DdamitApplication.class,args);
    }

    @Override
    public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }

}
