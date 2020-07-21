package com.xieahui.easy.jdbctemplate.service;

import com.xieahui.easy.jdbctemplate.dao.MyDb3Dao;
import com.xieahui.easy.jdbctemplate.entity.MyDb3;
import com.xieahui.springboot.annotation.TargetDataSource;
import com.xieahui.springboot.config.DynamicDbSource;
import com.xieahui.springboot.entity.DbEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiehui1956(@)gmail.com on 2020/7/21
 */
@Service
public class MyDb3Service {

    @Resource
    private MyDb3Dao myDb3Dao;

    public List<MyDb3> findAll(int id) throws InterruptedException {
        DbEntity dbEntity = myDb3Dao.findById(id);
        //设置连接池名称
        DynamicDbSource.set(dbEntity.getPoolName());
        return myDb3Dao.findAll();
    }

    @TargetDataSource
    public List<MyDb3> findAllById() {
        return myDb3Dao.findAllById();
    }


}
