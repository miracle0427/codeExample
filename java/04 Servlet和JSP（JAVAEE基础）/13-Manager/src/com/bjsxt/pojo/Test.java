package com.bjsxt.pojo;

import com.bjsxt.dao.UserDao;
import com.bjsxt.dao.impl.UserDaoImpl;

public class Test {
	public static void main(String[] args) {
		//创建Dao层对象
		UserDao ud=new UserDaoImpl();
		for(int i=0;i<100;i++){
			User u=new User(0, "康佳01","123","1",18,"1998-09-08");
			ud.userRegDao(u);
		}
		System.out.println("成功");
	}
}
