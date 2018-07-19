package com.sc.entity;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 14:15
 * @Description:映射数据库分类的实体类
 */
public class Category {
    private Integer id;
    private String name;

    public Category() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
