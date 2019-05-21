package com.lq.mapper;

import com.lq.pojo.Order;

import java.util.List;

/**
 * 时间:14:39
 * 作者：Maibenben
 **/

public interface OrderMapper {

    Order findOrder(Integer id);
    List<Order> findSomeOrder(String like);
    List<Order> getOrderUser();
}
