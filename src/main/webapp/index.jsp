<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html>
<body>
欢迎【<shiro:principal property="username"/>】光临 <a href="/logout">注销</a>
<a href="login">登陆</a>
<h2>Hello World!</h2>
</body>
</html>
