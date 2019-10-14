package cn.itcust.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookieDemo4")
public class CookieDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 创建cookie对象
        Cookie msg = new Cookie("msg", "hello");

        // 2.设置cookie的存活时间
        msg.setMaxAge(30); // 将cookie持久化到硬盘，30s后会自动删除cookie文件
//        msg.setMaxAge(-1);
//        msg.setMaxAge(0);

        // 发送cookie
        response.addCookie(msg);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
