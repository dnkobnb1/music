package com.music.controller;

import com.music.pojo.Msg;
import com.music.service.AlbumService;
import com.music.service.LoadService;
import com.music.service.MusicService;
import com.music.service.MusicSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("index")
    public Msg load_index(){
        Msg msg;
        try {
            Map<String, Object> indexMap= null;
            msg=Msg.success("载入成功!");
            msg.setData(indexMap);
        }catch (Exception e){
            msg=Msg.error("载入失败");
            e.printStackTrace();
        }
        return msg;
    }
}
