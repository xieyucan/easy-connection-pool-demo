package com.xieahui.easy.jpa;

import com.xieahui.springboot.annotation.EnableDynamicDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/13
 */
@SpringBootApplication
@EnableDynamicDataSource
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }
}
