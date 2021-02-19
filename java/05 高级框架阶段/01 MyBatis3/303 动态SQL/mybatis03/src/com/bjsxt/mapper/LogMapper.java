package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bjsxt.pojo.Log;

public interface LogMapper {
	List<Log> selByAccinAccout(@Param("accout") String accout, @Param("accin") String accin);
	
	
	int upd(Log log);
	
	
	List<Log> selByLog(Log log);
	
	
	List<Log> selIn(List<Integer> list);
	
	
	int ins(List<Integer> list);
}
