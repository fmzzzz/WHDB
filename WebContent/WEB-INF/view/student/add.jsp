<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="<c:url value="/jquery-1.js"/>"></script>
<script type="text/javascript" src="<c:url value="/jquery.validate.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/messages_zh.js"/>"></script>
<script type="text/javascript">
/* 	$().ready(function(){
		$("#form").validate({
			rules:{
				rolename:{
					required:true,
					minlength:2
				},
				roledesc:{
					required:true,
					minlength:6
				}
			},
			message:{
				rolename:{
					required:"请输入学生姓名",
					minlength:"请输入至少2位字符"
				},
				roledesc:{
					required:"请描述角色的工作", 
					minlength:"请输入至少6位字符"
				}
			}
		})
	}) */
</script>
<title>添加角色 - 智游客户关系管理系统</title>
<link rel="stylesheet" href="<c:url value="/lib/font-awesome/css/font-awesome.css" />">
<link rel="stylesheet" href="<c:url value="/css/main.css" />">
</head>
<body>
	<div class="box">
		<h3>添加学生</h3>
		<form action="<c:url value="/student/add" />" method="post" id="form">
			<table class="form-table">
				<tr>
					<td>姓名</td>
					<td colspan="3" class="control">
						<input  type="text" name="name" placeholder="填写姓名">
					</td>
				</tr>
				<tr>
					<td>年龄</td>
					<td colspan="3" class="control">
						<input type="text"  name= "age" placeholder="请填写年龄">
					</td>
				</tr>
				<tr>
					<td>性别</td>
					<td colspan="3" class="control">
						<input  type="text" name="sex" placeholder="填写性别">
					</td>
				</tr>
				<tr>
					<td>民族</td>
					<td colspan="3" class="control">
						<input  type="text" name="nation" placeholder="填写民族">
					</td>
				</tr>
				<tr>
					<td>学号</td>
					<td colspan="3" class="control">
						<input  type="text" name="idcard" placeholder="填写学号">
					</td>
				</tr>
			</table>
			<div class="buttons">
				<input class="btn btn-primary va-bottom" type="submit" value="保存">&nbsp;&nbsp;
				<a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
			</div>
		</form>
	</div>
</body>
</html>