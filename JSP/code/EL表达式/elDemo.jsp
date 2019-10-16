<%--
  Created by IntelliJ IDEA.
  User: ami
  Date: 2019/10/16
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    ${3 > 4}

    \${3 > 4}
    <hr />

    <h3>算术运算符</h3>
    ${3 + 4}<br>
    ${3 / 4}<br>
    ${3 div 4}<br>
    ${3 % 4}<br>
    ${3 mod 4}<br>
    <hr />
    <h3>比较运算符</h3>
    ${3 != 4}<br>
    <h3>逻辑运算符</h3>
    ${3 < 4 && 3 < 5}<br>
    ${3 < 4 and 3 < 5}<br>
    ${3 < 4 || 3 < 5}<br>
    ${3 < 4 or 3 < 5}<br>

</body>
</html>
