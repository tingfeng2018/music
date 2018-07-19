package com.sc.entity;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 14:18
 * @Description:专辑
 */
public class Album {
    private Integer id;
    private String name;

    public Album() {
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
        return "Album{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
