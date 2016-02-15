package com.stepan.domain;

import java.util.Date;

/**
 * Created by Michal on 15.2.2016.
 */
public class Account {

    private final Date created;
    private String username;
    private final String pwd;

    public Account(String username, String pwd) {
        this.created = new Date();
        this.username = username;
        this.pwd = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }
}
