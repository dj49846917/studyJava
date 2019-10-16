<%--
  Created by IntelliJ IDEA.
  User: ami
  Date: 2019/10/16
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取域中的数据</title>
</head>
<body>

    <%
        // 在域中存储数据
        request.setAttribute("name", "张三");
        session.setAttribute("age", 23);
    %>

    ${requestScope.name}
    ${sessionScope.age}
    ${name}

</body>
</html>
