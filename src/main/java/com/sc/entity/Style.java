package com.sc.entity;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 14:17
 * @Description: 歌手类型
 */
public class Style {
    private Integer id;
    private String name;

    public Style() {
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
        return "Style{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
