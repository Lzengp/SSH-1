<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>菜单</title>
</head>
<body>
菜单：
<hr>
<a href="${pageContext.request.contextPath }/customer/addUICustomer.action">增加客户</a><br>
<a href="${pageContext.request.contextPath }/customer/findAllCustomer.action">查询客户</a>
</body>
</html>