package com.xieahui.easy.jdbctemplate.dao;

import com.xieahui.easy.jdbctemplate.entity.MyDb3;
import com.xieahui.springboot.annotation.TargetDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiehui1956(@)gmail.com on 2020/8/3
 */
@Repository
public class GroupDSDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<MyDb3> findAll() {
        return jdbcTemplate.query("select id, db_name as name from my_db3"
                , new BeanPropertyRowMapper().newInstance(MyDb3.class));
    }

    @TargetDataSource
    public List<MyDb3> findById() {
        return jdbcTemplate.query("select id, db_name as name from my_db3"
                , new BeanPropertyRowMapper().newInstance(MyDb3.class));
    }
}
