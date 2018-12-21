<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息 - 智游客户关系管理系统</title>
<link rel="stylesheet" href="<c:url value="/lib/font-awesome/css/font-awesome.css" />">
<link rel="stylesheet" href="<c:url value="/css/main.css" />">
</head>
<body>
		<h3>学生信息</h3>
		<div class="actions">
			<form></form>
			<div>
				<a class="btn btn-primary" href="<c:url value="/student/add" />">添加状态</a>
			</div>
		</div>
			<table class="list">
				<tr>
					<td>学号</td>
					<td>姓名</td>
					<td>年龄</td>
					<td>性别</td>
					<td>民族</td>
					<td>学号</td>
					<td>操作</td>
				</tr>
				<c:forEach var="student" items="${ list }">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.age}</td>
					<td>${student.sex}</td>
					<td>${student.nation}</td>
					<td>${student.idcard}</td>
					<td>
						<a class="fa fa-pencil" title="编辑" href="<c:url value="/student/update?id=" />${student.id}"></a>
	                	&nbsp;&nbsp;
	                	<a class="fa fa-remove" title="删除" href="#" onclick="deleteCustomer(${student.id})"></a>
					</td>
				</tr>
				</c:forEach>
				
			</table>	
</body>
</html>