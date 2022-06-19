<%--
  Created by IntelliJ IDEA.
  User: 黄天佑
  Date: 2022-06-19
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/signincontroller" method="post">
    用户名:<input type="text" name="username" autocomplete="off"/><br/>
    密码:<input type="password" name="password" autocomplete="off"/><br/>
    出生日期:<input type="date" name="date"> <br>
    学院: <input type="text" name="xueyuan" autocomplete="off"> <br>
    <button>注册</button>
</form>
</body>
</html>
