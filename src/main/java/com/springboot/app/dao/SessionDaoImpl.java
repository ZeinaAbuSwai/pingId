package com.springboot.app.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.app.model.Session;
import com.springboot.app.service.SessionFlag;

@Repository
public class SessionDaoImpl implements SessionDao{

	private static List<Session> DB = new ArrayList<>();
	
	@Override
	public void addDummySessions() {
		DB.add(new Session(0, "123454321abcde-54321dcba", "frankE",
				new ArrayList<SessionFlag>(Arrays.asList(SessionFlag.FRAUD, SessionFlag.EMULATOR))));
		DB.add(new Session(3, "956875982rtgvf-58711ccbd", "smith123",
				new ArrayList<SessionFlag>(Arrays.asList(SessionFlag.AUTHENTICATED))));
	}

	@Override
	public List<Session> getAllSessions() {
		return DB;
	}

}
