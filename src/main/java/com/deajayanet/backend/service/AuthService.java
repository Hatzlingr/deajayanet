package com.deajayanet.backend.service;

import com.deajayanet.backend.dao.user.UserDao;
import com.deajayanet.backend.model.user.User;

public class AuthService {
    private UserDao userDao;

    public AuthService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User login(String username, String password) {
        User user = userDao.getUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
