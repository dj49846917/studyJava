# sql完成对表中数据的CRUD操作
## 1.插入数据
        {1}.格式：
            insert into 表名(列名1,列名2,列名3...)values(值1,值2,值3);

        {2}.举例:
            insert into student(userId,userName,age)values(001,'zhangsan',20);
![插入数据](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/insertTd.png)

        {3}.注意:
                1).如果插入部分列的话，列名不能省略
                    insert into student(userId,userName)values(002,'wangmazi');

                2).如果插入的是全列表，列名可以省略
                    insert into student values(003,'zhaosi',19);

        {4}.查看所有数据
                select * from student;
![查看数据](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/lookData.png)

        {5}.批量插入
                {1}.举例:
                        insert into student values(005,'lili',21),(006,'lili',21),(007,'lili',21);
![批量插入](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/lookData.png)

## 2.解决mysql不能插入中文的问题
        <1>.问题说明:
                在创建test表的时候，是执行的 create database test character set utf8;现在在插入数据的时候，如果输入了中文就会报错
![中文无法插入问题1](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/problem1.png)
![中文无法插入问题2](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/problem2.png)

        <2>.解决办法:
                {0}关闭当前的数据库
                {1}.找到mysql安装路径中的my.int配置文件  C:\Program Files\MySQL\MySQL Server 5.5,并打开
                {2}.修改default-character-set=utf8  改为default-character-set=gbk
![解决办法](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/solveProblem.png)
![解决办法2](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/solveProblem2.png)
                