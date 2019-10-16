<%@ page import="cn.itcust.servlet.User" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el表达式获取值</title>
</head>
<body>

    <%
        User user = new User();
        user.setName("张三");
        user.setAge(23);
        user.setBirthday(new Date());
        request.setAttribute("msg", user);


        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add(user);
        request.setAttribute("list", list);

        Map map = new HashMap();
        map.put("interest", "篮球");
        map.put("dad", "爸爸");
        request.setAttribute("map", map);
    %>

    <h3>el获取对象中的值</h3>
    ${requestScope.msg}<br>
    <%--
        * 通过的是对象的属性来获取
            * setter或getter方法，去掉set或get,再将剩余部分，首字母变小写
            * setName  => Name => name

    --%>
    ${requestScope.msg.name}<br>
    ${msg.birthday}<br>
    ${msg.birStr}<br>
    <hr />

    <h3>el获取List的值</h3>
    ${list}<br>
    ${list[0]}<br>
    ${list[1]}<br>
    <%--越界不报错--%>
    ${list[10]}<br>
    ${list[3].name}<br>
    <hr />

    <h3>el获取map的值</h3>
    ${map}<br>
    ${map.interest}<br>
    ${map["dad"]}<br>
</body>
</html>
