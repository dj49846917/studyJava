<%--
  Created by IntelliJ IDEA.
  User: ami
  Date: 2019/10/14
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <style>
        div{
            color: red;
        }
    </style>
</head>
<body>
    <form action="/day16/loginServlet" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="userName" /></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="passWord" /></td>
            </tr>
            <tr>
                <td>验证码：</td>
                <td><input type="text" name="checkCode" /></td>
            </tr>
            <tr>
                <td colspan="2"><img id="img" src="/day16/checkCode" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="登录" /></td>
            </tr>
        </table>
    </form>
    <div><%= request.getAttribute("cc_error") == null ? "" : request.getAttribute("cc_error") %></div>
    <div><%= request.getAttribute("login_error") == null ? "" : request.getAttribute("login_error") %></div>
    <script>
        window.onload = function () {
            document.querySelector("#img").src = "/day16/checkCode?" + new Date().getTime();
            document.querySelector("#img").onclick=function () {
                this.src = "/day16/checkCode?" + new Date().getTime();
            }
        }
    </script>
</body>
</html>
