package com.music.mapper;


import com.music.pojo.Album;
import com.music.pojo.Music;
import com.music.pojo.MusicSheet;

import java.util.List;
import java.util.Map;

public interface LoadMapper {
    List<Music> load_index_song();
    List<Album> load_index_album();
    List<MusicSheet> load_index_musicsheet();
    Music[] load_rank_style();
    Music[] load_rank_hot();
    Music[] load_rank_new();
    Music[] load_rank_eu();
    Music[] load_rank_korea();
}
