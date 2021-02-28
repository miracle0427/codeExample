package com.bjsxt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.bjsxt.pojo.PageInfo;
import com.bjsxt.service.EmpService;
import com.bjsxt.service.impl.EmpServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/show")
public class ShowServlet extends HttpServlet {
	private EmpService empService;
	
	@Override
	public void init() throws ServletException {
		//spring在web项目中容器是webApplicationContext
		WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		empService=wac.getBean("empServiceImpl",EmpServiceImpl.class);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int pageSize = Integer.parseInt(req.getParameter("pageSize"));
		int pageNumber = Integer.parseInt(req.getParameter("pageNumber"));
		PageInfo pi = empService.show(pageSize, pageNumber);
		resp.setContentType("application/json;charset=utf-8");
		PrintWriter out = resp.getWriter();
		ObjectMapper mapper = new ObjectMapper();
		out.println(mapper.writeValueAsString(pi));
		out.flush();
		out.close();
	}
}
