package com.jin.dao;

import com.jin.bean.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * 高山仰之可及，深渊度之可测
 */
public class UsersDao {

    static List<Users> users = null;

    static {
        users = new ArrayList<Users>();
        for (int i = 0; i < 10; i++) {
            users.add(new Users(i+1,"老王"+i,"icq","laowang@qq.com"));

        }
    }

    public static List<Users> getUsers(){
        return users;
    }

}
