package com.bjsxt.service.impl;

import java.util.List;

import com.bjsxt.dao.FlowerDao;
import com.bjsxt.dao.impl.FlowerDaoImpl;
import com.bjsxt.pojo.Flower;
import com.bjsxt.service.FlowerService;

public class FlowerServiceImpl implements FlowerService {
	private FlowerDao flowerDao = new FlowerDaoImpl();
	@Override
	public List<Flower> show() {
		return flowerDao.selAll();
	}
	@Override
	public int add(Flower flower) {
		return flowerDao.insFlower(flower);
	}

}
