package com.springboot.app.dao;

import java.util.Optional;

import com.springboot.app.model.User;
import com.springboot.app.model.UserType;

public interface UserDao {

	void addUserToken(User user, String token);
	
	Optional<User> getUser(String userName);
	
	UserType getUserTypeByToken(String token);
	
}
