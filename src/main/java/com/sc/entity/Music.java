package com.sc.entity;

import java.util.Date;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 14:12
 * @Description: 映射数据库音乐表
 */
public class Music {

    private Integer id;
    private String name;
    private Date createTime;
    private String musicUrl;
    private String musicImgUrl;
    private Category category;
    private Source source;
    private Singer singer;
    private Album album;

    public Music() {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMusicUrl() {
        return musicUrl;
    }

    public void setMusicUrl(String musicUrl) {
        this.musicUrl = musicUrl;
    }

    public String getMusicImgUrl() {
        return musicImgUrl;
    }

    public void setMusicImgUrl(String musicImgUrl) {
        this.musicImgUrl = musicImgUrl;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", musicUrl='" + musicUrl + '\'' +
                ", musicImgUrl='" + musicImgUrl + '\'' +
                ", category=" + category +
                ", source=" + source +
                ", singer=" + singer +
                ", album=" + album +
                '}';
    }
}
