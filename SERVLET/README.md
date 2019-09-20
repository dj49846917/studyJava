# Servlet: server applet

* 概念: 运行在服务器端的小程序
    * <font color=#00ffff>Servlet就是一个接口，定义了Java类被浏览器访问到(tomcat识别)的规则</font>
    * <font color=#00ffff>将来我们自定义一个类，实现Servlet接口，复写方法。</font>

* 快速入门:

    1. 创建JavaEE项目
    2. 定义一个类，实现Servlet接口
       * public class ServletDemo1 implements Servlet
    3. 实现接口中的抽象方法
    4. 配置Servlet
    5. 点击run按钮，在地址栏输入: http://localhost:8080/demo1,看到控制台输出: "hello, servlet"

```
在web/WEB-INF/web.xml中加入:

       <!--配置Servlet -->
        <servlet>
            <!--servlet取名 -->
            <servlet-name>demo1</servlet-name>
            <!--对应的全类名 -->
            <servlet-class>cn.itcust.web.servlet.ServletDemo1</servlet-class>
        </servlet>
        <!--mapping做一个映射，/demo1能够访问到这个servlet-->
        <servlet-mapping>
            <servlet-name>demo1</servlet-name>
            <url-pattern>/demo1</url-pattern>
        </servlet-mapping>

详细请看: SERVLET/code
```