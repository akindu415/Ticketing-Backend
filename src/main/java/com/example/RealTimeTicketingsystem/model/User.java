package com.example.RealTimeTicketingsystem.model;

public class User {
    private int id;
    private String username;
//    type of user (vendor or customer)
    private String usertype;

    public User(int id,String username,String usertype){
        this.id = id;
        this.username =username;
        this.usertype =usertype;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
}
