package com.bjsxt.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bjsxt.mapper.AirportMapper;
import com.bjsxt.pojo.Airport;
import com.bjsxt.service.AirportService;
import com.bjsxt.util.MyBatisUtil;

public class AirportServiceImpl implements AirportService{

	@Override
	public List<Airport> showTakePort() {
		SqlSession session = MyBatisUtil.getSession();
		AirportMapper airportMapper = session.getMapper(AirportMapper.class);
		return airportMapper.selTakePort();
	}

	@Override
	public List<Airport> showLandPort() {
		SqlSession session = MyBatisUtil.getSession();
		AirportMapper airportMapper = session.getMapper(AirportMapper.class);
		return airportMapper.selLandPort();
	}

}
