package org.example.service;

import org.example.dao.UserDao;
import org.example.entities.User;

public class UserService {

    private UserDao userDao;

    public UserService() {
        this.userDao = UserDao.getInstance();
    }


    public void createUser(String name, String phoneNumber){

        User user = new User(name,phoneNumber);

        userDao.getUserMap().put(user.getName(), user);

        System.out.println("user created successfully" + user.getName());
    }


    public User getUser(String uName) {

        if(userDao.getUserMap().containsKey(uName)){
            return userDao.getUserMap().get(uName);
        }

        //throw new Exception("user not found");

        return null;
    }
}
