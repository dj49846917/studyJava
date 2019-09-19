# XML
##  1.概念： 可扩展标记语言

* 可拓展： 标签都是自定义的。<user> <student>  

* 功能
    * 存储数据
        1. 配置文件
        2. 在网络中传输

    * xml与html的区别
        1. xml标签都是自定义的，html标签是预定义
        2. xml的语法严格，html语法松散
        3. xml是存储数据的，html是显示数据的


## 2.语法:

* 基本语法:
    1. xml文档的后缀名 .xml
    2. xml第一行必须定义为文档声明
    3. xml文档中有且仅有一个跟标签
    4. 属性值必须使用引号(单双都可)引起来
    5. 标签必须正确关闭
    6. xml标签名称区分大小写

* 快速入门:
```
    <?xml version='1.0' ?>
    <users>
        <user id="1">
            <name>张三</name>
            <age>24</age>
        </user>

        <user id="2">
            <name>李四</name>
            <age>20</age>
        </user>
    </users>
```

* 组成部分
    1. 文档声明:
        1. 格式: <?xml 属性列表 ?>
        2. 属性列表:
            * version: 版本号，必须的属性
            * encoding: 编码方式。告知解析引擎当前文档使用的字符集，默认值: ISO-8859-1
            * standalone: 是否独立(没什么用)
                * 取值:
                    * yes: 不依赖其他文件
                    * no: 依赖其他文件
    
    2. 指令
    
    3. 标签：标签名称自定义的
        
        * 规则:
            * 名称可以包含字母、数字以及其他的字符
            * 名称不能以数字或者标点符号开始
            * 名称不能以字母 xml开始
            * 名称不能包含空格
  
    4. 属性:   
        id属性值唯一
    
    5. 文本:
        * CDATA区： 在该区域中的数据会被原样展示
          * 格式：  <![CDATA[ 数据 ]]>

* 约束：规定xml文档的书写规则
    * 作为框架的使用者：
        1. 能够在xml中引入约束文档
        2. 能够简单的读懂约束文档

    * 分类
        1. DTD: 一种简单约束技术
        2. Schema: 一种复杂的约束技术

    * DTD:
        * 引入dtd文档到xml文档中
            * 内部dtd: 将约束规则定义在xml文档中, [查看具体内容](https://github.com/dj49846917/studyJava/blob/master/XML/day02/dtd/student2.xml)
            * 外部dtd: 将约束的规则定义在外部的dtd文件中, [查看具体内容](https://github.com/dj49846917/studyJava/tree/master/XML/day02/dtd/student.dtd)
                * 本地: \<!DOCTYPE 根标签名 SYSTEM "dtd文件的位置">
                * 网络: \<!DOCTYPE 根标签名 PUBLIC "dtd文件名字" "dtd文件的url">
```
* 外部dtd，本地： 
    在student.xml中引入student.dtd

    <?xml version="1.0" encoding="UTF-8" ?>
    <!DOCTYPE students SYSTEM "student.dtd">

    <students>
        <student number="s001">
            <name>zhangsan</name>
            <age>23</age>
            <sex>male</sex>
        </student>
    </students>

* dtd文档书写:
    <!ELEMENT student (student*) >
    <!ELEMENT student (name,age,sex)>
    <!ELEMENT name (#PCDATA)>
    <!ELEMENT age (#PCDATA)>
    <!ELEMENT sex (#PCDATA)>
    <!ATTLIST student number ID #REQUIRED>

* 内部dtd, 本地:
    <?xml version="1.0" encoding="UTF-8" ?>
    <!DOCTYPE students [
        <!ELEMENT student (student*) >
        <!ELEMENT student (name,age,sex)>
        <!ELEMENT name (#PCDATA)>
        <!ELEMENT age (#PCDATA)>
        <!ELEMENT sex (#PCDATA)>
        <!ATTLIST student number ID #REQUIRED>
    ]>

    <students>
        <student number="s001">
            <name>zhangsan</name>
            <age>23</age>
            <sex>male</sex>
        </student>
    </students>
```

  * Schema:
    * 引入:
        1. 填写xml文档的根元素
        2. 引入xsi前缀. xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        3. 引入xsd文件命名空间. xsi:schemaLocation="http://www.itcast.cn/xml student.xsd"
        4. 为每一个xsd约束声明一个前缀，作为标识 xmlns="http://www.itcast.cn/xml"
        5. [查看具体内容](https://github.com/dj49846917/studyJava/tree/master/XML/day02/schema/student/xsd)

```
    <students  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns="http://www.itcast.cn/xml"
        xsi:schemaLocation="http://www.itcast.cn/xml student.xsd"
    >
```

## 3.解析： 操作xml文档，将文档中的数据读取到内存中

   * 操作xml文档
        1. 解析(读取): 将文档中的数据读取到内存中
        2. 写入: 将内存中的数据保存到xml文档中，持久化的存储
   
   * 解析xml的方式:
        1. DOM：将标记语言文档一次性加载进内存，在内存中形成一颗dom树
            * 优点: 操作方便，可以对文档进行CRUD的所有操作
            * 缺点: 占内存

        2. SAX：逐行读取，基于事件驱动
            * 优点: 不占内存
            * 缺点：只能读取，不能增删改
    
    * xml常见的解析器: (简单了解)
        1. JAXP: sun公司提供的解析器，支持dom和sax两种思想
        2. DOM4J： 一款非常优秀的解析器
        3. Jsoup: jsoup 是一款Java的HTML解析器，可直接解析某个URL地址，HTML文本内容。它提供了一套非常省力的API，可通过DOM，css以及类似于jquery的操作方法来取出和操作数据
        4. PULL： android操作系统内置的解析器，sax方式的

    * Jsoup: jsoup 是一款Java的HTML解析器，可直接解析某个URL地址、HTML文本内容。它提供了一套非常省力的API，可通过DOM，CSS以及类似于jquery的操作方法来取出和操作数据
        * 快速入门:
            * 步骤:
                1. 导入jar包
                2. 获取Document对象
                3. 获取对应的标签Element对象
                4. 获取数据
