package com.farani.mobile.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.farani.mobile.security.UserSS;

public class UserService {
	
	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception e) {
			return null;
		}
	}
}