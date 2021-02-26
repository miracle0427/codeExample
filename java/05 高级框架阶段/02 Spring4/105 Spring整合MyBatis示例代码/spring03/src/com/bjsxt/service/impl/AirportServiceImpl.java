package com.bjsxt.service.impl;

import java.util.List;

import com.bjsxt.mapper.AirportMapper;
import com.bjsxt.pojo.Airport;
import com.bjsxt.service.AirportService;

public class AirportServiceImpl implements AirportService {
	private AirportMapper airportMapper;
	
	
	public AirportMapper getAirportMapper() {
		return airportMapper;
	}

	public void setAirportMapper(AirportMapper airportMapper) {
		this.airportMapper = airportMapper;
	}

	@Override
	public List<Airport> show() {
		return airportMapper.selAll();
	}
}
