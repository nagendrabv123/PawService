package com.pawUser.PawUser.service;

import com.pawUser.PawUser.controller.UserController;
import com.pawUser.PawUser.dao.UserDao;
import com.pawUser.PawUser.model.Paw;
import com.pawUser.PawUser.model.User;
import com.pawUser.PawUser.pawconfig.PawServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserController {

    @Autowired
    UserDao userDao;

    @Autowired
    PawServiceConfig pawServiceConfig;

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User addUser(User user) {
        return userDao.save(user);
    }

    @Override
    public Optional<User> getUserById(int userId) {
        return userDao.findById(userId);
    }

    @Override
    public List<Paw> getAllPaws() {
        return pawServiceConfig.getAllPaws();
    }
}
