package com.chatRobot.controller;

import com.chatRobot.model.Users;
import com.chatRobot.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.Map;

/**
 * Created by admin on 2018/2/9.
 */
@Controller
@RequestMapping("/users")
public class UsersController {

    //注入Service
    @Autowired
    private IUsersService usersService;

    @RequestMapping("register")
    public String regist(HttpServletRequest request, HttpServletResponse response){

        System.out.println("用户注册：");

        Users users = new Users();
        users.setUsername(request.getParameter("username"));
        users.setPassword(request.getParameter("password"));
        usersService.register(users);
        Model model = new Model() {
            @Override
            public Model addAttribute(String s, Object o) {
                return null;
            }

            @Override
            public Model addAttribute(Object o) {
                return null;
            }

            @Override
            public Model addAllAttributes(Collection<?> collection) {
                return null;
            }

            @Override
            public Model addAllAttributes(Map<String, ?> map) {
                return null;
            }

            @Override
            public Model mergeAttributes(Map<String, ?> map) {
                return null;
            }

            @Override
            public boolean containsAttribute(String s) {
                return false;
            }

            @Override
            public Map<String, Object> asMap() {
                return null;
            }
        };
        model.addAttribute("msg", "注册成功");
        //注册成功后跳转success.jsp页面
        return "success";
    }

}
