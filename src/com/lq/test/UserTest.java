package com.lq.test;

import java.util.List;

import com.lq.mapper.UserMapper;
import com.lq.pojo.Order;
import com.lq.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class UserTest {
	private ApplicationContext applicationContext;
	@Before
	public void init(){
		
	applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		
		
		
		
		
		
		
	}
	@Test
	public void testGetUserOrder(){
		UserMapper userDao=applicationContext.getBean(UserMapper.class);
		List<User> list=userDao.getUserOrder();
		
		for(User user:list){
			System.out.println("用户 "+user);
			
			for(Order order:user.getOrders()){
				if(order.getId()!=null){
				System.out.println("订单："+order);
			}
			}
			
		}
		
		
	}
}
