package com.chatRobot.dao;


import com.chatRobot.model.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by admin on 2018/2/9.
 */

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UsersMapperTest {

    @Autowired
    private UsersMapper usersMapper;



    @Test
    public void testSelectUser() throws Exception {
        long id = 1;
        Users users = usersMapper.selectByPrimaryKey(1);
        System.out.println(users.getUsername());
    }

    @Test
    public void testInsertUser() throws Exception {

        Users users = new Users();
        users.setUsername("haha");
        users.setPassword("123456");

        int result =  usersMapper.insert(users);

        System.out.println("result is "+result);
    }

    @Test
    public void testUpdateUser() throws Exception {

        Users users = new Users();
        users.setId(1);
        users.setUsername("kobe");
        users.setPassword("123456");

        int result =  usersMapper.updateByPrimaryKey(users);

        System.out.println("result is "+result);
    }

}
