package com.music.pojo;

import java.sql.Date;
import java.sql.Time;

public class Music {
    private int music_id;
    private String music_name;
    private Songer songer;
    private int album_id;
    private String corporation;
    private String music_img;
    private Date releasedate;
    private Time duration;
    private long volume_week;
    private long volume_total;
    private String area;


    public Music() {
    }

    public Music(int music_id, String music_name, Songer songer, int album_id, String corporation, String music_img, Date releasedate, Time duration, long volume_week, long volume_total, String area) {
        this.music_id = music_id;
        this.music_name = music_name;
        this.songer = songer;
        this.album_id = album_id;
        this.corporation = corporation;
        this.music_img = music_img;
        this.releasedate = releasedate;
        this.duration = duration;
        this.volume_week = volume_week;
        this.volume_total = volume_total;
        this.area = area;
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

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
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

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

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
