package com.bjsxt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bjsxt.pojo.Users;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("执行控制器");
		String name = req.getParameter("name");
		Users users = new Users();
		users.setId(1);
		users.setPassword("123");
		users.setUsername("张三");
		Users users1 = new Users();
		users1.setId(2);
		users1.setPassword("22");
		users1.setUsername("李四");
		
		List<Users> list = new ArrayList<Users>();
		list.add(users1);
		list.add(users);
		
		ObjectMapper mapper = new ObjectMapper();
		String result = mapper.writeValueAsString(list);
		
		resp.setContentType("application/json;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println(result);
		out.flush();
		out.close();
	}
}
