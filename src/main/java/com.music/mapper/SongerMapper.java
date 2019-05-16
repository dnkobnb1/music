package com.music.mapper;

import com.music.pojo.Songer;

public interface SongerMapper {
    Songer select_singlesonger(int songer_id);
}
