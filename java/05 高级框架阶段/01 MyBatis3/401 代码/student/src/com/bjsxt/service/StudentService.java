package com.bjsxt.service;

import com.bjsxt.pojo.PageInfo;

public interface StudentService {
	PageInfo showPage(String sname,String tname,String pageSize,String pageNumber);
}
