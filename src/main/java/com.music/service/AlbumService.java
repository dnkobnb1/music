package com.music.service;

import com.music.pojo.Album;

import java.util.List;

public interface AlbumService {
    List<Album> load_index_album();
    int select_sum_album(int songer_id);
}
