package com.springboot.app.model;

public class Counters {

	private int threats;
	private int total;
	private int authenticated;
	private int scored;

	public Counters(int threats, int total, int authenticated, int scored) {
		this.threats = threats;
		this.total = total;
		this.authenticated = authenticated;
		this.scored = scored;
	}

	public int getThreats() {
		return threats;
	}

	public void setThreats(int threats) {
		this.threats = threats;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(int authenticated) {
		this.authenticated = authenticated;
	}

	public int getScored() {
		return scored;
	}

	public void setScored(int scored) {
		this.scored = scored;
	}

}