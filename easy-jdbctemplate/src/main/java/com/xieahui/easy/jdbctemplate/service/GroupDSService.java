package com.xieahui.easy.jdbctemplate.service;

import com.xieahui.easy.jdbctemplate.dao.GroupDSDao;
import com.xieahui.easy.jdbctemplate.dao.MyDb3Dao;
import com.xieahui.easy.jdbctemplate.entity.DbEntity;
import com.xieahui.easy.jdbctemplate.entity.MyDb3;
import com.xieahui.springboot.config.DynamicDbSource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiehui1956(@)gmail.com on 2020/8/3
 */
@Service
public class GroupDSService {

    @Resource
    private GroupDSDao groupDSDao;

    @Resource
    private MyDb3Dao myDb3Dao;

    public List<MyDb3> findAll(int id) {
        DbEntity dbEntity = myDb3Dao.findById(id);
        //设置连接池名称
        DynamicDbSource.setGroupName(dbEntity.getGroupName());

        return groupDSDao.findAll();
    }
}
