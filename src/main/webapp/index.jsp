<%--
  Created by IntelliJ IDEA.
  User: 黄天佑
  Date: 2022-06-19
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button><a href="/addBook.jsp">添加图书</a></button>
<table border="1px">
    <thead>
    <tr>
        <td>图书编号</td>
        <td>图书名称</td>
        <td>图书作者</td>
        <td>图书价格</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${books}" var="book">
            <tr>
                <td>${book.id}</td>
                <td>${book.bookname}</td>
                <td>${book.bookauthor}</td>
                <td>${book.bookprice}</td>
                <td>
                    <a href="/deletebookcontroller.do?id=${book.id}">删除</a>
                    <a href="/toupdatebookcontroller.do?id=${book.id}">修改</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
