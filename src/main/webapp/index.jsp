<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <%
        String username = request.getRemoteUser();

    %>
    <meta charset="utf-8"/>
    <title>title</title>
    <%--<link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />--%>
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <%--<script>
        $(function(){

        });
    </script>--%>
</head>
<body>
欢迎<span>【<shiro:principal property="username"/></span>】光临 <a href="logout">注销</a>
<a href="login">登陆</a>
<h2>Hello World!</h2>
<a href="add">增加</a>
<a href="delete">删除</a>
<a href="update">修改</a>
<a href="find">查询</a>
</body>
</html>
