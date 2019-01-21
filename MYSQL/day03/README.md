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
                
## 3.删除数据
        <1>.格式:
                delete from 表名 [where条件]

        <2>.举例:
                delete from student where userName='lili';
![删除数据](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/deleteData.png)

        <3>.delete from student;    如果没有指定where条件，会一条条的删除数据，直到清空

        <4>.面试问题: 1.delete和truncate删除数据的区别？
                            答: {1}.delete: DML,一条一条的删除数据
                                {2}.truncate: DDL，先删除表再重建表
                     
                     2.哪个的执行效率高?
                            答: 如果数据少，使用delete高效，如果数据多，truncate高效。

## 4.更新表数据
        <1>.格式:
                update 表名 set 列名=列的值，列名2=列2的值 [where条件];

        <2>.举例:
                update student set userName='张三',age=30 where userId=001;
![更新数据](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/updateData.png)

        <3>.如果不加where语句，则所有数据都会被修改
                update student set age=40;
![批量更新数据](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/updateData2.png)

##  5.查询数据
        <1>.格式:
                select [distinct] [*] [列名，列名2] from 表名 [where条件]

        <2>.举例: 创建商品分类和商品表并查询
                {1}.商品分类: 
                        1).分类的ID
                        2).分类名称
                        3).分类描述

                        4).具体实现:
                            // 创建表
                            create table category(
                                id int primary key auto_increment, // auto_increment:自动增长
                                name varchar(10),
                                scription varchar(30)
                            );
                            
                            // 插入数据
                            insert into category values(null,'手机数码','电子产品,黑马生产');
                            insert into category values(null,'鞋靴箱包','江南皮鞋厂倾情打造');
                            insert into category values(null,'香烟酒水','黄鹤楼,茅台,二锅头');
                            insert into category values(null,'酸奶饼干','娃哈哈,蒙牛');
                            insert into category values(null,'馋嘴零食','瓜子花生,辣条');

                {2}. 查询所有数据
                        select * from category;
![查询所有数据](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/searchData.png)

                {3}.查看指定的数据
                        select name from category; // 只返回name
![查询返回指定数据](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/searchData2.png)

                {4}.所有商品
                        1).商品Id
                        2).商品名称
                        3).商品的价格
                        4).生产日期
                        5).商品分类Id       商品与商品分类: 所属关系

                        6).具体实现:
                            // 创建表
                            create Table product(
                                goodsId int primary key auto_increment,
                                goodsName varchar(30),
                                price double,
                                dateTime timestamp,
                                categoryId int
                            );

                            // 插入数据
                            insert into product values(null,'小米9',2699,null,1);
                            insert into product values(null,'iphoneXmax',8999,null,1);
                            insert into product values(null,'香奈儿',15999,null,2);
                            insert into product values(null,'老村长',88,null,3);
                            insert into product values(null,'劲酒',35,null,3);
                            insert into product values(null,'小熊饼干',1,null,4);
                            insert into product values(null,'卫龙辣条',1,null,5);
                            insert into product values(null,'旺旺雪饼',5,null,5);

                {5}.简单查询:
                        1).查询所有的商品
                                select * from product;
                        
                        2).查询商品名称和商品价格
                                select goodsName, price from product;

                        3).别名查询 (as关键字, as可以省略)
                                [1].表别名:
                                        select p.goodsName, p.price from product p; (p是别名，也可以看成是常量)

                                [2].列别名:
                                        select goodsName as 商品名称, price as 商品价格 from product;

                                        // 省略as，完全一样
                                        select goodsName 商品名称, price 商品价格 from product;
![列别名之前](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/aliasBefor.png)  

![列别名之后](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/aliasAfter.png)
                        
                        4).去掉重复的值(distinct)
                            需求: 查询所有商品的价格
                                select price from product;
                            // 去重
                                select distinct price from product;

                        5). select运算查询
                                select *, price*0.8 from product;
                                select *, price*0.8 as 折后价 from product;
