package com.music.service.imp;

import com.music.mapper.SongerMapper;
import com.music.pojo.Songer;
import com.music.service.SongerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongerServiceimp implements SongerService {
    @Autowired
    SongerMapper songerMapper;

    public Songer select_singlesonger(int songer_id) {
        return songerMapper.select_singlesonger(songer_id);
    }
}
