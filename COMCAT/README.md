# web相关概念问题

1. 软件架构:
  * C/S: 客户端/服务器端
  * B/S：浏览器/服务器端

2. 资源分类
  * 静态资源: 所有用户访问后，得到的结果都是一样的，成为静态资源资源，静态资源可以直接被浏览器解析
    * 如: html、css、javascript
  
  * 动态资源: 每个用户访问相同资源后，得到的结果可能不一样。称为动态资源。
    * 如: servlet/jsp, php, asp...

3. 网络通信三要素
  * IP： 电子设备(计算机)在网络中的唯一标识。
  * 端口: 应用程序在计算机中的唯一标识。 0-65536
  * 传输协议: 规定了数据传输的规则
    * 基础协议:
      * TCP: 安全协议，三次握手。 速度稍慢
      * UDP：不安全协议。 速度快

# web服务器软件

* 服务器：安装了服务器软件的计算机

* 服务器软件: 接收用户的请求，处理请求，做出响应

* web服务器软件：接收用户的请求，处理请求，做出响应。
  * <font color=#00ffff>在web服务器中，可以部署web项目,让用户通过浏览器来访问这些项目</font>
  * <font color=#00ffff>web容器</font>
  
* 常见的java相关的web服务器软件:
  * webLogic : oracle公司，大型的JavaEE服务器，支持所有的javaEE规范，收费的
  * webSphere：IBM公司，大型的JavaEE服务器，支持所有的javaEE规范，收费的
  * JBOSS： JBOSS公司, 大型的JavaEE服务器，支持所有的javaEE规范，收费的
  * Tomcat: Apache基金组织，中小型的JaveEE服务器，仅仅支持少量的JavaEE规范servlet/jsp，开源的，免费

* JavaEE: Java语言在企业级开发中使用的技术规范的总和，一共规定了13个规范。

# Tomcat:   web服务器软件

1. 下载: https://tomcat.apache.org/
  
2. 安装: 解压压缩包即可。
   * <font color=#00ffff>注意： 安装目录建议不要有中文和空格</font>

3. 卸载: 删除目录即可

4. 启动:
   * <font color=#00ffff>bin/startup.bat, 双击运行该文件即可</font>
   * <font color=#00ffff>访问: 浏览器输入: http://localhost:8080 回车访问自己，   http://别人的ip:8080 访问别人
  </font>
   
   * 可能遇到的问题：
      1. 黑窗口一闪而过: 
        * <font color=#00ffff>原因: 没有正确配置JAVA_HOME环境变量</font>
        * <font color=#00ffff>解决方案: 正确配置JAVA_HOME环境变量</font>

      2. 启动报错:
         1. 暴力: 找到占用的端口号，并且找到对应的进程，杀死该进程
            * 输入cmd进入dos窗口， 输入: netstat -ano, 找到PID
            
            * win10下打开任务管理器，点击详细信息，找到PID给他干掉
        
          2. 温柔: 修改自身的端口号
            * <font color=#00ffff>conf/server.xml</font>
            
            * <font color=#00ffff></Connector port="8080" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" /></font>

5. 关闭:
   1. 正常关闭:
      * <font color=#00ffff>点击bin/shutdown.bat</font>
      * <font color=#00ffff>ctrl + c</font>

    2. 强制关闭: 
      * 点击启动窗口的X

6. 配置:
  * 部署项目的方式: 
    1. 直接将项目放到webapps目录下即可。
      * <font color=#00ffff>/hello: 项目的访问路径 -->虚拟目录</font>

      * <font color=#00ffff>简化部署: 将项目打包成一个war包，再将war包放置到webapps目录下</font>
        * <font color=#00ffff>war包会自动解压缩</font>

      * ![方式一: ](https://raw.githubusercontent.com/dj49846917/studyJava/master/day01/%E8%A7%A3%E9%87%8A%E5%9B%BE/path1.png)
      
      * 访问: http://localhost:8080/hello/helloworld.html

    2. 配置conf/server.xml文件
      * <font color=#00ffff>在<Host>文件中配置 </Context docBase="D:\hello" path="/hehe" /></font>
        * docBase: 项目存放的路径
        * path: 虚拟目录

      * ![方式二1: ](https://raw.githubusercontent.com/dj49846917/studyJava/master/day01/%E8%A7%A3%E9%87%8A%E5%9B%BE/path1.png)
      
      * ![方式二2: ](https://raw.githubusercontent.com/dj49846917/studyJava/master/day01/%E8%A7%A3%E9%87%8A%E5%9B%BE/path1.png)
      
      * ![方式二3: ](https://raw.githubusercontent.com/dj49846917/studyJava/master/day01/%E8%A7%A3%E9%87%8A%E5%9B%BE/path1.png)
      
      * 访问: http://localhost:8080/hehe/helloworld.html

    3. 在conf\Catalina\localhost创建任意名称的xml文件。在文件中编写<font color=#00ffff></Context docBase="D:\hello" /></font>
      * 虚拟目录: xml文件的名称

      * ![方式三1: ](https://raw.githubusercontent.com/dj49846917/studyJava/master/day01/%E8%A7%A3%E9%87%8A%E5%9B%BE/path1.png)
      
      * ![方式三2: ](https://raw.githubusercontent.com/dj49846917/studyJava/master/day01/%E8%A7%A3%E9%87%8A%E5%9B%BE/path1.png)
      
      * ![方式三3: ](https://raw.githubusercontent.com/dj49846917/studyJava/master/day01/%E8%A7%A3%E9%87%8A%E5%9B%BE/path1.png)

      * 访问: http://localhost:8080/bbb/helloworld.html

# 静态项目和动态项目

* 目录结构:
  * java动态项目的目录结构:   
    --  项目的根目录    
        --  WEB-INF目录:    
            --  web.xml: web项目的核心配置文件   
            --  classes目录: 放置字节码文件的目录    
            --  lib目录: 放置依赖的jar包