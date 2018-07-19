package com.sc.dao;

import com.sc.entity.Album;
import org.springframework.stereotype.Repository;

/**
 * @Auther: hushuang
 * @Date: 2018/7/19 15:10
 * @Description:
 */
@Repository
public interface AlbumDao {

    Album getAlbums();

}
