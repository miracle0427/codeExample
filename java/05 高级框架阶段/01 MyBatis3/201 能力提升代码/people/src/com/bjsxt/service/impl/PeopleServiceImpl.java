package com.bjsxt.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.builder.xml.XMLConfigBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;

import com.bjsxt.pojo.People;
import com.bjsxt.service.PeopleService;


/**
 * 在数据访问层处理异常和在控制器中处理异常,service中只抛出异常.
 * @author Administrator
 *
 */
public class PeopleServiceImpl implements PeopleService {

	@Override
	public List<People> show() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		//前面是工厂       实例化工厂对象时使用的是  构建者设计模式   名称标志:后面有Builder
		//构建者设计模式意义: 简化对象实例化过程
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		List<People> list = session.selectList("com.bjsxt.mapper.PeopleMapper.selAll");
		session.close();
		return list;
	}

}
