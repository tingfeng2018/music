package com.sc.entity;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 09:41
 * @Description:
 */
public class Demo {

    private Integer id;
    private String name;

    public Demo() {
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
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
