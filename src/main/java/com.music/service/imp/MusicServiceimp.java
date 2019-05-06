package com.music.service.imp;

import com.music.mapper.MusicMapper;
import com.music.pojo.Music;
import com.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceimp implements MusicService {
    @Autowired
    MusicMapper musicMapper;
    public List<Music> load_index_song() {
        return musicMapper.load_index_song();
    }

    public Music[] load_rank_style() {
        return musicMapper.load_rank_style();
    }

    public Music[] load_rank_hot() {
        return musicMapper.load_rank_hot();
    }

    public Music[] load_rank_new() {
        return musicMapper.load_rank_new();
    }

    public Music[] load_rank_eu() {
        return musicMapper.load_rank_eu();
    }

    public Music[] load_rank_korea() {
        return musicMapper.load_rank_korea();
    }

    public Music select_singlesong(int music_id) {
        return musicMapper.select_singlesong(music_id);
    }
}
