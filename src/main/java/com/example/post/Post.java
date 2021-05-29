package com.example.post;

import com.example.user.User;

public class Post {
    private String id;
    private String postdate;
    private String detales;
    private User user;

    public Post() {
    }

    public Post(String id, String postdate, String detales, User user) {
        this.id = id;
        this.postdate = postdate;
        this.detales = detales;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostdate() {
        return postdate;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    public String getDetales() {
        return detales;
    }

    public void setDetales(String detales) {
        this.detales = detales;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
