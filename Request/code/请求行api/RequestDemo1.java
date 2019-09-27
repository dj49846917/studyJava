package cn.itcust.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RequestDemo1")
public class RequestDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         *  1. 获取请求方式： GET
         * <font color=#00ffff>String getMethod()</font>

         2. 获取虚拟目录: /day14
         * <font color=#00ffff>String getContextPath()</font>

         3. 获取Servlet路径: /demo1
         * <font color=#00ffff>String getServletPath()</font>

         4. 获取get方式请求参数: name=zhangsan
         * <font color=#00ffff>String getQueryString()</font>

         5. 获取请求URI: /day14/demo1
         * <font color=#00ffff>String getRequestURI():  /day14/demo1</font>
         * <font color=#00ffff>StringBuffer getRequestURL():  http://localhost/day14/demo1</font>

         6. 获取协议及版本: HTTP/1.1
         * <font color=#00ffff>String getProtocol()</font>

         7. 获取客户机的IP地址:
         * <font color=#00ffff>String getRemoteAddr()</font>
         */

        // 1. 获取请求方式： GET
        String method = request.getMethod();
        System.out.println(method);

        //  2. 获取虚拟目录: /day14
        String contextPath = request.getContextPath();
        System.out.println(contextPath);

        // 3. 获取Servlet路径: /demo5
        String servletPath = request.getServletPath();
        System.out.println(servletPath);

        // 4. 获取get方式请求参数: name=zhangsan
        String queryString = request.getQueryString();
        System.out.println(queryString);

        // 5. 获取请求URI: /day14/demo5
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURI);
        System.out.println(requestURL);

        // 6. 获取协议及版本: HTTP/1.1
        String protocol = request.getProtocol();
        System.out.println(protocol);

        // 7. 获取客户机的IP地址
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
