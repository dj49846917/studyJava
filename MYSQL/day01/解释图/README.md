# mysql学习
## 1.mysql的安装与卸载
        <1>.卸载:(默认路径)
                {1}.打开控制面板，删除软件
                {2}.删除mysql安装目录的所有文件:    C:\Program Files\MySQL
                {3}.删除mysql数据存放文件:      C:\ProgramData\MySQL

        <2>.安装
                {1}.一路next
                {2}.环境变量配置
                    {1}.在系统变量中新建MYSQL_HOME,并写入C:\Program Files\MySQL\MySQL Server 5.5
![mysql安装1](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day01/%E8%A7%A3%E9%87%8A%E5%9B%BE/1.png)
                    {2}.在编辑中写入:
                        %MYSQL_HOME%\bin
![mysql安装2](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day01/%E8%A7%A3%E9%87%8A%E5%9B%BE/2.png)

## 2.MYSQL的分类
    <1>. DDL: 数据定义语言: 定义数据库，数据表他们的结构
            {1}.举例:  create(创建)  drop(删除)  alter(修改)

    <2> DML: 数据操作语言：主要是用来操作数据
            {1}.举例:   insert(插入)    update(修改)    delete(删除)

    <3>.DCL: 数据控制语言:定义访问权限，取消访问权限，安全设置  
            {1}.举例: grant

    <4>.DQL: 数据查询语言: select(查询)    from子句    where子句

## 3.数据库的CRUD操作
    <1>.首先要登录数据库服务器
            {1}.windows+R打开控制台，输入:
                    mysql -uroot -proot

    <2>.创建数据库
            {1}.在命令行输入: create database 数据库的名字;   (一定要有分号)
                    1).举例:
                            create database day06;
![创建数据库](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day01/%E8%A7%A3%E9%87%8A%E5%9B%BE/3.png)

            {2}.创建数据库时，指定字符集
                    1).在命令行输入: create database 数据库的名字 character set utf8;
                    2).举例:
                            create database day06 character set utf8; 

    <3>.查看数据库
            {1}.查看所有的数据库
                    1).命令行输入:  show databases;  
                    2).注意：
                            infomation_schema和mysql、performance_schema不要动他

            {2}.查看数据库定义的语句
                    1).命令行输入: show create database day06;  

    <4>.修改数据库
            {1}.修改数据的字符集
                    1).命令行输入:  alter database 数据库的名字 character set 字符集;
                    2).举例:
                            alter databse day06_2 character set utf8;     

    <5>.删除数据库
            {1}.命令行输入: drop database day06;
            {2}.举例:
                    drop database day06;

    <6>.其他数据库操作命令
            {1}.切换数据库(选中数据库)
                    1).use 数据库名字;
                    2).举例:
                            use day06_2;

            {2}.查看一下当前正在使用的数据库
                    1).select database();    
        
