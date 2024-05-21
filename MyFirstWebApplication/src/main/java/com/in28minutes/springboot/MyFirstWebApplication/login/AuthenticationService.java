package com.in28minutes.springboot.MyFirstWebApplication.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean isAuthenticatedUser(String username, String password) {
		
		System.out.println(username);
		boolean isValidUsername = username.equalsIgnoreCase("omkar");
		boolean isValidPassword = password.equalsIgnoreCase("solunke");
		
		
		
		return isValidUsername && isValidPassword;
	}
}
