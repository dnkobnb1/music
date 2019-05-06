package com.music.service;

import com.music.pojo.Music;

import java.util.List;

public interface MusicService {
    List<Music> load_index_song();
    Music[] load_rank_style();
    Music[] load_rank_hot();
    Music[] load_rank_new();
    Music[] load_rank_eu();
    Music[] load_rank_korea();
    Music select_singlesong(int music_id);
}
