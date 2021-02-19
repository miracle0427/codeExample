package com.bjsxt.filter;

import java.io.IOException;

import java.io.InputStream;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bjsxt.util.MyBatisUtil;


/**
 * 最开始是由Spring框架提出的.整合Hibernate框架是使用的是OpenSessionInView
 * 
 * 
 * @author Administrator
 *
 */
@WebFilter("/*")
public class OpenSessionInView implements Filter{

	@Override
	public void init(FilterConfig filterconfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain filterchain)
			throws IOException, ServletException {
//		InputStream is = Resources.getResourceAsStream("mybatis.xml");
//		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
//		SqlSession session = factory.openSession();		
		SqlSession session = MyBatisUtil.getSession();
		try {
			filterchain.doFilter(servletrequest, servletresponse);
			session.commit();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSession();
		}
//		session.commit();
//		session.close();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
