# 今日内容
  1. 会话技术
    <1>. Cookie
    <2>. Session

  2. JSP: 入门学习


## 会话技术
  1. 会话：一次会话中包含了多次请求和响应   
    * <font color=#00ffff>一次会话：浏览器第一次给服务器资源发送请求，会话建立，直到有一方断开为止</font>

  2. 功能：在异常会话的范围内的多次请求间，共享数据

  3. 方式：   
    <1>. 客户端会话技术：Cookie   
    <2>. 服务器端会话技术：Session 


## Cookie
  1. 概念：客户端会话技术，将数据保存到客户端

  2. 快速入门：
    * <b>使用步骤：</b>  
      <1>. 创建Cookie对象，绑定数据
        * <font color=#00ffff>new Cookie(String name, String value)</font>

      <2>. 发送Cookie对象
        * <font color=#00ffff>response.addCookie(Cookie, cookie)</font>

      <3>. 获取Cookie,拿到数据
        * <font color=#00ffff>Cookie[] request.getCookies()</font>

      <4>. 详细代码请看：studyJava\Cookie\code\入门\CookieDemo1.java

  3. 实现原理   
    * <font color=#00ffff>基于响应头set-cookie和请求头cookie实现</font>

  4. cookie细节   
    <1>. 一次可不可以发送多个cookie?   
      * <font color=#00ffff>可以</font>
      * <font color=#00ffff>可以创建多个Cookie对象，使用response调用多次addCookie方法发送cookie即可</font>
      
      * <b>详细代码请看：studyJava\Cookie\code\一次可以发送多个Cookie\CookieDemo3.java</b>

    <2>. cookie在浏览器中保存多长时间？
      1). 默认情况下，当浏览器关闭后，Cookie数据被销毁

      2). 持久化存储：
  * <font color=#00ffff>setMaxAge(int seconds)</font>  
        
          1. 正数：将Cookies数据写到硬盘的文件中。持久化存储。cookie存活时间
          
          2. 负数：默认值
          
          3. 零：删除cookie信息

      3).详细代码请看：studyJava\Cookie\code\持久化存储\CookieDemo4.java

    <3>. cookie能不能存中文?
      * <font color=#00ffff>在tomcat 8之前，cookie中不能直接存储中文数据</font>
        * <font color=#00ffff>需要将中文数据转码---一般采用URL编码(%E3)</font>

      * <font color=#00ffff>在tomcat 8之后，cookie支持中文数据。特殊字符还是不支持，建议使用URL编码存储，URL编码解析</font>

    <4>. cookie获取范围多大?
      1. 假设在一个tomcat服务器中，部署了多个web项目，那么在这些项目中cookie能不能共享？   
        * <font color=#00ffff>默认情况下cookie不能共享           
        * setPath(String path): 设置cookie的获取范围。默认情况下，设置当前的虚拟目录
           * 如果要共享，则可以将path设置为"/"</font>

      2. 不同的tomcat服务器间cookie共享问题？
        * <font color=#00ffff>setDomain(String path)：如果设置一级域名相同，那么多个服务器之间cookie可以共享
          * setDomain(".baidu.com")，那么tieba.baidu.com和news.baidu.com中的cookie可以共享</font>

  5. Cookie的特点和作用   
    * 特点：    
      <1>. Cookie存储数据在客户端浏览器

      <2>. 浏览器对于单个cookie的大小有限制(4kb) 以及对同一个域名下的总cookie数量也有限制(20个)

    * 作用：
      <1>. cookie一般用于存储少量的不太敏感的数据

      <2>. 在不登录的情况下，完成服务器对客户端的身份识别

  
## 练习：记住上一次访问时间
  1. 需求：
    <1>. 访问一个servlet， 如果是第一次访问，则提示：您好，欢迎您首次访问

    <2>. 如果不是第一次访问，则提示：欢迎回来，您上次访问时间为：显示时间字符串

  2. 分析：   
    <1>. 在服务器中的servlet判断是否有一个名为lastTime的cookie   
      1). 有：不是第一次访问   
        {1}. 响应数据：欢迎回来，您上次访问时间为：2019年10月13日15:29:01    
        {2}. 写回cookie: lastTime=2019年10月13日15:29:59

      2). 没有：是第一次访问   
        {1}. 响应数据：您好，欢迎您首次访问   
        {2}. 写回cookie: lastTime=2019年10月13日15:31:09

  3. 详细代码请看： studyJava\Cookie\code\练习\CookieTest.java
