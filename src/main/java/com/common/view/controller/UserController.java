package com.common.view.controller;

import com.common.domain.User;
import com.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 12-12-27
 * Time: 下午4:14
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/manage/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/list")
    public String listUser(Model model){
        //方法一：Springh jpa的实现
//        List<User> users = userService.list();

        //方法二:spring jdbcTemplate的实现
        List<User> users = userService.customList();
        model.addAttribute("userList",users);
        return "user";
    }

}
