<%--
  Created by IntelliJ IDEA.
  User: 黄天佑
  Date: 2022-06-19
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/addbookcontroller.do" method="get">
    书名：<input type="text" name="bookname"><br>
    作者：<input type="text" name="bookauthor"><br>
    价格：<input type="text" name="bookprice"><br>
    <input type="submit" value="添加">
</form>
</body>
</html>
