package com.springboot.app.model;

import java.util.List;

import com.springboot.app.service.SessionFlag;

public class Session {

	private int ordinal;
	private String sessionId;
	private String username;
	private List<SessionFlag> sessionFlags;

	public Session(int ordinal, String sessionId, 
			String username, List<SessionFlag> sessionFlags) {
		this.ordinal = ordinal;
		this.sessionId = sessionId;
		this.username = username;
		this.sessionFlags = sessionFlags;
	}

	public int getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<SessionFlag> getSessionFlags() {
		return sessionFlags;
	}

	public void setSessionFlags(List<SessionFlag> sessionFlags) {
		this.sessionFlags = sessionFlags;
	}

}
