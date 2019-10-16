<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="cn.itcust.servlet.User" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>

<%
    List list = new ArrayList();
    list.add(new User("张三", 23, new Date()));
    list.add(new User("李四", 24, new Date()));
    list.add(new User("王五", 25, new Date()));

    request.setAttribute("list", list);
%>

<table border="1" width="500" align="center">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>生日</th>
    </tr>
    <%--数据行--%>
    <c:forEach items="${list}" var="user" varStatus="s">
        <c:if test="${s.count % 2 == 0}">
            <tr bgcolor="red">
                <td>${s.count}</td>
                <td>${s.name}</td>
                <td>${s.age}</td>
                <td>${s.birthday}</td>
            </tr>
        </c:if>
        <c:if test="${s.count % 2 == 1}">
            <tr bgcolor="green">
                <td>${s.count}</td>
                <td>${s.name}</td>
                <td>${s.age}</td>
                <td>${s.birthday}</td>
            </tr>
        </c:if>
    </c:forEach>
</table>
</body>
</html>
