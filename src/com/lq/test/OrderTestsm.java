package com.lq.test;

import java.util.List;

import com.lq.mapper.OrderMapper;
import com.lq.pojo.Order;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class OrderTestsm {
	
	private ApplicationContext applicationContext;
	@Before
	public void init(){
		
	applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		
		
		
		
		
		
		
	}

	@Test
	public void testGetOrder(){
    OrderMapper orderDao=applicationContext.getBean(OrderMapper.class);
    System.out.println(orderDao.findOrder(3));
		
		
	}
	
	@Test
	public void testGetSomeOrder(){
	
		OrderMapper orderDao=applicationContext.getBean(OrderMapper.class);
		System.out.println(orderDao.findSomeOrder("1"));
		
	}
	
	@Test
	public void testGetOrderUser(){
	
	OrderMapper orderDao =applicationContext.getBean(OrderMapper.class);
   for(Order order:orderDao.getOrderUser()){
	   System.out.println("订单     "+order);
	   
	   System.out.println("用户                 "+order.getUser());
	   
   }


		
	}
	
}
