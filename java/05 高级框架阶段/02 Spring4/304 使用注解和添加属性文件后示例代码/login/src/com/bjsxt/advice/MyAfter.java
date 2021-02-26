package com.bjsxt.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

import com.bjsxt.pojo.Users;

public class MyAfter implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		
		Logger logger = Logger.getLogger(MyAfter.class);
		Users users = (Users) arg2[0];
		if(arg0!=null){
			logger.info(users.getUsername()+"登录成功!");
		}else{
			logger.info(users.getUsername()+"登录失败!");
		}
	}

}
