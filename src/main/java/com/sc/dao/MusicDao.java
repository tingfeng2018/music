package com.sc.dao;

import com.sc.entity.Music;
import org.springframework.stereotype.Repository;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 15:13
 * @Description:
 */
@Repository
public interface MusicDao {


    void addMusic(Music music);

    /**
     * 通过ID查询音乐详情
     * @param id
     * @return
     */
    Music getMusicById(Integer id);



}
