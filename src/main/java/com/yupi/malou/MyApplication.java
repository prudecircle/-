package com.yupi.malou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动类
 *
 * @author <a href="github.com/prudecircle">圈霸霸</a>
 
 */
@SpringBootApplication
@MapperScan("com.yupi.malou.mapper")
//在Springboot中开启对定时任务的支持
@EnableScheduling
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}
