package com.example.userapi.service;

import com.example.userapi.entity.User;

public interface UserService {

    void adduser(User user);

    void deleteUser(long id);

    User getUser(long id);

    void updateUser();

}
