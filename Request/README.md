## Request:
1. request对象和response对象的原理
    1. request和response对象是由服务器创建的。我们来使用它们
    2. request对象是用来获取请求信息，response对象是来设置响应信息
    
2. request对象继承体系结构:
    ServletRequest
        |   
    HttpServletRequest  --  接口    
        |
org.apache.catalina.connector.RequestFacade @(tomcat)

3. request功能:
  1. 获取请求消息数据
    1. 获取请求行数据
      * <font color=#00ffff>GET  /day14/demo1?name=zhangsan  HTTP/1.1</font>
      * 方法:
        1. 获取请求方式： GET
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

          * <font color=#00ffff>URL: 统一资源定位符： http://localhost/day14/demo1 中华人民共和国</font>
          * <font color=#00ffff>URI: 统一资源标识符： /day14/demo1 共和国</font>
        6. 获取协议及版本: HTTP/1.1
          * <font color=#00ffff>String getProtocol()</font>

        7. 获取客户机的IP地址: 
          * <font color=#00ffff>String getRemoteAddr()</font>
    
    2. 获取请求头数据
      * 方法:
        1. 通过请求头的名称获取请求头的值
          * <font color=#00ffff>String getHeader(String name)</font>
          
        2. 获取所有的请求头名称
          * <font color=#00ffff>Enumeration<.String> getHeaderNames</font>
