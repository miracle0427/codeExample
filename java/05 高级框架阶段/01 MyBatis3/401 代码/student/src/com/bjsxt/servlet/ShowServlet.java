package com.bjsxt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bjsxt.pojo.PageInfo;
import com.bjsxt.service.StudentService;
import com.bjsxt.service.impl.StudentServiceImpl;

@WebServlet("/show")
public class ShowServlet extends HttpServlet {
	private StudentService stuService = new StudentServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sname = req.getParameter("sname");
		if (sname != null && !sname.equals(""))
			sname = new String(sname.getBytes("iso-8859-1"), "utf-8");
		String tname = req.getParameter("tname");
		if (tname != null && !tname.equals(""))
			tname = new String(tname.getBytes("iso-8859-1"), "utf-8");
		String pageSize = req.getParameter("pageSize");
		String pageNumber = req.getParameter("pageNumber");
		PageInfo pi = stuService.showPage(sname, tname, pageSize, pageNumber);
		System.out.println(pi);
		req.setAttribute("pageinfo", pi);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
