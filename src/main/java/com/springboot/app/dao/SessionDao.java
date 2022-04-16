package com.springboot.app.dao;

import java.util.List;

import com.springboot.app.model.Session;

public interface SessionDao {

	void addDummySessions();

	List<Session> getAllSessions();
}
