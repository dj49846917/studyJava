# 表的CRUD操作
## 1.创建表
        <1>.格式:
                create table 表名(
                    列名 列的类型 约束,
                    列名2 列的类型 约束
                );
        
        <2>.列的类型:
                java            sql
                int             int
                char/string     char/varchar
                                char: 固定长度
                                varchar: 可变长度
                                char(3): 输入: "一"     输出: "一空格空格"
                                varchar(3): 输入: "一"  输出: "一"
                double          double
                float           float
                boolean         boolean
                date            date: YYYY-MM-DD
                                time: hh:mm:ss
                                datetime: YYYY-MM-DD hh:mm:ss 默认值是null
                                timestamp: YYYY-MM-DD hh:mm:ss 默认值是当前时间
                                text: 主要是用来存放文本
                                blob: 存放的是二进制   

        <3>.列的约束:
                主键约束: primary key
                唯一约束: unique
                非空约束: not null

        <4>.创建表:
                1.分析实体: 学生
                2.学生ID
                3.姓名
                4.性别
                5.年龄
                6.举例:
                        create table student(
                            myid int primary key,
                            myname varchar(20),
                            sex int,
                            age int
                        );
![创建student表](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day02/%E8%A7%A3%E9%87%8A%E5%9B%BE/createTable.png)
    

## 2.查看表
        <1>.查看所有的表
                {1}.show tables;

        <2>.查看表的定义
                {1}.show create table student;

        <3>.查看表的结构
                {1}.desc student;

## 3.修改表
        <1>.添加列(add),修改列(modify),修改列名(change),删除列(drop),修改表名(rename),修改表的字符集
                
                1). 添加列(add)
                        {1}.格式:
                                alter table 表名 add 列名 列的类型 列的约束;
                        {2}.举例:
                                alter table student add achievement int not null;
![添加列](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day02/%E8%A7%A3%E9%87%8A%E5%9B%BE/addTd.png)

                2). 修改列(modify)
                        {1}.格式:
                                alter table 表名 modify 列名 列的类型 列的约束;                       
                        {2}.举例:
                                alter table student modify sex varchar(2) not null;
![修改列](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day02/%E8%A7%A3%E9%87%8A%E5%9B%BE/modifyTd.png)

                3).修改列名(change)
                        {1}.格式:
                                alter table 表名 change 列名 修改后的列名 列的类型 列的约束;
                        {2}.举例:
                                alter table student change sex gender varchar(2);
![修改列名](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day02/%E8%A7%A3%E9%87%8A%E5%9B%BE/changeTdName.png)

                4).删除列(drop)
                        {1}.格式:
                                alter table 表名 drop 列名;
                        {2}.举例:
                                alter table student drop achievement;
![删除列](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day02/%E8%A7%A3%E9%87%8A%E5%9B%BE/dropTd.png)

                5).修改表名(rename)
                        {1}.格式:
                                rename table 表名 to 修改后的表名;
                        {2}.举例:
                                rename table student to heima;
![修改表名](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day02/%E8%A7%A3%E9%87%8A%E5%9B%BE/renameTable.png)

                6).修改表的字符集
                        {1}.格式:
                                alter table 表名 character set 修改后的字符集;
                        {2}.举例:
                                alter table heima character set gbk;
![修改表的字符集](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day02/%E8%A7%A3%E9%87%8A%E5%9B%BE/changeTableCharacter.png)

##  4.删除表
        {1}.格式:
                drop table 表名;
        {2}.举例:
                drop table heima;

                