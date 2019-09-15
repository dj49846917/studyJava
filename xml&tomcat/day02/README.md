* 约束：规定xml文档的书写规则
    * 作为框架的使用者：
        1. 能够在xml中引入约束文档
        2. 能够简单的读懂约束文档

    * 分类
        1. DTD: 一种简单约束技术
        2. Schema: 一种复杂的约束技术

    * DTD:
        * 引入dtd文档到xml文档中
            * 内部dtd: 将约束规则定义在xml文档中, [查看具体内容](https://github.com/dj49846917/studyJava/blob/master/day02/README.md)
            * 外部dtd: 将约束的规则定义在外部的dtd文件中, [查看具体内容](https://github.com/dj49846917/studyJava/blob/master/day02/README.md)
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
        5. [查看具体内容](https://github.com/dj49846917/studyJava/blob/master/day02/README.md)

```
    <students  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns="http://www.itcast.cn/xml"
        xsi:schemaLocation="http://www.itcast.cn/xml student.xsd"
    >
```

3. 解析： 操作xml文档，将文档中的数据读取到内存中

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