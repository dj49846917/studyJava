package cn.itcust.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/contextDemo1")
public class ContextDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        <1>. 通过request对象获取
//                request.getServlerContext()
//
//    <2>. 通过HttpServlet获取
//                this.getServlerContext()

        ServletContext servletContext1 = request.getServletContext();
        ServletContext servletContext2 = this.getServletContext();
        System.out.println(servletContext1);
        System.out.println(servletContext2);

        System.out.println(servletContext1 == servletContext2);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
