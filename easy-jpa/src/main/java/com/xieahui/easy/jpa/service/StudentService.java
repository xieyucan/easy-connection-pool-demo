package com.xieahui.easy.jpa.service;

import com.xieahui.easy.jpa.dao.StudentRepository;
import com.xieahui.easy.jpa.entity.EasyPoolDemoStudentEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/13
 */
@Service
public class StudentService {

    @Resource
    private StudentRepository studentRepository;

    public List<EasyPoolDemoStudentEntity> findAll() {
        return studentRepository.findAll();
    }

    public void save(EasyPoolDemoStudentEntity entity) {
        studentRepository.save(entity);
    }
}
