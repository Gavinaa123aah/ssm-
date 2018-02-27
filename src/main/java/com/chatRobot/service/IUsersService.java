package com.chatRobot.service;

import com.chatRobot.model.Users;

/**
 * Created by admin on 2018/2/9.
 */
public interface IUsersService {

    void login(Users users);
    void register(Users users);
}
