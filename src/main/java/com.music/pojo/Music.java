package com.music.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;
import java.sql.Time;

public class Music {
    private int music_id;
    private String music_name;
    private Songer songer;
    private Album album;
    private String corporation;
    private String music_img;
    private Date releasedate;
    private Time duration;
    private long volume_week;
    private long volume_total;
    private String area;
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Music() {
    }

    public int getMusic_id() {
        return music_id;
    }

    public void setMusic_id(int music_id) {
        this.music_id = music_id;
    }

    public String getMusic_name() {
        return music_name;
    }

    public void setMusic_name(String music_name) {
        this.music_name = music_name;
    }

    public Songer getSonger() {
        return songer;
    }

    public void setSonger(Songer songer) {
        this.songer = songer;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation;
    }

    public String getMusic_img() {
        return music_img;
    }

    public void setMusic_img(String music_img) {
        this.music_img = music_img;
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    @JsonFormat(pattern = "HH:mm:ss",timezone = "GMT+8")
    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public long getVolume_week() {
        return volume_week;
    }

    public void setVolume_week(long volume_week) {
        this.volume_week = volume_week;
    }

    public long getVolume_total() {
        return volume_total;
    }

    public void setVolume_total(long volume_total) {
        this.volume_total = volume_total;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
