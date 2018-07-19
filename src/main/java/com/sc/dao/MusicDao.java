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


}
