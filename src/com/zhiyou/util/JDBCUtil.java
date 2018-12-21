package com.zhiyou.util;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCUtil {
	public static final String DRIVER_NAME="com.mysql.jdbc.Driver"; // 加载驱动
	public static final String ROOT="root";
	public static final String PASSWORD="123456";  
	public static final String DB_NAME="WHDB";  // 数据库名称
	public static final String URL="jdbc:mysql:///"+DB_NAME; // URL="jdbc:mysql:///" 本地

	public static <E>List<E> dbDQLWithSQL(String sql,Class<E> class1,Object...objects){
		Connection connection=getConnection();
		PreparedStatement ps=null;
		List<E> list=new ArrayList<>();
		ResultSet set=null;
		try {
			ps=connection.prepareStatement(sql);
			for (int i = 1; i <=objects.length; i++) {
				Object o=objects[i-1];
				ps.setObject(i, o);
			}
//			获取列名
			ResultSetMetaData data=ps.getMetaData();
			String[]names=new String[data.getColumnCount()];
			for (int i = 1; i <=data.getColumnCount(); i++) {
				String name=data.getColumnLabel(i);
				names[i-1]=name;
			}
			set=ps.executeQuery();
			while (set.next()) {
				E oE = class1.newInstance();
				for (String name : names) {
					Object value = set.getObject(name);
					Field field = class1.getDeclaredField(name); // name 为字段 也意味着为model. 通过反射获取 field(对象属性)
					field.setAccessible(true);		// 公开访问权限 true
					field.set(oE, value); 
				}
				list.add(oE);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			close(connection, ps, set);
		}
		return list;
	}
	
	public static Connection getConnection(){
		Connection connection=null;
		try {
			Class.forName(DRIVER_NAME);
			connection=DriverManager.getConnection(URL,ROOT,PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	
	public static boolean daDMLWithSQL(String sql,Object...objects){
		Connection connection=getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement(sql);
			for (int i = 0; i < objects.length; i++) {
				ps.setObject(i+1, objects[i]);
			}
			ps.execute();
			close(connection, ps);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public static void close(PreparedStatement ps){
		try {
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void close(Connection connection){
		try {
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void close(ResultSet set){
		try {
			set.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void close(Connection connection,PreparedStatement ps){
		close(ps);
		close(connection);
		
	}
	public static void close(Connection connection,PreparedStatement ps,ResultSet set){
		close(set);
		close(connection, ps);
		
	}
	
	
}
