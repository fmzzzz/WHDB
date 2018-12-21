<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新用户 - 智游客户关系管理系统</title>
<link rel="stylesheet" href="<c:url value="/lib/font-awesome/css/font-awesome.css" />">
<link rel="stylesheet" href="<c:url value="/css/main.css" />">


</head>
<body>
	<div class="box">
		<h3>更新用户</h3>
		<!-- 更新用户,更新前,本页面展示的是全部信息 -->
		<form action="<c:url value="#" />" method="post">
			<table class="form-table">
				<tr>
					<td>角色名称</td>
					<td class="control">
						${ role.rolename }
					</td>
				</tr>
				<tr>
					<td>角色描述</td>
					<td class="control">
						${ role.roleDesc }
					</td>
				</tr>

			</table>
			<div class="buttons">
				<a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
			</div>
		</form>
	</div>
</body>
</html>