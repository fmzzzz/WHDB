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

@WebServlet("/student/list")
public class ListServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	StudentService ss = new StudentServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		List<Student> list = ss.getList();
		req.setAttribute("list", list);

		req.getRequestDispatcher("/WEB-INF/view/student/list.jsp").forward(req, resp);
	}

}
