package com.zhiyou.servlet.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou.service.StudentService;
import com.zhiyou.service.Impl.StudentServiceImpl;

@WebServlet("/student/add")
public class AddServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	StudentService ss = new StudentServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		req.getRequestDispatcher("/WEB-INF/view/student/add.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String sex = req.getParameter("sex");
		String nation = req.getParameter("nation");
		String idcard = req.getParameter("idcarf");
		boolean num = ss.Add(name,age,sex,nation,idcard);
		if (num){
//			req.getRequestDispatcher("/student/list").forward(req, resp);
			resp.sendRedirect(req.getContextPath()+"/student/list");
		}
	}
}
