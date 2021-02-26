package com.bjsxt.pojo;

public class PeopleFactory {
	public static People newInstance(){
		return new People(1,"测试");
	}
}
