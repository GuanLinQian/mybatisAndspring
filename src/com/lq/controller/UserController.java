package com.lq.controller;

import com.lq.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 时间:16:48
 * 作者：glq
 **/
@RequestMapping("/user")
@Controller
public class UserController {

    @Resource(name = "userMapper")
    private UserMapper userMapper;
    @RequestMapping("/userall")
    public String getAllUser(HttpServletRequest request){
        System.out.println("-------进入controller");
     request.setAttribute("list",userMapper.getUsers());

return "show";
    }
 }
