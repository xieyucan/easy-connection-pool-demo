package com.xieahui.easy.mybatis.service;

import com.xieahui.easy.mybatis.dao.StudentMapper;
import com.xieahui.easy.mybatis.entity.EasyPoolDemoStudentEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/13
 */
@Service
public class StudentService {

    @Resource
    private StudentMapper studentMapper;

    public List<EasyPoolDemoStudentEntity> findAll() {
        return studentMapper.findAll();
    }

    public int save(EasyPoolDemoStudentEntity entity) {
        return studentMapper.save(entity);
    }
}
