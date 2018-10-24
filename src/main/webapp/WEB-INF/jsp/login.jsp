<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <style type="text/css">
        .btn{
            margin-left: 70px;
            margin-right: 50px;
        }
    </style>
</head>
<body>
<div class="container-fluid" style="background-color:#9acfea;margin-left: 35%;margin-right: 35%">
    <form >
        <div class="form-group" style="margin-top: 20px">
            <div class="input-group">
                <input type="text" name="search" class="form-control">
                <label class="input-group-addon"><span class="glyphicon glyphicon-search"></span></label>
            </div>
        </div>
        <span style="margin: auto 0">用户注册</span>
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
        <div class="form-group">
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
        </div>
        <div class="form-group">
            <button class="btn btn-danger btn-lg active">注册</button><input class="btn btn-info" type="submit" value="提交">
        </div>

    </form>
</div>
</body>
</html>