package com.music.mapper;

import com.music.pojo.User;

public interface UserMapper {
     User login(User user);
     void register(User user);
}
