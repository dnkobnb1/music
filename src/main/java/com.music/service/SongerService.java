package com.music.service;

import com.music.mapper.SongerMapper;
import com.music.pojo.Songer;

public interface SongerService {
    Songer select_singlesonger(int songer_id);
}
