package com.bjsxt.serviceImp;

import java.util.List;

import com.bjsxt.dao.UserDao;
import com.bjsxt.daoImp.UserDaoImp;
import com.bjsxt.service.UserSrevice;
import com.bjsxt.vo.Area;
import com.bjsxt.vo.User;

public class UserSeviceImp implements UserSrevice{
	//获取Dao层对象
	UserDao ud=new UserDaoImp();
	@Override
	public User getUserInfoService(String name) {
		// TODO Auto-generated method stub
		return ud.getUserInfo(name);
	}
	@Override
	public List<Area> getAreaInfoService(String pid) {
		// TODO Auto-generated method stub
		return ud.getAreaInfo(pid);
	}

}
