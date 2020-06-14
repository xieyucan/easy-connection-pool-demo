package com.xieahui.easy.mybatis;

import com.xieahui.springboot.aspect.DynamicDataSourceAspect;
import com.xieahui.springboot.config.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/13
 */
@SpringBootApplication
@MapperScan("com.xieahui.easy.mybatis.dao")
@Import({DynamicDataSourceRegister.class, DynamicDataSourceAspect.class})
public class MyBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisApplication.class, args);
    }
}
