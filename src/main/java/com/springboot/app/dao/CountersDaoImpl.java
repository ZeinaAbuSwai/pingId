package com.springboot.app.dao;

import org.springframework.stereotype.Repository;

import com.springboot.app.model.Counters;

@Repository
public class CountersDaoImpl implements CountersDao{

	@Override
	public Counters addDummyCounters() {
		return new Counters(150, 224, 22, 45);
	}

}
