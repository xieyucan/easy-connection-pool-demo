package com.xieahui.easy.mybatis.service;

import com.xieahui.easy.mybatis.dao.UserMapper;
import com.xieahui.easy.mybatis.entity.Db1UserEntity;
import com.xieahui.springboot.annotation.TargetDataSource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/13
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 指定连接池
     *
     * @return
     */
    @TargetDataSource("db1")
    public List<Db1UserEntity> findAll() {
        return userMapper.findAll();
    }

    /**
     * 指定连接池
     *
     * @param entity
     * @return
     */
    @TargetDataSource("db1")
    public int save(Db1UserEntity entity) {
        return userMapper.save(entity);
    }
}