![select运算前](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/calculateBefore.png)

![select运算后](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/calculateAfter.png)
                                        
                {6}.条件查询:(where关键字)
                        1).查询商品价格>60元的所有商品信息
                                select * from product where price>60;

                        2).where后面的条件写法
                                [1].关系运算符: > >= < <= != <>
                                    <>和!=是一样的，都是不等于,前者是标准的sql语法，后者是非标准的

                                [2].逻辑运算符: and, or, not

                        3).查询商品价格不等于88元的所有商品信息
                                select * from product where price <> 88;

                        4).查询商品价格在10到100之间的商品信息
                                select * from product where price >10 and price < 100;

                            或者使用 between...and...
                                select * from product where price between 10 and 100;

                        5).查询商品价格小于100或者大于900的所有商品
                                select * from product where price >900 or price < 100;

                {7}.模糊查询: (like，in)
                        like:   1). _: 代表的是一个字符
                                    %：代表的是多个字符

                                2).举例:
                                    [1].查询出名字带有饼的所有商品
                                            select * from product where goodsName like '%饼%';
![模糊查询like(%)](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/searchData3.png)

                                    [2]. 查询第二个名字是熊的所有商品
                                            select * from product where goodsName like '_熊%';
![模糊查询like(_)](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/searchData4.png)

                        in: 在某个范围内获取值
                                1).举例:
                                    [1].查询出商品分类ID在1,4,5里面所有的商品
                                            select * from product where categoryId in (1,4,5);
![模糊查询in](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/searchData5.png)

                {8}.排序查询: order by
                        1).asc: ascend升序(默认)    
                        2).desc: descend降序

                        3).举例:
                                [1].查询所有商品，按照价格升序排序
                                        select * from product order by price;
![升序排序asc](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/searchData6.png)

                                [2].查询所有商品，按照价格降序排序
                                        select * from product oreder by price desc;
![升序排序desc](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/searchData7.png)

                                [3].查询名称有'小'的商品,按价格升序
                                        select * from product where goodsName like '%小%' order by price;
![复合查询](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/searchData8.png)

                {9}.聚合函数
                        1).sum(): 求和
                        2).avg(): 求平均值
                        3).count(): 统计数量
                        4).max(): 最大值
                        5).min(): 最小值

                        6).举例:
                                [1].获取所有商品价格的总和
                                        select sum(price) from product;
![sum()求和](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/searchData9.png)

                                [2].获取所有商品的平均价格
                                        select avg(price) from product;
![avg()求平均值](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/searchData10.png)

                                [3].获取所有商品的个数
                                        select count(*) from product;
![count()求总数](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/searchData11.png)

                        7).注意： where条件后面不能接聚合函数
                        --------  子查询 --------------------
                                [1].查出商品价格大于平均价格的所有商品
                                
                                错误写法:
                                    select * from product where price > avg(price);

                                正确写法:
                                    select * from product where price > (select avg(price) from product);
![(子查询](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/searchData12.png)

                {10}.分组查询: group by
                        1)举例:
                            [1].根据categoryId字段分组，分组后统计商品的个数
                                    select categoryId, count(*) from product group by categoryId;
![分组查询](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/searchData13.png)

                            [2].根据categoryId分组，分组统计每组商品的平均价格，并且商品平均价格>60
                                    select categoryId, count(*) from product group by categoryId having avg(price) > 60;
![分组查询(having)](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day03/%E8%A7%A3%E9%87%8A%E5%9B%BE/searchData13.png)

                        2).注意:
                                [1].having 关键字，可以接聚合函数，出现在分组之后
                                [2].where 关键字，不可以接聚合函数，出现在分组之前

## 6.sql的编写顺序和执行顺序
        <1>.编写顺序
                S...F...W...G...H...O
                select...from...where...group by...having...order by

        <2>.执行顺序
                F...W...G...H...S...O
                from...where...group by...having...select...order by

                    

                







                
                     