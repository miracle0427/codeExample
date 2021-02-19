package com.bjsxt.service.impl;

import org.apache.ibatis.session.SqlSession;

import com.bjsxt.mapper.LogMapper;
import com.bjsxt.pojo.Log;
import com.bjsxt.service.LogService;
import com.bjsxt.util.MyBatisUtil;

public class LogServiceImpl implements LogService{

	@Override
	public int ins(Log log) {
		SqlSession session = MyBatisUtil.getSession();
		LogMapper mapper = session.getMapper(LogMapper.class);
		return mapper.ins(log);
	}

}
