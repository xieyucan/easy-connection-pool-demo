package com.xieahui.easy.jpa.service;

import com.xieahui.easy.jpa.dao.UserRepository;
import com.xieahui.easy.jpa.entity.Db1UserEntity;
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
    private UserRepository userRepository;

    /**
     * 指定连接池
     *
     * @return
     */
    @TargetDataSource("db1")
    public List<Db1UserEntity> findAll() {
        return userRepository.findAll();
    }

    /**
     * 指定连接池
     *
     * @param entity
     * @return
     */
    @TargetDataSource("db1")
    public void save(Db1UserEntity entity) {
        userRepository.save(entity);
    }
}
