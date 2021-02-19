package com.bjsxt.dao;

import java.util.List;

import com.bjsxt.vo.Area;
import com.bjsxt.vo.User;

public interface UserDao {

	User getUserInfo(String name);

	List<Area> getAreaInfo(String pid);

}
