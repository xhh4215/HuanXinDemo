package com.example.mvp_log.mvp.mvp.bean;

/**
 * Created by xh on 2017/11/7.
 * 数据bean
 */

public class User {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String password;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
