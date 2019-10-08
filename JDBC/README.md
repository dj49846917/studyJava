# 今日入门
  1. JDBC基本概念
  2. 快速入门
  3. 对JDBC中各个接口和类详解

## JDBC:
1. 概念: Java DataBase Connectivity Java 数据库连接， Java语言操作数据库
  * <font color=#00ffff>JDBC本质：其实是官方定义的一套操作所有关系型数据库的规则（接口）。各个数据库厂商取实现这套接口，提供数据库驱动jar包。我们可以使用这套接口(JDBC)编程，真正执行的代码是驱动jar包中的实现类</font>

2. 快速入门:
  * 步骤:
    1. 导入驱动jar包（mysql-connector-java-5.1.37）
      * <font color=#00ffff>先新建一个lib文件夹，把包放到这个文件夹里</font>
      * <font color=#00ffff>选中lib文件夹，右键选择Add as Library</font>
    
    2. 注册驱动
      * <font color=#00ffff>Class.forName("com.mysql.jdbc.Driver");</font>

    3. 获取数据库连接对象Connection
      * <font color=#00ffff> Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");</font>
    
    4. 定义sql
      * <font color=#00ffff>String sql = "update stu set age = 500 where id = 2";</font>
    
    5. 获取执行sql语句的对象 Statement
      * <font color=#00ffff>Statement stmt = conn.createStatement();</font>
    
    6. 执行sql,接收返回结果
      * <font color=#00ffff>int count = stmt.executeUpdate(sql);</font>
    
    7. 处理结果
      * <font color=#00ffff>System.out.println(count);</font>
    
    8. 释放资源
      * <font color=#00ffff>stmt.close()  conn.close()</font>

    9. 详细代码请看: JDBC/code/JdbcDemo1.java

3. 详解各个对象
   1. DriverManager: 驱动管理对象
    * 功能:
      1. 注册驱动：告诉程序该使用哪一个数据库驱动jar
        ```
          static void registerDriver(Driver driver): 注册与给定的驱动程序 DriverManager。

          写代码使用： Class.forName("com.mysql.jdbc.Driver");

          通过看源码发现，在com.mysql.jdbc.Driver类中存在静态代码块
          static {
            try {
              java.sql.DriverManager.registerDriver(new Driver());
            } catch (SQLException E) {
              throw new RuntimeException("cannot register driver!");
            }
          }

          注意: mysql5之后的驱动jar包可以省略注册驱动的步骤
        ```

      2. 获取数据库连接：
        * <font color=#00ffff>方法：static Connection(String url, String user, String password)</font>
        * 参数：
          * url: 指定连接的路径
            * <font color=#00ffff>语法： jdbc:mysql://ip地址(域名):端口号/数据库名称</font>

            * <font color=#00ffff>例子： jdbc:mysql://localhost:3306/db1</font>
  
            * <font color=#00ffff>细节： 如果连接的是本机mysql服务器，并且mysql服务默认端口是3306，则url可以简写为：jdbc:mysql:///数据库名称</font>
  
          * user: 用户名
  
          * password： 密码

   2. Connection: 数据库连接对象
    * 功能：
      1. 获取执行sql的对象
        * <font color=#00ffff>Statement createStatement()</font>

        * <font color=#00ffff>PreparedStatement prepareStatement(String sql)</font>

      2. 管理实务：
        * <font color=#00ffff>开启事务：setAutoCommit(boolean autoCommit): 调用该方法设置参数为false, 即开启事务</font>

        * <font color=#00ffff>提交事务：commit()</font>

        * <font color=#00ffff>回滚事务：rollback()</font>
   
   3. Statment: 执行sql的对象
    * 执行sql
      1. boolean execute(String sql): 可以执行任意的sql 了解
   
      2. int excuteUpdate(String sql): 执行DML(insert、update、delete)语句、DDL(create、alter、drop)语句
        * <font color=#00ffff>返回值：影响的行数，可以通过这个影响的行数判断DML语句是否执行成功 返回值>0的则执行成功，反之，则失败。</font>

      3. ResultSet executeQuery(String sql): 执行DQL(select)语句

    * 练习
      1. stu表 添加一条记录
        * 详细代码请看: JDBC/code/JdbcDemo2.java

      2. stu表 修改一条记录
        * 详细代码请看: JDBC/code/JdbcDemo3.java

      3. stu表 删除一条记录
        * 详细代码请看: JDBC/code/JdbcDemo4.java

   4. ResultSet: 结果集对象, 封装查询结果
    * <font color=#00ffff>boolean next(): 游标向下移动一行, 判断当前行是否是最后一行末尾(是否有数据),如果是，则返回false, 如果不是则返回true</font>

    * <font color=#00ffff>getXxx(参数): 获取数据
      * Xxx: 代表数据类型   如：int getInt(), String getString()</font>
      * 参数:
        1. int：代表列的编号， 从1开始 如：getString(1)
        2. String: getDouble("balance")

    * <font color=#00ffff>注意：</font>
      * 使用步骤：
        1. 游标向下移动一行
        2. 判断是否有数据
        3. 获取数据
        4. 详细代码请看: JDBC/code/JdbcDemo7.java
```
        while (rs.next()){
          // 循环判断游标是否是最后一行末尾
          // 获取数据
          int id = rs.getInt(1);
          String name = rs.getString("name");
          int age = rs.getInt(3);
          System.out.println(id +"-----"+ name +"-----"+ age);
        }
```

   1. PreparedStatement: 执行sql的对象
