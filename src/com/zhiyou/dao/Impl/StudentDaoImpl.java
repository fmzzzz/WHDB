package com.zhiyou.dao.Impl;

import java.util.List;

import com.zhiyou.dao.StudentDao;
import com.zhiyou.model.Student;
import com.zhiyou.util.JDBCUtil;

public class StudentDaoImpl implements StudentDao {

//	list
	@Override
	public List<Student> getList() {
		String sql = "select * from student ";
		List<Student> list = JDBCUtil.dbDQLWithSQL(sql, Student.class);
		return list;
	}

//	add
	@Override
	public boolean Add(String name, int age, String sex, String nation, String idcard) {
		String sql = "insert into student(name,age,sex,nation,idcard)values(?,?,?,?,?)";
		boolean num = JDBCUtil.daDMLWithSQL(sql,name,age,sex,nation,idcard);
		return num;
	}

	@Override
	public List<Student> getListById(int id) {
		String sql="select * from student where id=?";
		List<Student> student = JDBCUtil.dbDQLWithSQL(sql, Student.class, id);
		return student;
	}

	@Override
	public boolean save(int id,String name, int age, String sex, String nation, String idcard) {
		String sql ="update student set name=?,age=?,sex=?,nation=?,idcard=?where id=?";
		boolean num = JDBCUtil.daDMLWithSQL(sql, name,age,sex,nation,idcard,id);
		return num;
	}
}
