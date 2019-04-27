package com.music.service.imp;

import com.music.mapper.AlbumMapper;
import com.music.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceimp implements AlbumService {
    @Autowired
    AlbumMapper albumMapper;

}
