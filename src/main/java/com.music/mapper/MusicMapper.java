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
    Music select_singlesong(int music_id);
    int select_sum_song(int songer_id);
    List<Music> select_songer_song(int songer_id);
    List<Music> select_album_song(int album_id);
}
