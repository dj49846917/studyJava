<%--
  Created by IntelliJ IDEA.
  User: ami
  Date: 2019/10/12
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <%
      String contextPath = request.getContextPath();
      System.out.println(contextPath);
  %>

  <%!
      int i = 3;
  %>

  <%
      System.out.println("hello, jsp");
      int i = 5;
  %>
  <%=
  i
  %>
    hello, world!!
  <%
    response.getWriter().write("response....");
  %>
  </body>
</html>
