package com.springboot.app.dao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.springboot.app.model.User;
import com.springboot.app.model.UserType;

@Repository
public class UserDaoImpl implements UserDao {

	private HashMap<String, User> userTokens = new HashMap<>();
	private Set<User> users = new HashSet<User>() {
		{
			add(new User("user_a", "psw_a", UserType.USER));
			add(new User("user_b", "psw_b", UserType.USER));
			add(new User("user_c", "psw_c", UserType.USER));
			add(new User("user_d", "psw_d", UserType.ADMIN));
			add(new User("user_e", "psw_e", UserType.ADMIN));
		}
	};

	@Override
	public void addUserToken(User user, String token) {
		userTokens.put(token, user);
	}

	@Override
	public Optional<User> getUser(String userName) {
		return users.stream().filter(u -> u.getUserName().equals(userName)).findAny();
	}

	@Override
	public UserType getUserTypeByToken(String token) {
		return userTokens.get(token) != null ? userTokens.get(token).getType() : null;
	}

}
