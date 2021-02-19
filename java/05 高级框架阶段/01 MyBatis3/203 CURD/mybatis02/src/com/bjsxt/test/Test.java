package com.bjsxt.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bjsxt.pojo.People;

public class Test {
	public static void main(String[] args) throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
//		People peo =new People();
//		peo.setId(1);
		//显示几个
//		int pageSize = 2;
		//第几页
//		int pageNumber = 2;
		//如果希望传递多个参数,可以使用对象或map
//		Map<String,Object> map = new HashMap<>();
//		map.put("pageSize", pageSize);
//		map.put("pageStart", pageSize*(pageNumber-1));
//		List<People> p = session.selectList("a.b.page",map);
//		System.out.println(p);
			/*People p = new People();
			p.setName("新增name1");
			p.setAge(88);
			try {
				int index = session.insert("a.b.ins", p);
				if(index>0){
					System.out.println("成功");
				}else{
					System.out.println("失败");
				}
			} catch (Exception e1) {
//				e1.printStackTrace();
				session.rollback();
			}
			p.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			try {
				int index1 = session.insert("a.b.ins", p);
				if(index1>0){
					System.out.println("成功");
				}else{
					System.out.println("失败");
				}
			} catch (Exception e) {
//				e.printStackTrace();
				session.rollback();
			}
			session.commit();*/
		
		/**
		 * 实现修改id=3的name=王五
		 * 
		 * 并输出执行结果
		 */
		People peo = new People();
		peo.setId(4);
		peo.setName("王五");
		int index = session.update("a.b.upd", peo);
		if(index>0){
			System.out.println("成功");
		}else{
			System.out.println("失败");
		}
		session.commit();
		
		/**
		 * 删除id=3的数据
		 */
//		int del = session.delete("a.b.del",3);
//		
//		if(del>0){
//			System.out.println("成功");
//		}else{
//			System.out.println("失败");
//		}
//		session.commit();
		
		session.close();
		System.out.println("程序执行结束");
	}
}
