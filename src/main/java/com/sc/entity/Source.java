package com.sc.entity;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 14:16
 * @Description:
 */
public class Source {
    private Integer id;
    private String name;

    public Source() {
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
        return "Source{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
