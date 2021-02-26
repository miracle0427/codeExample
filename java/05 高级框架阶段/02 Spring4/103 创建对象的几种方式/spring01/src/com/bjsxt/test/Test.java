package com.bjsxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.pojo.People;
import com.bjsxt.pojo.PeopleFactory;

public class Test {
	public static void main(String[] args) {
//		People peo = new People();
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		People people = ac.getBean("peo2",People.class);
		System.out.println(people);
		
		
//		String[] names = ac.getBeanDefinitionNames();
//		for (String string : names) {
//			System.out.println(string);
//		}
		
		
		/**
		 * 实例工厂测试代码
		 * 
		 * 具体如何实例化工厂和本个知识点无关系.
		 * 
		 */
//		PeopleFactory factory = new PeopleFactory();
//		People people = factory.newInstance();
		
		/**
		 * 静态工厂
		 */
//		People peo = PeopleFactory.newInstance();
	}
}
