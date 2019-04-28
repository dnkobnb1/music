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
}
