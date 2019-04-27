package com.music.pojo;

public class Songer {
    private int songer_id;
    private String songer_name;
    private String songer_introduce;
    private String songer_img;

    public Songer(int songer_id, String songer_name, String songer_introduce, String songer_img) {
        this.songer_id = songer_id;
        this.songer_name = songer_name;
        this.songer_introduce = songer_introduce;
        this.songer_img = songer_img;
    }

    public Songer() {
    }

    @Override
    public String toString() {
        return "Songer{" +
                "songer_id=" + songer_id +
                ", songer_name='" + songer_name + '\'' +
                ", songer_introduce='" + songer_introduce + '\'' +
                ", songer_img='" + songer_img + '\'' +
                '}';
    }

    public int getSonger_id() {
        return songer_id;
    }

    public void setSonger_id(int songer_id) {
        this.songer_id = songer_id;
    }

    public String getSonger_name() {
        return songer_name;
    }

    public void setSonger_name(String songer_name) {
        this.songer_name = songer_name;
    }

    public String getSonger_introduce() {
        return songer_introduce;
    }

    public void setSonger_introduce(String songer_introduce) {
        this.songer_introduce = songer_introduce;
    }

    public String getSonger_img() {
        return songer_img;
    }

    public void setSonger_img(String songer_img) {
        this.songer_img = songer_img;
    }
}
