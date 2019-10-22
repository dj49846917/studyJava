package cn.itcast.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo5 implements Filter {

    public void init(FilterConfig config) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("FilterDemo5执行了....");
        chain.doFilter(req, resp);
        System.out.println("FilterDemo5回来了....");
    }

    public void destroy() {
    }

}
