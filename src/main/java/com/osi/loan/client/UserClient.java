package com.osi.loan.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.osi.loan.domain.User;
import com.osi.loan.service.UserService;

public class UserClient {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("user-config.xml");
		UserService userService = (UserService) appContext.getBean("userService");

		User user1 = new User();
		user1.setUserName("AXN1");
		user1.setMobile("555-555-555");
		user1.setEmail("axn@abc.com");
		user1.setPassword("12300");
		user1.setUserType("Premium");
		userService.addUser(user1);
		
		//userService.findUser(user1);

	}

}
