package com.music.service;

import com.music.pojo.User;
import org.springframework.stereotype.Service;


public interface UserService {
     User login(User user);
     void register(User user);
}
