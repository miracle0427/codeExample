package com.bjsxt.service;

import java.io.IOException;

import com.bjsxt.pojo.PageInfo;

public interface PeopleService {
	/**
	 * 分页显示
	 * @param pageSize
	 * @param pageNumber
	 * @return
	 */
	PageInfo showPage(int pageSize,int pageNumber) throws IOException;
}
