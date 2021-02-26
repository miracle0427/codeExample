package com.bjsxt.service.impl;

import javax.annotation.Resource;

import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	@Value("${my.demo}")
	private String test;
	@Value("${my.demo1}")
	private int test1;
	@Resource
	private UsersMapper usersMapper;
	
	
	
	@Override
	public Users login(Users users) {
		System.out.println("输出:"+test+"  "+test1);
		
		return usersMapper.selByUsers(users);
	}

}
