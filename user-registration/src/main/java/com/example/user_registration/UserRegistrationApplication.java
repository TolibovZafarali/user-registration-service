package com.example.user_registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UserRegistrationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(UserRegistrationApplication.class, args);
		var userService = context.getBean(UserService.class);
		userService.registerUser(new User(1L, "gmail@gmail.com", "yes", "Ali"));

	}

}
