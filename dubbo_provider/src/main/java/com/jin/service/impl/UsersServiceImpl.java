package com.jin.service.impl;

import com.jin.bean.Users;
import com.jin.dao.UsersDao;
import com.jin.service.UsersService;

import java.util.List;

/**
 * 高山仰之可及，深渊度之可测
 */
public class UsersServiceImpl implements UsersService {
    public List<Users> findUsers() {
        return UsersDao.getUsers();
    }
}
