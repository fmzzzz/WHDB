package com.zhiyou.servlet.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou.model.Student;
import com.zhiyou.service.StudentService;
import com.zhiyou.service.Impl.StudentServiceImpl;

@WebServlet("/student/update")
public class UpdateServlet extends HttpServlet{
	StudentService ss = new StudentServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		int id = Integer.parseInt(req.getParameter("id"));
		List<Student> students = ss.getListById(id);
		req.setAttribute("student", students);
		for (Student student : students) {
			System.out.println(student);
		}
		req.getRequestDispatcher("/WEB-INF/view/student/update.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String sex = req.getParameter("sex");
		String nation = req.getParameter("nation");
		String idcard = req.getParameter("idcard");
		boolean num = ss.save(id,name,age,sex,nation,idcard);
		if (num) {
			resp.sendRedirect(req.getContextPath()+"/student/list");
		}
	}

}
