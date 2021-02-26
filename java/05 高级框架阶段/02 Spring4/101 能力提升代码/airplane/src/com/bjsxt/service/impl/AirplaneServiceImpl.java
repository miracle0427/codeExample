package com.bjsxt.service.impl;

import java.util.List;

import com.bjsxt.mapper.AirplaneMapper;
import com.bjsxt.pojo.Airplane;
import com.bjsxt.service.AirplaneService;
import com.bjsxt.util.MyBatisUtil;

public class AirplaneServiceImpl implements AirplaneService {

	@Override
	public List<Airplane> show(int takeid, int landid) {
		return MyBatisUtil.getSession().getMapper(AirplaneMapper.class).selByTakeidLandid(takeid, landid);
	}

}
