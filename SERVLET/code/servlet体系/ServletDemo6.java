package cn.itcust.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 多路径配置
 */
// @WebServlet({"/d4", "/dd4", "/ddd4"})
// @WebServlet("/user/*")
//@WebServlet("/*")
@WebServlet("*.do")
public class ServletDemo6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServletDemo6.doGet。。。");
    }
}
