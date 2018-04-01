package com.joker.mvp.bean;

/**
 * User
 *
 * @author joker
 * @date 2018/3/30
 */
public class User {
    String name;
    String pwd;

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
