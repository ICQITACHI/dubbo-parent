package com.jin.bean;

import java.io.Serializable;

/**
 * 高山仰之可及，深渊度之可测
 */
public class Users implements Serializable {

    private   int  id;
    private   String username;
    private String password;
    private   String email;
    public Users(){}

    public Users(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
