package com.xieahui.easy.jdbctemplate.dao;

import com.xieahui.easy.jdbctemplate.entity.Db1UserEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/13
 */
@Repository
public class UserDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<Db1UserEntity> findAll() {
        String sql = "select id, name, sex from user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper().newInstance(Db1UserEntity.class));
    }

    public int save(Db1UserEntity entity) {
        String sql = "insert into user (id, name, sex) value(?, ?, ?)";
        return jdbcTemplate.update(sql, entity.getId(), entity.getName(), entity.getSex());
    }
}
