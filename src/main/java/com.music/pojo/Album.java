package com.music.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

public class Album {
    private int album_id;
    private String album_name;
    private Date album_release;
    private Songer songer;
    private String corporation;
    private String album_img;

    public Album() {
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getAlbum_release() {
        return album_release;
    }

    public void setAlbum_release(Date album_release) {
        this.album_release = album_release;
    }

    public Songer getSonger() {
        return songer;
    }

    public void setSonger(Songer songer) {
        this.songer = songer;
    }

    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation;
    }

    public String getAlbum_img() {
        return album_img;
    }

    public void setAlbum_img(String album_img) {
        this.album_img = album_img;
    }
}
