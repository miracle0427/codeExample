package com.bjsxt.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bjsxt.mapper.EmpMapper;
import com.bjsxt.pojo.PageInfo;
import com.bjsxt.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	@Resource
	private EmpMapper empMapper;
	@Override
	public PageInfo show(int pageSize, int pageNumber) {
		PageInfo pi= new PageInfo();
		pi.setPageNumber(pageNumber);
		pi.setPageSize(pageSize);
		pi.setList(empMapper.selByPage(pageSize*(pageNumber-1), pageSize));
		long count = empMapper.selCount();
		pi.setTotal(count%pageSize==0?count/pageSize:count/pageSize+1);
		return pi;
	}

}
