package com.zhiyou.service.Impl;

import java.util.List;

import com.zhiyou.dao.StudentDao;
import com.zhiyou.dao.Impl.StudentDaoImpl;
import com.zhiyou.model.Student;
import com.zhiyou.service.StudentService;

public class StudentServiceImpl implements StudentService {
	StudentDao dao = new StudentDaoImpl();
	@Override
	public List<Student> getList() {
		return dao.getList();
	}
	@Override
	public boolean Add(String name, int age, String sex, String nation, String idcard) {
		return dao.Add(name,age,sex,nation,idcard);
	}
	@Override
	public List<Student> getListById(int id) {
		return dao.getListById(id);
	}

	@Override
	public boolean save(int id,String name, int age, String sex, String nation, String idcard) {
		return dao.save(id ,name,age,sex,nation,idcard) ;
	}

}
