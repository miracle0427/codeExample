package com.bjsxt.mapper;

import org.apache.ibatis.annotations.Select;

import com.bjsxt.pojo.Users;

public interface UsersMapper {
	@Select("select * from users where username=#{username} and password=#{password}")
	Users selByUsersPwd(Users users);
}
