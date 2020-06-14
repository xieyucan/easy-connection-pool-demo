package com.xieahui.easy.mybatis.dao;

import com.xieahui.easy.mybatis.entity.EasyPoolDemoStudentEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/13
 */
@Repository
public interface StudentMapper {

    List<EasyPoolDemoStudentEntity> findAll();

    int save(@Param("entity") EasyPoolDemoStudentEntity entity);
}
