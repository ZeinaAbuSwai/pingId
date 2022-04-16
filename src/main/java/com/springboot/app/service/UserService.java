package com.springboot.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.api.config.JwtTokenUtil;
import com.springboot.app.dao.UserDao;
import com.springboot.app.model.User;
import com.springboot.app.model.UserType;

@Service
public class UserService {

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private UserDao userDao;
	
	public String authUser(User user) {
		return jwtTokenUtil.generateToken(user);
	}

	public void addToken(String userName, String token) {
		User user = userDao.getUser(userName).get();
		userDao.addUserToken(user, token);
	}
	
	public UserType getUserTypeByToken(String token) {
		return userDao.getUserTypeByToken(token);
	}
}
