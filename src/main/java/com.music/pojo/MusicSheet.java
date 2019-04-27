package com.music.pojo;

public class MusicSheet {
    private int list_id;
    private String list_name;
    private User user;
    private String list_img;
    private int volume;
    private int collection;
    private String list_introduce;
    private int comment;

    public MusicSheet() {
    }

    public MusicSheet(int list_id, String list_name, User user, String list_img, int volume, int collection, String list_introduce, int comment) {
        this.list_id = list_id;
        this.list_name = list_name;
        this.user = user;
        this.list_img = list_img;
        this.volume = volume;
        this.collection = collection;
        this.list_introduce = list_introduce;
        this.comment = comment;
    }

    public int getList_id() {
        return list_id;
    }

    public void setList_id(int list_id) {
        this.list_id = list_id;
    }

    public String getList_name() {
        return list_name;
    }

    public void setList_name(String list_name) {
        this.list_name = list_name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getList_img() {
        return list_img;
    }

    public void setList_img(String list_img) {
        this.list_img = list_img;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }

    public String getList_introduce() {
        return list_introduce;
    }

    public void setList_introduce(String list_introduce) {
        this.list_introduce = list_introduce;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }
}
