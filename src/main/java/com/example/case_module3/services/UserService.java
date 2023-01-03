package com.example.case_module3.services;

import com.example.case_module3.dao.UserDao;
import com.example.case_module3.models.User;

import java.util.List;

public class UserService {
    public static List<User> users = UserDao.getInstance().selectAll();

    public void Add(User user) {
        UserDao.getInstance().insert(user);
        users = UserDao.getInstance().selectAll();
    }

    public void Delete(int id) {
        UserDao.getInstance().delete(id);
        users = UserDao.getInstance().selectAll();
    }

    public void Edit() {
        UserDao.getInstance().update(UserDao.getInstance().selectById());
        users = UserDao.getInstance().selectAll();
    }
}
