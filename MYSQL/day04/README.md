# 多表查询
## 1.SQL创建多表及多表的关系
        举例:
        <1>.导入数据
                // 建库
                create database day07;

                // 建category表
                create table category(
                    id int primary key auto_increment, 
                    name varchar(10),
                    scription varchar(30)
                );

                // 插入数据
                insert into category values(null,'手机数码','电子产品,黑马生产');
                insert into category values(null,'鞋靴箱包','江南皮鞋厂倾情打造');
                insert into category values(null,'香烟酒水','黄鹤楼,茅台,二锅头');
                insert into category values(null,'酸奶饼干','娃哈哈,蒙牛');
                insert into category values(null,'馋嘴零食','瓜子花生,辣条');

                // 建product表
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

        <2>.多表之间的关系如何来维护
                {1}.使用外键约束： foreign key
                        给子表product中的categoryId添加一个外键约束
                            alter table product add foreign key(categoryId) references category(id);
![添加外键约束(foreign key)](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day04/%E8%A7%A3%E9%87%8A%E5%9B%BE/foreignKey.png)

                {2}.添加之后，再在product表中添加category表中没有的id的数据会报错
                        举例:
                            insert into product values(null,'海贼王',5,null,8);
![添加数据失败](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day04/%E8%A7%A3%E9%87%8A%E5%9B%BE/foreignKey.png)

                {3}.添加外键约束后，不能直接删除父表category的数据，必须要把子表categoryId关联的数据全部删除之后才能删除
                        举例:
                            // 错误写法:
                            delete from category where id = 5;  

                            // 正确写法:
                            delete from product where categoryId = 5; // 先删除子表中和父表要删除的Id相关联的数据
                            delete from category where id = 5;

                {4}.解决删除后重新添加数据，序列号不是自增1的情况
                        解决办法:
                                每次执行删除后，重新定义auto_increment
                                delete from category where id = 5;
                                alter table category auto_increment = 1;
                                insert into category values(null,'馋嘴零食','瓜子花生,辣条');

![删除数据后插入数据，序号不是连续的](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day04/%E8%A7%A3%E9%87%8A%E5%9B%BE/bug.png)   
![重新定义auto_increment后再插入数据，bug解决](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day04/%E8%A7%A3%E9%87%8A%E5%9B%BE/resolveBug.png) 




        <3>.建数据库原则:
                通常情况下，一个项目/应用建一个数据库

        <4>.多表之间的建表原则:
                {1}.一对多: 商品和分类
                        建表原则: 在多的一方添加一个外键，指向一的一方的主键

                {2}.多对多: 老师和学生，学生和课程
                        建表原则: 建立一张中间表，将多对多的关系，拆分成一对多的关系
![多对多建表原则](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day04/%E8%A7%A3%E9%87%8A%E5%9B%BE/manyToMany.png)

                {3}.一对一: 公民和身份证
                        建表原则: 
                            [1].将一对一的情况，当做是一对多的情况处理，在任意一张表添加一个外键，并且这个外键要唯一，指向另一张表
                            
                            [2].直接将两张表合并成一张表

                            [3].将两张表的主键建立起连接，让两张表里面主键相等
![一对一建表原则](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day04/%E8%A7%A3%E9%87%8A%E5%9B%BE/oneToOne.png)

                        实际用途: 不常用 ( 拆表操作 )
                            相亲网站:
                                    个人信息: 姓名，性别，身高，体重，三围，兴趣爱好(年收入，特长，学历，职业，择偶目标，要求)
                                    拆表操作: 将个人的常用信息和不常用信息拆开，减少表的臃肿，减少用户的流量

