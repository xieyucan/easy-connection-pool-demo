package com.xieahui.easy.mybatis;

import com.xieahui.springboot.annotation.EnableDynamicDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/13
 */
@SpringBootApplication
@EnableDynamicDataSource
@MapperScan("com.xieahui.easy.mybatis.dao")
public class MyBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisApplication.class, args);
    }
}
