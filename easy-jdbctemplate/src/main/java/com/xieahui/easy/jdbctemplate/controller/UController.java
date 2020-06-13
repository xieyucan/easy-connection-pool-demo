package com.xieahui.easy.jdbctemplate.controller;

import com.xieahui.easy.jdbctemplate.entity.Db1UserEntity;
import com.xieahui.easy.jdbctemplate.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/13
 */
@RestController
@RequestMapping("/u")
public class UController {

    @Resource
    private UserService userService;

    @PostMapping("/save")
    public int save(Db1UserEntity userEntity) {
        return userService.save(userEntity);
    }

    @GetMapping(value = "/list", produces = "application/json;charset=UTF-8")
    public List<Db1UserEntity> list() {
        return userService.findAll();
    }
}
