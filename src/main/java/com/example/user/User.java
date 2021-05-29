package com.example.user;

import com.example.location.Location;

public class User {
    private String id;
    private String firsname;
    private String lastname;
    private String email;
    private Location locaion;

    public User() {
    }

    public User(String id, String firsname, String lastname, String email, Location  locaion) {
        this.id = id;
        this.firsname = firsname;
        this.lastname = lastname;
        this.email = email;
        this.locaion = locaion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirsname() {
        return firsname;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Location getLocaion() {
        return locaion;
    }

    public void setLocaion(Location locaion) {
        this.locaion = locaion;
    }
}
