package com.xieahui.easy.jdbctemplate.entity;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/13
 */
public class EasyPoolDemoStudentEntity {

    private long id;

    private String name;

    private String sex;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "EasyPoolDemoStudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
