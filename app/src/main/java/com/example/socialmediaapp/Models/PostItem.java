package com.example.socialmediaapp.Models;

public class PostItem {

    int img_post;
    int img_user;
    String txt_username;
    String txt_time;


    public PostItem(int img_post, int img_user, String txt_username, String txt_time) {
        this.img_post = img_post;
        this.img_user = img_user;
        this.txt_username = txt_username;
        this.txt_time = txt_time;
    }


    public int getImg_post() {
        return img_post;
    }

    public void setImg_post(int img_post) {
        this.img_post = img_post;
    }

    public int getImg_user() {
        return img_user;
    }

    public void setImg_user(int img_user) {
        this.img_user = img_user;
    }

    public String getTxt_username() {
        return txt_username;
    }

    public void setTxt_username(String txt_username) {
        this.txt_username = txt_username;
    }

    public String getTxt_time() {
        return txt_time;
    }

    public void setTxt_time(String txt_time) {
        this.txt_time = txt_time;
    }
}
