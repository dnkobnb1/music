package com.music.service.imp;

import com.music.mapper.UserMapper;
import com.music.pojo.User;
import com.music.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimp implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User login(User user) {
        return userMapper.login(user);
    }
    public void register(User user){
        userMapper.register(user);
    }
}
