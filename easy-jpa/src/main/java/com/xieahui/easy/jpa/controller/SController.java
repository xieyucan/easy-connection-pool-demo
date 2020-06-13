package com.xieahui.easy.jpa.controller;

import com.xieahui.easy.jpa.entity.EasyPoolDemoStudentEntity;
import com.xieahui.easy.jpa.service.StudentService;
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
@RequestMapping("/s")
public class SController {

    @Resource
    private StudentService studentService;

    @PostMapping("/save")
    public int save(EasyPoolDemoStudentEntity studentEntity) {
        studentService.save(studentEntity);
        return 1;
    }

    @GetMapping(value = "/list", produces = "application/json;charset=UTF-8")
    public List<EasyPoolDemoStudentEntity> list() {
        return studentService.findAll();
    }
}
