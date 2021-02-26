package com.bjsxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.pojo.People;

public class Test {
	public static void main(String[] args) {
//		People peo = new People();
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		People people = ac.getBean("peo",People.class);
		System.out.println(people);
		
//		String[] names = ac.getBeanDefinitionNames();
//		for (String string : names) {
//			System.out.println(string);
//		}
	}
}
