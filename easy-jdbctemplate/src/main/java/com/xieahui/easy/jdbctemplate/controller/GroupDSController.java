package com.xieahui.easy.jdbctemplate.controller;

import com.xieahui.easy.jdbctemplate.entity.MyDb3;
import com.xieahui.easy.jdbctemplate.service.GroupDSService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 分组数据源演示-实例
 * Created by xiehui1956(@)gmail.com on 2020/8/3
 */
@RestController
@RequestMapping("/gds")
public class GroupDSController {

    @Resource
    private GroupDSService groupDSService;

    /**
     * 注解指定
     *
     * @return
     */
    @GetMapping("/findAll")
    public List<MyDb3> findAll() {
        return groupDSService.findAll();
    }

    /**
     * 业务指定
     *
     * @param id
     * @return
     */
    @GetMapping("/findById")
    public List<MyDb3> findById(int id) {
        return groupDSService.findById(id);
    }
}
