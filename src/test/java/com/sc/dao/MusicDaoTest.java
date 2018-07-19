package com.sc.dao;

import com.sc.base.BaseTest;
import com.sc.entity.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 15:16
 * @Description:
 */
public class MusicDaoTest extends BaseTest {

    @Autowired
    private MusicDao musicDao;

    @Test
    public void addMusic() {

        Music music = new Music();
        music.setName("music01");
        music.setMusicUrl("music/李圣杰 - 痴心绝对.mp3");
        music.setMusicImgUrl("images/default.jpg");
        music.setCreateTime(new Date());
        Category category = new Category();
        category.setId(1000);
        music.setCategory(category);
        Source source = new Source();
        source.setId(1000);
        music.setSource(source);
        Singer singer = new Singer();
        singer.setId(1000);
        music.setSinger(singer);
        Album album = new Album();
        album.setId(1);
        music.setAlbum(album);

        musicDao.addMusic(music);

    }
}