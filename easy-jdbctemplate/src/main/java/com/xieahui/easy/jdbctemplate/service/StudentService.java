package com.xieahui.easy.jdbctemplate.service;

import com.xieahui.easy.jdbctemplate.dao.StudentDao;
import com.xieahui.easy.jdbctemplate.entity.EasyPoolDemoStudentEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/13
 */
@Service
public class StudentService {

    @Resource
    private StudentDao studentDao;

    public List<EasyPoolDemoStudentEntity> findAll() {
        return studentDao.findAll();
    }

    public int save(EasyPoolDemoStudentEntity entity) {
        return studentDao.save(entity);
    }
}
