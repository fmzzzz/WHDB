<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="<c:url value="/jquery-1.js"/>"></script>
<script type="text/javascript" src="<c:url value="/jquery.validate.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/messages_zh.js"/>"></script>
<meta charset="UTF-8">

<title>更新用户 - 智游客户关系管理系统</title>
<link rel="stylesheet" href="<c:url value="/lib/font-awesome/css/font-awesome.css" />">
<link rel="stylesheet" href="<c:url value="/css/main.css" />">
</head>
<body>
	<div class="box">
		<h3>更新用户</h3>
		<form action="<c:url value="/student/update" />" method="post" id="form">
			<table class="form-table">
				<tr>
					<td>姓名</td>
					<td class="control">
						<input type="text" name="name" value="${ student.name }" placeholder="请填写姓名">
					</td>
				</tr>
				<tr>
					<td>性别</td>
					<td class="control">
						<input type="text" name="sex" value="${ student.sex }" placeholder="请填写性别">
						
					</td>
				</tr>
				<tr>
					<td>年龄</td>
					<td class="control">
						<input type="text" name="age" value="${ student.age }" placeholder="请填写年龄">
					</td>
				</tr>
				<tr>
					<td>学号</td>
					<td class="control">
						<input type="text" name="idcard" value="${ student.idcard }" class="p80" placeholder="请填写身份证号">
					</td>
				</tr>
				<tr>
					<td>民族</td>
					<td class="control">
						<input type="text" name="nation" value="${ student.nation }" placeholder="请填写民族">
					</td>
				</tr>

			</table>
			<div class="buttons">
				<!-- 此处需要传给后台用户id,因为要告知系统修改哪个用户 -->
				<input type="hidden" name="id" value="${ student.id }">
				<input class="btn btn-primary va-bottom" type="submit" value="保存">&nbsp;&nbsp;
				<a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
			</div>
		</form>
	</div>
</body>
</html>