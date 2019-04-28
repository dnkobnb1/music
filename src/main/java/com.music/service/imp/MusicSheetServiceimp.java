package com.music.service.imp;

import com.music.mapper.MusicSheetMapper;
import com.music.pojo.MusicSheet;
import com.music.service.MusicSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicSheetServiceimp implements MusicSheetService {
    @Autowired
    MusicSheetMapper musicSheetMapper;
    public List<MusicSheet> load_index_musicsheet() {
        return musicSheetMapper.load_index_musicsheet();
    }
}
