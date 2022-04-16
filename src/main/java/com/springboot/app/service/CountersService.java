package com.springboot.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.dao.CountersDao;
import com.springboot.app.model.Counters;

@Service
public class CountersService {

	@Autowired
	private CountersDao countersDao;
	
	public Counters getCounters() {
		return countersDao.addDummyCounters();
	}

}