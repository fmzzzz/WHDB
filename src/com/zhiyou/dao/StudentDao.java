package com.zhiyou.dao;

import java.util.List;

import com.zhiyou.model.Student;

public interface StudentDao {

	List<Student> getList();

	boolean Add(String name, int age, String sex, String nation, String idcard);

	List<Student> getListById(int id);

	boolean save(int id, String name, int age, String sex, String nation, String idcard);

}
