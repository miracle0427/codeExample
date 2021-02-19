package com.bjsxt.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bjsxt.mapper.LogMapper;
import com.bjsxt.pojo.Log;


public class Test {
	public static void main(String[] args) throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		
		
		/*
		 * 接口,为什么能实例化?
		 * 
		 * 需要给接口一个实例化对象.
		 * 
		 * 使用的JDK的动态代理设计模式.
		 * 面向接口的代理设计模式(必须有接口)
		 * 
		 */
//		LogMapper logMapper = session.getMapper(LogMapper.class);
//		List<Log> list = logMapper.selAll();
//		for (Log log : list) {
//			System.out.println(log);
//		}
		
		
		LogMapper logMapper = session.getMapper(LogMapper.class);
		List<Log> list = logMapper.selByAccInAccout("3", "1");
		for (Log log : list) {
			System.out.println(log);
		}
		
		session.close();
		System.out.println("程序执行结束");
	}
}
