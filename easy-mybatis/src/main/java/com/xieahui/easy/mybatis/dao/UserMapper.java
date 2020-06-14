package com.xieahui.easy.mybatis.dao;

import com.xieahui.easy.mybatis.entity.Db1UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/13
 */
@Mapper
public interface UserMapper {

    @Select("select id, name, sex from user")
    List<Db1UserEntity> findAll();

    @Insert("insert into user(id, name, sex) value(#{entity.id}, #{entity.name}, #{entity.sex})")
    int save(@Param("entity") Db1UserEntity entity);
}
