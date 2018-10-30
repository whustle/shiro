<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登陆</title>
    <%--<link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />--%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <style type="text/css">
        .btn{
            margin-left: 70px;
            margin-right: 50px;
        }
        .checkbox{
            margin-left: 70px;
            margin-right: 50px;
        }
    </style>
</head>
<body>
<div class="container-fluid" style="background-color:#9acfea;margin-left: 35%;margin-right: 35%">
    <form action="login" method="post">
        <div class="form-group" style="margin-top: 20px">
            <div class="input-group">
                <input type="text" name="search" class="form-control">
                <label class="input-group-addon"><span class="glyphicon glyphicon-search"></span></label>
            </div>
        </div>
        <h3><span style="margin: auto 0">用户登陆</span></h3>
        <h4><span style="color: #ff1e19;height: 20px">${errorMsg}</span></h4>
        <div class="form-group">
            <div class="input-group">
                <label class="input-group-addon"><span class="glyphicon glyphicon-user"></span></label>
                <input type="text" name="username" class="form-control">
            </div>
        </div>
        <div class="form-group">
            <div class="input-group">
                <label class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></label>
                <input type="password" name="password" class="form-control">
            </div>
        </div>
        <%--<div class="form-group">
            <div class="input-group text-success">
                <label class="checkbox-inline"><input type="checkbox" name="like" value="sing">唱歌</label>
                <label class="checkbox-inline"><input type="checkbox" name="like" value="dance">跳舞</label>
                <label class="checkbox-inline"><input type="checkbox" name="like" value="swim">游泳</label>
                <label class="checkbox-inline"><input type="checkbox" name="like" value="basketball">篮球</label>
            </div>
        </div>
        <div class="form-group">
            <div class="input-group">
                <label class="radio-inline"><input type="radio" name="sex" value="male" checked="checked">男</label>
                <label class="radio-inline"><input type="radio" name="sex" value="female">女</label>
            </div>
        </div>--%>
        <div class="form-group">
            <label class="checkbox"><input type="checkbox" name="rememberMe" value="true">记住密码</label>
        </div>
        <div class="form-group">
            <input class="btn btn-info" type="submit" value="登陆">
        </div>

    </form>
</div>
</body>
</html>