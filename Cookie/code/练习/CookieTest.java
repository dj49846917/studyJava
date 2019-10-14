package cn.itcust.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  <1>. 在服务器中的servlet判断是否有一个名为lastTime的cookie
 *       1). 有：不是第一次访问
             {1}. 响应数据：欢迎回来，您上次访问时间为：2019年10月13日15:29:01
             {2}. 写回cookie: lastTime=2019年10月13日15:29:59

         2). 没有：是第一次访问
             {1}. 响应数据：您好，欢迎您首次访问
             {2}. 写回cookie: lastTime=2019年10月13日15:31:09
 *
 */
@WebServlet("/CookieTest")
public class CookieTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应的消息的数据格式以及编码
        response.setContentType("text/html;charset=utf-8");

        // 1. 获取所有的cookies
        Cookie[] cookies = request.getCookies();
        boolean flag = false; // 设置是否有lastTame的cookie
        if(cookies != null && cookies.length > 0) {
            // 2. 遍历cookie数组
            for (Cookie item : cookies){
                // 3. 获取cookie的名称
                String name = item.getName();
                // 4. 判断名称是不是:lastTima
                if("lastTime".equals(name)) {
                    // 有该cookie，不是第一次访问
                    flag = true; // 有

                    // 设置Cookie的value
                    // 获取当前时间的字符串， 重新设置Cookie的值，重新发送Cookie
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String str_date = sdf.format(date);
                    System.out.println("编码前：" + str_date);
                    // URL编码
                    String encode = URLEncoder.encode(str_date, "utf-8");
                    System.out.println("编码后：" + encode);
                    item.setValue(encode);
                    // 设置cookie的存活时间
                    item.setMaxAge(60 * 60 * 24 * 30); // 一个月
                    response.addCookie(item);

                    // 响应数据
                    // 获取Cookie的value, 时间
                    String value = item.getValue();
                    System.out.println("解码前：" + value);
                    // URL解码
                    value = URLDecoder.decode(value, "utf-8");
                    System.out.println("解码后：" + value);
                    response.getWriter().write("<h1>欢迎回来，您上次访问时间为：" + value + "</h1>");

                    break;
                }
            }
        }

        if(cookies == null || cookies.length == 0 || flag == false){
            // 没有， 第一次访问

            // 设置Cookie的value
            // 获取当前时间的字符串，重新设置Cookie的值，重新发送cookie
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String str_date = sdf.format(date);
            System.out.println("编码前：" + str_date);
            str_date = URLEncoder.encode(str_date, "utf-8");
            System.out.println("编码后：" + str_date);
            Cookie cookie = new Cookie("lastTime", str_date);
            // 设置cookie的存活时间
            cookie.setMaxAge(60 * 60 * 24 * 30); // 一个月
            response.addCookie(cookie);

            response.getWriter().write("<h1>您好，欢迎您首次访问");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