## 2.举例
        <1>.用户表(用户的ID,用户名,密码,手机)   
                create table user(
                    userId int primary key auto_increment,
                    userName varchar(31),
                    passWord varchar(31),
                    phone varchar(11)
                );

                insert into user values(null,'张三','123456','15123009945');

        <2>.订单表(订单编号，总价，订单时间，地址，外键用户的ID) (用户和订单的关系是一对多)
                create table orders(
                    orderId int primary key auto_increment,
                    sum int,
                    orderTime timestamp,
                    address varchar(100),
                    userId int,
                    foreign key (userId) references user(userId)
                );
                
                insert into orders values(null,200,null,'渝中区商社时代1栋209',1);
                insert into orders values(null,300,null,'沙坪坝区杨叉湾小区4栋5-5',1);

        <3>.商品表(商品Id,商品名称，商品价格，外键分类Id) (分类和商品的关系是一对多)
                create table product(
                    goodsId int primary key auto_increment,
                    goodsName varchar(30),
                    price double,
                    dateTime timestamp,
                    categoryId int,
                    foreign key(categoryId) references category(id)
                );

                insert into product values(null,'小米9',2699,null,1);
                insert into product values(null,'iphoneXmax',8999,null,1);
                insert into product values(null,'香奈儿',15999,null,2);
                insert into product values(null,'老村长',88,null,3);
                insert into product values(null,'劲酒',35,null,3);
                insert into product values(null,'小熊饼干',1,null,4);
                insert into product values(null,'卫龙辣条',1,null,5);
                insert into product values(null,'旺旺雪饼',5,null,5);

        <4>.商品分类表(分表ID，分类名称，分类描述)
                create table category(
                    id int primary key auto_increment,
                    name varchar(10),
                    scription varchar(30)
                );

                insert into category values(null,'手机数码','电子产品,黑马生产');
                insert into category values(null,'鞋靴箱包','江南皮鞋厂倾情打造');
                insert into category values(null,'香烟酒水','黄鹤楼,茅台,二锅头');
                insert into category values(null,'酸奶饼干','娃哈哈,蒙牛');
                insert into category values(null,'馋嘴零食','瓜子花生,辣条');

        <5>.订单表: 中间表(订单ID,商品ID，商品数量，订单项总价) (因为订单和商品是多对多的关系)
                create table orderProduct(
                    orderNo int,
                    productNo int,
                    foreign key(orderNo) references orders(orderId),
                    foreign key(productNo) references product(goodsId),
                    count int,
                    orderSum double
                );
                // 给1号订单添加数据
                insert into orderProduct values(1,7,100,100);
                insert into orderProduct values(1,8,5,25);
                // 给2号订单添加数据
                insert into orderProduct values(2,2,1,8999);

## 3.主键约束和唯一约束的区别
        <1>.主键约束: 默认就是不能为空，唯一
            {1}.外键都是指向另一张表的主键
            {2}.主键一张表只能有1个

        <2>.唯一约束: 列里面的内容，必须是唯一，不能出现重复的情况，可为空
            {1}.唯一约束不可以作为其他表的外键
            {2}.可以有多个唯一约束

## 4.交叉连接查询 笛卡尔积
        <1>.举例: (乘积关系，查询出来没有任何意义)
                select * from product,category;

            过滤有意义的数据
                select * from product,category where categoryId = id;
![过滤后](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day04/%E8%A7%A3%E9%87%8A%E5%9B%BE/product.png)

## 5.内连接查询
        <1>.隐式内连接
                select * from product p, category c where p.categoryId = c.id;
            
            查询结果同4.

        <2>.显式内连接(inner join...on...)
                select * from product p inner join category c on p.categoryId = c.id;  
           
            查询结果同4   

        <3>.隐式内连接和显式内连接的区别:
                隐式内连接: 在查询出结果的基础上去做的where条件过滤
                显式内连接: 带着查询条件去查询结果，执行效率高   

## 6.外连接查询(outer join...on...)
        <1>.左外连接
                select * from product p left outer join category c on p.categoryId = c.id; 

                举例:
                    insert into product values(null,'Adidas',500,null,null);   
![左外连接](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day04/%E8%A7%A3%E9%87%8A%E5%9B%BE/leftOuterProduct.png)
![内连接](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day04/%E8%A7%A3%E9%87%8A%E5%9B%BE/innerProduct.png)

        <2>.右外连接
            select * from product p right outer join category c on p.categoryId = c.id; 
                举例:
                    insert into category values(100,'电脑办公','华硕'); 
![右外连接](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/day04/%E8%A7%A3%E9%87%8A%E5%9B%BE/rightOuterProduct.png)

        内连接和外连接的区别:
                内连接是两张表的交集，外连接是两张表的并集
        