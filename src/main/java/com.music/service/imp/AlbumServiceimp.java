package com.music.service.imp;

import com.music.mapper.AlbumMapper;
import com.music.pojo.Album;
import com.music.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceimp implements AlbumService {
    @Autowired
    AlbumMapper albumMapper;

    public List<Album> load_index_album() {
        return albumMapper.load_index_album();
    }

    public int select_sum_album(int songer_id) {
        return albumMapper.select_sum_album(songer_id);
    }

    public Album selectSinglealbum(int album_id){
        return albumMapper.selectSinglealbum(album_id);
    }
}
