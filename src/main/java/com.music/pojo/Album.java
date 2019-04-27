package com.music.pojo;

import java.sql.Date;

public class Album {
    private int album_id;
    private String album_name;
    private Date album_rease;
    private Songer songer;
    private String corporation;
    private String album_img;

    public Album() {
    }

    public int getAlbum_id() {
        return album_id;
    }

    public Songer getSonger() {
        return songer;
    }

    public void setSonger(Songer songer) {
        this.songer = songer;
    }

    public Album(int album_id, String album_name, Date album_rease, Songer songer, String corporation, String album_img) {
        this.album_id = album_id;
        this.album_name = album_name;
        this.album_rease = album_rease;
        this.songer = songer;
        this.corporation = corporation;
        this.album_img = album_img;
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

    public Date getAlbum_rease() {
        return album_rease;
    }

    public void setAlbum_rease(Date album_rease) {
        this.album_rease = album_rease;
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
