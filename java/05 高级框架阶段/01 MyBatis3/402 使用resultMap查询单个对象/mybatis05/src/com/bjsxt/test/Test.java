package com.bjsxt.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bjsxt.pojo.Student;


public class Test {
	public static void main(String[] args) throws IOException {
		
		
		
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		
		
		List<Student> list = session.selectList("com.bjsxt.mapper.StudentMapper.selAll1");
		System.out.println(list);
		
		session.close();
		System.out.println("程序执行结束");
	}
}
