package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bjsxt.pojo.Files;

public interface FilesMapper {
	@Select("select * from files")
	List<Files> selAll();
	@Update("update files set count=count+1 where id=#{0}")
	int updCountById(int id);
}
