package com.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.dao.SessionDao;
import com.springboot.app.model.Session;

@Service
public class SessionsService {

	@Autowired
	private SessionDao sessionDao;

	public List<Session> getSessions() {
		sessionDao.addDummySessions();
		return sessionDao.getAllSessions();
	}

}
