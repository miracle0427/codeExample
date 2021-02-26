package com.bjsxt.service;

import java.util.List;

import com.bjsxt.pojo.Airplane;

public interface AirplaneService {
	List<Airplane> show(int takeid,int landid);
}
