package com.lq.mapper;

import com.lq.pojo.User;

import java.util.List;

/**
 * 时间:14:38
 * 作者：Maibenben
 **/
public interface UserMapper {
    User userById(Integer id);

    /*
     * 插入user对象
     *
     */
    void userAdd(User user);

    List<User> getUserOrder();

    List<User> getUsers();
}
