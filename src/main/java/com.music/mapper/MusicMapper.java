package com.music.mapper;

import com.music.pojo.Music;

import java.util.List;

public interface MusicMapper {
    Music[] load_rank_style();
    Music[] load_rank_hot();
    Music[] load_rank_new();
    Music[] load_rank_eu();
    Music[] load_rank_korea();
    List<Music> load_index_song();
}
