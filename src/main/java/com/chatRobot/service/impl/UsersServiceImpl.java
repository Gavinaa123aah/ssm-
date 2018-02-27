package com.chatRobot.service.impl;

import com.chatRobot.dao.UsersMapper;
import com.chatRobot.model.Users;
import com.chatRobot.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2018/2/9.
 */
@Service
public class UsersServiceImpl implements IUsersService{

    @Autowired
    UsersMapper usersMapper;

    @Override
    public void login(Users users) {


    }

    @Override
    public void register(Users users) {

        int result = usersMapper.insert(users);


    }
}
