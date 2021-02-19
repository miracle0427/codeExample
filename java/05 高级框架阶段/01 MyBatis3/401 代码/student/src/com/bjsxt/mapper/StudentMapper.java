package com.bjsxt.mapper;

import java.util.List;

import com.bjsxt.pojo.PageInfo;
import com.bjsxt.pojo.Student;

public interface StudentMapper {
	List<Student> selByPage(PageInfo pi);
	
	long selCountByPageInfo(PageInfo pi);
}
