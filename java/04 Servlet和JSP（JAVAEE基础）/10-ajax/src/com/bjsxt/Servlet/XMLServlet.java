package com.bjsxt.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/xml")
public class XMLServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置请求编码格式
		//设置响应编码格式
			resp.setCharacterEncoding("utf-8");
			resp.setContentType("text/xml;charset=utf-8");
		//获取请求信息
		//处理请求信息
		//响应处理结果
			resp.getWriter().write("<user><uid>1</uid><name>张三</name><price>11.11</price></user>");
	}
}
