package com.bjsxt.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ajax")
public class AjaxServlet  extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置请求编码格式
			req.setCharacterEncoding("utf-8");
		//设置响应编码格式
			resp.setCharacterEncoding("utf-8");
			resp.setContentType("text/html;charset=utf-8");
		//获取请求信息
			String name=req.getParameter("name");
			String pwd=req.getParameter("pwd");
			System.out.println(name+":"+pwd+":"+req.getMethod());
		//处理请求信息
		//响应处理结果
			resp.getWriter().write("今天的雾霾真得是新鲜，666");
	}
}
