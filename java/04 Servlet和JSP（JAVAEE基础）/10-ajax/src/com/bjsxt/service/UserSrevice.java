package com.bjsxt.service;

import java.util.List;

import com.bjsxt.vo.Area;
import com.bjsxt.vo.User;

public interface UserSrevice {

	User getUserInfoService(String name);

	List<Area> getAreaInfoService(String pid);

}
