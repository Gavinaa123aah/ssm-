package com.chatRobot.dao;

import com.chatRobot.model.User;

public interface IUserDao {

    User selectUser(long id);

}