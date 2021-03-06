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
	$().ready(function(){
		$("#form").validate({
			rules:{
				rolename:{
					required:true,
					minlength:3
				},
				roledesc:{
					required:true,
					minlength:6
				}
			},
			message:{
				rolename:{
					required:"请输入角色名称",
					minlength:"请输入至少3位字符"
				},
				roledesc:{
					required:"请描述角色工作", 
					minlength:"请输入至少6位字符"
				}
			}
		})
	})
</script>
<title>更新角色 - 智游客户关系管理系统</title>
<link rel="stylesheet" href="<c:url value="/lib/font-awesome/css/font-awesome.css" />">
<link rel="stylesheet" href="<c:url value="/css/main.css" />" >
</head>
<body>
	<div class="box">
		<h3>更新角色</h3>
		<form action="<c:url value="/role/update" />" method="post">
			<table class="form-table">
				<tr>
					<td>角色名称</td>
					<td colspan="3" class="control">
						<input type="text" name="roleName" value="${ role.roleName }" placeholder="填写角色名称">
						
					</td>
				</tr> 
				<tr>
					<td>角色描述</td>
					<td colspan="3" class="control">
						<textarea class="p100" name="roleDesc" placeholder="请填写角色描述">${ role.roleDesc } </textarea>
					</td>
				</tr>
			</table>
			<div class="buttons">
				<!-- 更新操作需要知道更新的id -->
				<input type="hidden" name="id" value="${ role.roleId }">
				<input class="btn btn-primary va-bottom" type="submit" value="保存">&nbsp;&nbsp;
				<a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
			</div>
		</form>
	</div>
</body>
</html>