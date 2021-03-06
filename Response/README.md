## Response对象
  * 功能：设置响应消息
    1. 设置响应行
      1. 格式：HTTP/1.1 200 ok
      2. 设置状态码：setStatus(int sc)

    2. 设置响应头：setHeader(String name, String value)

    3. 设置响应体:
      * 使用步骤：

        1. 获取输出流
          * <font color=#00ffff>字符输出流：PrintWriter getWriter()</font>

          * <font color=#00ffff>字节输出流：ServletOutputStream getOutputStream()</font>

        2. 使用输出流，将数据输出到客户端浏览器

  * 案例：
    1. 完成重定向
      * <font color=#00ffff>重定向：资源跳转的方式
  
      * 代码实现：
        // 1. 设置状态码为302    
        // response.setStatus(302);     
        // 2. 设置响应头location      
        //  response.setHeader("location", "/day15/responseDemo2");     

        // 简单的重定向方法
        response.sendRedirect("/day15/responseDemo2");</font>

      * <b>重定向的特点：redirect</b>    
        1. 地址栏发生变化
        2. 重定向可以访问其他站点(服务器)的资源
        3. 重定向是两次请求，不能使用request对象来共享数据

      * <b>转发的特点：forward</b>
        1. 转发地址栏路径不变
        2. 转发只能访问当前服务器下的资源
        3. 转发是一次请求，可以使用resquest对象来共享数据

      * <font color=#00ffff>forward 和 redirect的区别</font>

      * <b>路径写法：</b>
        1. 路径分类
          1. 相对路径    
            * <font color=#00ffff>如：./index.html   
            *  不以/开头，以.开头路径</font> 

            * 规则：确定访问当前资源和目标资源之间的相对位置关系  
              * ./: 当前目录
              * ../: 后退一级目录

            * 详细代码请看：Response\code\相对路径

          2. 绝对路径：通过绝对路径可以确定唯一资源     
            * <font color=#00ffff>http://localhost:8080/day15/index.html /day15/responseDemo2    
            * 以/开头的路径</font>

            * 规则：判断定义的路径是给谁用的？判断请求将来从哪儿发出     
              * 给客户端浏览器使用：需要加虚拟目录（项目的访问路径）
                * 建议虚拟目录动态获取：request.getContextPath()

              * 给服务器使用，不需要加虚拟目录
                * 转发路径

      * 详细代码请看：\Response\code\重定向

    2. 服务器输出字符数据到浏览器
      * <b>步骤：</b>  
        <1>. 获取字符输出流   

        <2>. 输出数据

      * <b>注意：</b>
        * <font color=#00ffff>乱码问题</font>    
          <1>. PrintWriter pw = response.getWriter();获取的流的默认编码是ISO-8859-1   

          <2>. 告诉该流的默认编码     

          <3>. 告诉浏览器响应体使用的编码

          // <font color=#00ffff>简单的形式，设置编码，是在获取流之前的设置</font>         
          <font color=#00ffff>response.setContentType("text/html;charset=utf-8");</font>

      * 详细代码请看：\Response\code\服务器输出字符数据到浏览器
   
    3. 服务器输出字节数据到浏览器
      * 步骤：
        <1>. 获取字节输出流

        <2>. 输出数据

      * 详细代码请看：

    4. 验证码
      1. 本质：图片
      2. 目的：防止恶意表单注册


## ServletContext对象
  1. 概念：代表整个web应用，可以和程序的容器（服务器）来通信
  
  2. 获取：
    <1>. 通过request对象获取   
      <font color=#00ffff>request.getServlerContext()</font>

    <2>. 通过HttpServlet获取
      <font color=#00ffff>this.getServlerContext()</font>

  3. 功能：
    <1>. 获取MIME类型
      * <font color=#00ffff>MIME类型：在互联网通信过程中定义的一种文件数据类型</font>
        * <b>格式：大类型/小类型    text/html   image/jpeg</b>

      * <font color=#00ffff>获取：String getMimeType(String file)</font>

      * 

    <2>. 域对象：共享数据
      1). setAttribute(String name, Object value)

      2). getAttribute(String name)

      3). removeAttribute(String name)

      * ServletContext对象范围：所有用户所有请求的数据

      *  详细代码请看：studyJava\Response\code\servlet功能\ContextDemo3.java

    <3>. 获取文件的真实(服务器)路径
      1). 方法：String getRealPath(String path)

      2). 详细代码请看：studyJava\Response\code\servlet功能\ContextDemo5.java


## 练习
  * 文件下载需求：
    1. 页面显示超链接
  
    2. 点击超链接弹出下载提示框
   
    3. 完成图片文件下载

  * 分析：
    1. 超链接指向的资源如果能够被浏览器解析，则在浏览器中展示，如果不能解析，则弹出下载提示框。不满足需求

    2. 任何资源都必须弹出下载提示框
   
    3. 使用响应头设置资源的打开方式：
      * <font color=#00ffff>content-disposition:attachment;filename=xxx</font>

  * 步骤：
    1. 定义页面，编辑超链接href属性，执行Servlet，传递资源名称filename

    2. 定义Servlet
      <1>. 获取文件名称

      <2>. 使用字节输入流加载文件进内存

      <3>. 指定response的响应头，content-disposition:attachment;filename=xxx

      <4>. 将数据写出到response输出流

      <5>.详细代码请看: studyJava\Response\code\综合练习\非完美\DownloadServlet.java

  * 问题：
    * <b>中文文件问题</b>
      * <font color=#00ffff>解决思路：</font>
        1. 获取客户端使用的浏览器版本信息
        2. 根据不同的版本信息，设置filename的编码方式不同

    * 详细代码请看：studyJava\Response\code\综合练习\完美代码\DownloadServlet.java
