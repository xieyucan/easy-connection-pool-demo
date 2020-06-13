package com.xieahui.easy.jpa.dao;

import com.xieahui.easy.jpa.entity.Db1UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/13
 */
public interface UserRepository extends JpaRepository<Db1UserEntity, Long> {

}
