package com.sc.dao;

import com.sc.entity.Singer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 14:40
 * @Description:
 */
@Repository
public interface SingerDao {


    /**
     * 添加歌手
     * @param singer
     */
    void addSinger(Singer singer);

    /**
     * 更新歌手
     * @param singer
     */
    void updateSinger(Singer singer);

    /**
     * 根据ID删除歌手信息
     * @param id
     */
    void deleteSingerById(Integer id);

    /**
     * 根据ID查询歌手信息
     * @param id
     * @return
     */
    Singer getSingerById(Integer id);

    /**
     * 获取歌手列表
     * @return
     */
    List<Singer> getSingers();


}
