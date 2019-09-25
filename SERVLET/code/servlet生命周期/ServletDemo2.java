package cn.itcust.web.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Servle的方法
 */
public class ServletDemo2 implements Servlet {
    /**
     * 在Servlet被创建时，执行。只会执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("ServletDemo2.init....");
    }

    /**
     * 获取ServletConfig对象
     * ServletConfig: Servlet的配置对象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务方法
     * 每一次Servlet被访问时，执行。执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("ServletDemo2.service...");
    }

    /**
     * 获取Servlet的一些信息
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 在服务器正常关闭时，执行一次
     */
    @Override
    public void destroy() {
        System.out.println("ServletDemo2.destroy....");
    }
}
