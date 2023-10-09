package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.DAO.userDAO;
import com.spring.model.User;


@Service
public class userService {
	
	@Autowired
	private userDAO user;
	
	public int createUser(User user) {
		return this.user.saveUser(user);
		
	}

}
