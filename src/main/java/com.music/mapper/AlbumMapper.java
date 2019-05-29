package com.music.mapper;

import com.music.pojo.Album;

import java.util.List;

public interface AlbumMapper {
    List<Album> load_index_album();
    int select_sum_album(int songer_id);
    Album selectSinglealbum(int album_id);
}
