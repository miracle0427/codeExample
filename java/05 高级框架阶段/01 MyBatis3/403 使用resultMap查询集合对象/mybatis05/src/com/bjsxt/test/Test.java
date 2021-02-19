package com.bjsxt.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bjsxt.pojo.Teacher;


public class Test {
	public static void main(String[] args) throws IOException {
		
		
		
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		
		
		List<Teacher> list = session.selectList("com.bjsxt.mapper.TeacherMapper.selAll1");
		for (Teacher teacher : list) {
			System.out.println(teacher);
		}
//		System.out.println(list);
		
		session.close();
		System.out.println("程序执行结束");
	}
}
