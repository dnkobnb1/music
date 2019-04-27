package com.music.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 前后端分离
 * 统一的返回格式
 * {
 *   "code": 200,
 *   "message": "success",
 *   "data": {}
 * }
 */
public class Msg implements Serializable {
    private int code;
    private String message;
    private Map<String,Object> data = new HashMap<String, Object>();

    public Msg(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 生成请求的返回的消息
     * @return
     */

    public static Msg success(String message){
        Msg result = new Msg(200,message);
        return result;
    }
    public static Msg error(String message){
        Msg result = new Msg(400,message);
        return result;
    }
    public Msg() {
    }

    @Override
    public String toString() {
        return "Msg{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", map=" + data +
                '}';
    }

    public Map<String, Object> getMap() {
        return data;
    }
}
