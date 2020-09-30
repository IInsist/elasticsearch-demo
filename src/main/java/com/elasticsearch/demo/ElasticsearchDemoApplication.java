package com.elasticsearch.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

//启动spring自带任务调度
@EnableScheduling
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan({"com.elasticsearch.demo.module.*.repository"})
public class ElasticsearchDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchDemoApplication.class, args);
    }

}
