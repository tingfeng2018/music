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

    /**
     * 根据专辑Id获取专辑信息
     * @param id
     * @return
     */
    Album getAlbumById(Integer id);

}
