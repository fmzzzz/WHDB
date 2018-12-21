package com.zhiyou.model;

public class Student {
	private int id;
	private String name;
	private int age;
	private String sex;
	private String nation;
	private String idcard;
	
	public Student() {
		
	}
/*	public Student(int id,String name,int age,String sex,String nation,String idcard) {
		
	}*/
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setSex(String sex) {
		this.sex=sex;
	}
	public String getSex() {
		return sex;
	}
	public void setNation(String nation) {
		this.nation=nation;
	}
	public String getNation() {
		return nation;
	}
	public void setIdcard(String idcard) {
		this.idcard=idcard;
	}
	public String getIdcard() {
		return idcard;
	}
	@Override
	public String toString() {
		return "{"+
				"id:"+this.id+","+
				"name"+this.name+","+
				"age"+this.age+","+
				"sex"+this.sex+","+
				"nation"+this.nation+","+
				"idcard"+this.idcard+
				"}";
	}
/*	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", nation=" + nation
				+ ", idcard=" + idcard + "]";
	}*/
	
}
