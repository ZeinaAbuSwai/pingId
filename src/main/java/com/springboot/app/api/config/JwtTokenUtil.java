package com.springboot.app.api.config;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.springboot.app.model.User;

import io.jsonwebtoken.Jwts;

@Component
public class JwtTokenUtil {

	public String generateToken(User user) {
		return Jwts.builder().setSubject(user.getUserName()).setIssuedAt(new Date(System.currentTimeMillis()))
				.compact();
	}

}