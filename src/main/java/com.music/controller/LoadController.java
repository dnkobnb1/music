package com.music.controller;

import com.music.pojo.Album;
import com.music.pojo.Msg;
import com.music.pojo.Music;
import com.music.pojo.MusicSheet;
import com.music.service.AlbumService;
import com.music.service.MusicService;
import com.music.service.MusicSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/load")
public class LoadController {

    @Autowired
    MusicService musicService;
    @Autowired
    AlbumService albumService;
    @Autowired
    MusicSheetService musicSheetService;

    @RequestMapping("load_song")
    public Msg load_song(int music_id){
        Msg msg;
        try{
            Music music=musicService.select_singlesong(music_id);
            msg=Msg.success("加载成功!");
            msg.getMap().put("music",music);
        }catch (Exception e){
            msg=Msg.error("加载失败");
        }
        return msg;
    }

    @RequestMapping("index")
    public Msg load_index(){
        Msg msg;
        try {
            List<Music> musicList=musicService.load_index_song();
            List<Album> albumList=albumService.load_index_album();
            List<MusicSheet> musicSheets=musicSheetService.load_index_musicsheet();
            Music[] styles=musicService.load_rank_style();
            Music[] hots=musicService.load_rank_hot();
            Music[] news=musicService.load_rank_new();
            Music[] eus=musicService.load_rank_eu();
            Music[] koreas=musicService.load_rank_korea();
            Map<String,Object> map=new HashMap<String, Object>();
            map.put("musicList",musicList);
            map.put("albumList",albumList);
            map.put("musicsheetList",musicSheets);
            map.put("rank_style",styles);
            map.put("rank_hot",hots);
            map.put("rank_new",news);
            map.put("rank_eu",eus);
            map.put("rank_korea",koreas);
            msg=Msg.success("载入成功!");
            msg.setData(map);
        }catch (Exception e){
            msg=Msg.error("载入失败");
            e.printStackTrace();
        }
        return msg;
    }
}
