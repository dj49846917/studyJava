<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" errorPage="500.jsp" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        ArrayList<Object> objects = new ArrayList<Object>();
        int i = 3 / 0;
        System.out.println(i);
    %>
</body>
</html>
