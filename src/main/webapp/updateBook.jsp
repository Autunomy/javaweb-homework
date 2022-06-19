<%--
  Created by IntelliJ IDEA.
  User: 黄天佑
  Date: 2022-06-19
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/updatebookcontroller.do" method="get">
    <input type="hidden" name="id" value="${book.id}">
    书名：<input type="text" name="bookname" value="${book.bookname}"><br>
    作者：<input type="text" name="bookauthor" value="${book.bookauthor}"><br>
    价格：<input type="text" name="bookprice" value="${book.bookprice}"><br>
    <input type="submit" value="修改">
</form>
</body>
</html>
