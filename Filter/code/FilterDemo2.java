package cn.itcast.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*") // 访问所有资源之前,都会执行该过滤器
public class FilterDemo2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 对request对象的请求消息增强
        System.out.println("该程序被执行了.....");

        // 放行
        filterChain.doFilter(servletRequest, servletResponse);
        // 对response对象的响应消息增强
        System.out.println("该程序回来了...");
    }

    @Override
    public void destroy() {

    }
}
