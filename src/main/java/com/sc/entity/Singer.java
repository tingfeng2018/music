package com.sc.entity;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 14:16
 * @Description:
 */
public class Singer {
    private Integer id;
    private String name;
    private Style style;

    public Singer() {
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

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", style=" + style +
                '}';
    }
}
