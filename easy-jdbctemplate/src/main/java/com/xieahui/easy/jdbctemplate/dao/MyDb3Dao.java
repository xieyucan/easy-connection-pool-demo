package com.xieahui.easy.jdbctemplate.dao;

import com.xieahui.easy.jdbctemplate.entity.DbEntity;
import com.xieahui.easy.jdbctemplate.entity.MyDb3;
import com.xieahui.springboot.annotation.TargetDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiehui1956(@)gmail.com on 2020/7/21
 */
@Repository
public class MyDb3Dao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public DbEntity findById(int id) {
        List<DbEntity> entityList = jdbcTemplate.
                query("select id, " +
                        "driver_class_name as driverClassName, " +
                        "jdbc_url as jdbcUrl, " +
                        "pool_name as poolName, " +
                        "group_name as groupName, " +
                        "balance_type as balanceType, " +
                        "username as username, " +
                        "password as password, " +
                        "minimum_idle as minimumIdle, " +
                        "maximum_pool_size as maximumPoolSize, " +
                        "connection_test_query as connectionTestQuery " +
                        "from db_entity where id = ?", new BeanPropertyRowMapper().newInstance(DbEntity.class), id);
        return entityList.get(0);
    }

    @TargetDataSource
    public List<MyDb3> findAll() {
        return jdbcTemplate.query("select id, db_name as name from my_db3"
                , new BeanPropertyRowMapper().newInstance(MyDb3.class));
    }

    public List<MyDb3> findAllById() {
        return jdbcTemplate.query("select id, db_name as name from my_db3"
                , new BeanPropertyRowMapper().newInstance(MyDb3.class));
    }
}
