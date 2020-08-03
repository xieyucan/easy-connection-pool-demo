package com.xieahui.easy.jdbctemplate.service;

import com.xieahui.easy.jdbctemplate.dao.GroupDSDao;
import com.xieahui.easy.jdbctemplate.entity.MyDb3;
import com.xieahui.springboot.annotation.TargetDataSource;
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

    @TargetDataSource(groupName = "db_group")
    public List<MyDb3> findAll() {
        return groupDSDao.findAll();
    }
}
