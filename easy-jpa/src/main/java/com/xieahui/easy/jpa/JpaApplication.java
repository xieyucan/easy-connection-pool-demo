package com.xieahui.easy.jpa;

import com.xieahui.springboot.aspect.DynamicDataSourceAspect;
import com.xieahui.springboot.config.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/13
 */
@SpringBootApplication
@Import({DynamicDataSourceRegister.class, DynamicDataSourceAspect.class})
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }
}
