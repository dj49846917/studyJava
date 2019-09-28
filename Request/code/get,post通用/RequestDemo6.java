package cn.itcust.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/RequestDemo6")
public class RequestDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // post 获取请求参数
        String param = request.getParameter("username");
//        System.out.println("POST");
//        System.out.println(param);

        // 获取请求参数数组
        String[] intrests = request.getParameterValues("intrest");
//        for(String item: intrests){
//            System.out.println(item);
//        }

        // 获取所有请求的参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
//        while(parameterNames.hasMoreElements()){
//            String name = parameterNames.nextElement();
//            System.out.println(name);
//            String value = request.getParameter(name);
//            System.out.println(value);
//            System.out.println("------------------");
//        }

        // 获取所有参数的map集合
        Map<String, String[]> parameterMap = request.getParameterMap();
        // 遍历
        Set<String> kelsey = parameterMap.keySet();
        for(String name : kelsey) {
            // 获取键，获取值
            String[] values = parameterMap.get(name);
            System.out.println(name);
            for (String value : values) {
                System.out.println(value);
            }
            System.out.println("--------------------");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get 获取请求参数

//        String param = request.getParameter("username");
//        System.out.println("get");
//        System.out.println(param);
        // 简化，复用
        this.doPost(request, response);
    }
}
