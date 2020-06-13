package com.xieahui.easy.jdbctemplate.dao;

import com.xieahui.easy.jdbctemplate.entity.EasyPoolDemoStudentEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/13
 */
@Repository
public class StudentDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<EasyPoolDemoStudentEntity> findAll() {
        String sql = "select id, name, sex from student";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper().newInstance(EasyPoolDemoStudentEntity.class));
    }

    public int save(EasyPoolDemoStudentEntity entity) {
        String sql = "insert into student(id, name, sex) value(?, ?, ?)";
        return jdbcTemplate.update(sql, entity.getId(), entity.getName(), entity.getSex());
    }
}
