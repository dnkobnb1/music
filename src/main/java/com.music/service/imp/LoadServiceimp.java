package com.music.service.imp;

import com.music.pojo.Album;
import com.music.pojo.Music;
import com.music.pojo.MusicSheet;
import com.music.service.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class LoadServiceimp implements LoadService {

    @Autowired
    LoadMapper loadMapper;

    public Map<String,Object> load_index() {
        List<Music> musicList=loadMapper.load_index_song();
        List<Album> albumList=loadMapper.load_index_album();
        List<MusicSheet> musicSheets=loadMapper.load_index_musicsheet();
        Music[] styles=loadMapper.load_rank_style();
        Music[] hots=loadMapper.load_rank_hot();
        Music[] news=loadMapper.load_rank_new();
        Music[] eus=loadMapper.load_rank_eu();
        Music[] koreas=loadMapper.load_rank_korea();
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("musicList",musicList);
        map.put("albumList",albumList);
        map.put("musicsheetList",musicSheets);
        map.put("rank_style",styles);
        map.put("rank_hot",hots);
        map.put("rank_new",news);
        map.put("rank_eu",eus);
        map.put("rank_korea",koreas);
        return map;
    }
}
