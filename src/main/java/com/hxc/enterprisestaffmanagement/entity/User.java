package com.hxc.enterprisestaffmanagement.entity;


public class User {
    private int user_id;
    private String username,password;
    private String newpw;

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", newpw='" + newpw + '\'' +
                '}';
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

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

    public String getNewpw() {
        return newpw;
    }

    public void setNewpw(String newpw) {
        this.newpw = newpw;
    }

    public User(int user_id, String username, String password) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public User(String username, String password, String newpw) {
        this.username = username;
        this.password = password;
        this.newpw = newpw;
    }

    public User(int user_id, String username, String password, String newpw) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.newpw = newpw;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
