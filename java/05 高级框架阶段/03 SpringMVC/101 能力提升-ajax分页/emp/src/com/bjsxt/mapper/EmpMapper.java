package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.bjsxt.pojo.Emp;

public interface EmpMapper {
	@Select("select  e.*,d.id `dept.id`,d.name `dept.name` from emp e LEFT JOIN dept d on e.deptid = d.id limit #{0},#{1}")
	List<Emp> selByPage(int pageStart,int pageSize);
	@Select("select count(*) from emp")
	long selCount();
}
