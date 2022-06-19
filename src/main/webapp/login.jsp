<%--
  Created by IntelliJ IDEA.
  User: 黄天佑
  Date: 2022-06-19
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/logincontroller" method="post">
    用户名：<input type="text" name="username" autocomplete="off"><br>
    密码：<input type="password" name="password" autocomplete="off"><br>
    <input type="submit" value="登录">
    <a href="/signin.jsp">注册</a>
</form>
</body>
</html>
