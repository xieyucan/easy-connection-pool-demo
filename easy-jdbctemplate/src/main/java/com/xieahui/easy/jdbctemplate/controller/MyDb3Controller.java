package com.xieahui.easy.jdbctemplate.controller;

import com.xieahui.easy.jdbctemplate.entity.MyDb3;
import com.xieahui.easy.jdbctemplate.service.MyDb3Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiehui1956(@)gmail.com on 2020/7/21
 */
@RestController
@RequestMapping("/m3")
public class MyDb3Controller {

    @Resource
    private MyDb3Service myDb3Service;

    @GetMapping("/f1")
    public List<MyDb3> findAll(Integer id) throws InterruptedException {
        return myDb3Service.findAll(id);
    }

    @GetMapping("/f2")
    public List<MyDb3> findAllById() {
        return myDb3Service.findAllById();
    }
}
