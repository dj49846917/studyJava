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
    
    3. 获取请求体数据:
      * 请求体: 只有POST请求方式，才有请求体，在请求体中封装了POST请求的请求参数
      * 步骤:
         
         1. 获取流对象
           * <font color=#00ffff>BufferdReader getReader(): 获取字符输入流，只能操作字符数据</font>
           * <font color=#00ffff>ServletInputStream getInputStream(): 获取字符节输入流，可以操作所有类型数据</font>
           
         2. 再从流对象中拿数据
         
 2. 其他功能
   1. 获取请求参数通用方式
      1. String getParameter(String name): 根据参数名称获取参数值  username=zhangsan&password=123
      
      2. String[] getParameterValues(String name): 根据参数名称获取参数值的数组 intrest=baseball&intrest=football
      
      3. Enumeration<String> getParameterNames()：获取所有请求的参数名称
      
      4. Map<String,String[]> getParameterMap(): 获取所有参数的map集合
      
      * 中文乱码问题:
        * <font color=#00ffff>get方式： tomcat8已经将get方式乱码问题解决了</font>
        * <font color=#00ffff>post方式： 会乱码</font>
          * <font color=#00ffff>解决：在获取参数前，设置request的编码request.setCharacterEncoding("utf-8")</font>
      
   2. 请求转发：一种在服务器内部的资源跳转方式
     1.步骤：
        1. 通过request对象获取请求转发器对象：RequestDispatcher getRequestDispatcher(String path)
        2. 使用RequestDispatcher对象来进行转发：forward(ServletRequest request, ServletResponse response)
   
     2.特点：
        1. 浏览器地址栏路径不会发生变化
        2. 只能转发到当前服务器内部资源中
        3. 转发是一次请求
        
   3. 共享数据：
     * <font color=#00ffff>域对象：一个有作用域的对象，可以在范围内共享数据</font>
     * <font color=#00ffff>request域：代表一次请求的范围，一般用于请求转发的多个资源中共享数据</font>
     * 方法：
       1. void setAttribute(String name, Object obj)：存储数据
       
       2. Object getAttribute(String name)：通过键获取值
       
       3. void removeAttribute(String name)：通过键移除键值对
       
   4. 获取ServletContext
     * <font color=#00ffff>ServletContext getServletContext()</font>     