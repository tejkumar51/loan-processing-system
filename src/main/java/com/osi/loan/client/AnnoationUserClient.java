package com.osi.loan.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.osi.loan.configuration.UserConfiguration;
import com.osi.loan.domain.User;
import com.osi.loan.service.UserService;

public class AnnoationUserClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext aCtx = new AnnotationConfigApplicationContext(UserConfiguration.class);
		UserService userService = aCtx.getBean(UserService.class);
		User user = userService.findByUserName("AXN");
		System.out.println("User Found " + user.getUserId());

		User user1 = new User();
		user1.setUserName("AXN6");
		user1.setMobile("555-555-555");
		user1.setEmail("axn@abc.com");
		user1.setPassword("12300");
		user1.setUserType("Premium");
		userService.addUser(user1);
	}

}
