# 今日内容
  1. 数据库连接池
  2. Spring JDBC: JDBC Template


## 数据库连接池
  1. 概念：其实就是一个容器（集合），存放数据库连接的容器。<font color=#00ffff>当系统初始化好后，容器被创建，容器中会申请一些连接对象，当用户来访问数据库时，从容器中获取连接对象，用户访问完之后，会将连接对象归还给容器。</font>

  2. 好处：
    * 节约资源
    * 用户访问高新

  3. 实现：
    1. 标准接口： DataSource javax.sql包下的
      
      1. 方法：
        * <font color=#00ffff>获取连接：getConnection()</font>

        * <font color=#00ffff>归还连接：Connection.close()。如果连接对象Connection是从连接池中获取的，那么调用Connection.close()方法，则不会再关闭连接了。而是归还连接</font>

      2. 一般我们不会实现它，有数据库厂商来实现
        * C3P0: 数据库连接池技术
        * Druid: 数据库连接池实现技术，有阿里巴巴提供的

  4. Druid: 数据库连接池实现技术，有阿里巴巴提供的   
    1. <font color=#00ffff>步骤：</font>
      1. 导入jar包 druid-1.0.9.jar
   
      2. 定义配置文件：
        * <font color=#00ffff>是properties形式的</font>
        * <font color=#00ffff>可以叫任意名称，可以放在任意目录下</font>

      3. 获取数据库连接池对象：通过工厂类来获取  DruidDataSourceFactory

      4. 获取连接： getConnection
      
      5. 详细代码请看：JDBC\JDBC连接池\code\druid连接池

    2. 定义工具类
      1. 定义一个类 JDBCUtils
      2. 提供静态代码块加载配置文件，初始化连接池对象
      3. 提供方法
        1. 获取连接方法：通过数据库连接池获取连接
        2. 释放资源
        3. 获取连接池的方法
      4. 详细代码请看：JDBC\JDBC连接池\code\druid工具类



## Spring JDBC
  * Spring框架对JDBC的简单封装，提供了一个JDBCTemplate对象简化JDBC的开发

  * 步骤：
    1. 导入jar包