package com.example.RealTimeTicketingsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
