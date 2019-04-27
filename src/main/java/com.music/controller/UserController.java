package com.music.controller;

import com.music.pojo.Msg;
import com.music.pojo.User;
import com.music.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public Msg login(@RequestBody User user, HttpSession session) {
        User loginuser=userService.login(user);
        Msg msg;
        if(loginuser!=null)
        {
            msg=Msg.success("登录成功");
            session.setAttribute("user",loginuser);
            msg.getMap().put("user",loginuser);
        }
        else msg=Msg.error("用户名或密码错误");
        return msg;
    }

    @RequestMapping("islogin")
    public Msg isLogin(HttpSession session){
        Msg msg;
        if(session.getAttribute("user")==null){
            msg=Msg.error("当前未登录");
        }else{
            Object user = session.getAttribute("user");
            msg=Msg.success("当前已登录");
            msg.getMap().put("user",(User)user);
        }
        return msg;
    }

    @RequestMapping("exit")
    public Msg exit(HttpSession session){
        if(session.getAttribute("user")!=null)
        session.removeAttribute("user");
        return Msg.success("退出成功");
    }

    @RequestMapping("register")
    public Msg register(@Valid @RequestBody User user, Errors error){
        Msg msg=Msg.error("注册失败");
        if(error.hasErrors())return msg;
        try {
            userService.register(user);
            msg=Msg.success("注册成功");
        }catch (Exception e){
            e.printStackTrace();
        }
        return msg;
    }
}
