# 泛型和数据结构
##  1.Collection类
        <1>.集合的体系架构：
                概念: 
                        由于不同的数据结构(数据的组织，存储方式)，所以java为我们提供了不同的集合,但是不同的集合他们的功能都是相似，不断的向上提取，将共性抽取出来，这就是集合体系结构形成的原因

        <2>.体系结构:
                怎么学习？最顶层开始学习，因为最顶层包含了所有的共性
         		怎么使用？使用最底层，因为最底层就是具体的实现

##  2.Collection类的常用API
        <1>.boolean add(E e): 是否添加成功
            {1}.举例:
                    System.out.println(c.add("hello")); // 输出: true
                    System.out.println(c.add("world"));
                    
                    System.out.println(c); // 输出: "[hello, world]"

        <2>.void clear(): 清空集合
            {1}.举例:
                    c.add("hello");
                    c.add("world");
                    c.clear();
                    System.out.println(c); // 输出: []

        <3>.boolean contains(Object c): 判断集合中是否包含某个元素
            {1}.举例:
                    c.add("hello");
                    c.add("world");
                    System.out.println(c.contains("world")); // 输出: true
                    System.out.println(c.contains("wor")); // 输出: false

        <4>.boolean isEmpty()：  判断是否为空
            {1}.举例:
                    c.add("hello");
                    c.add("world");
                    System.out.println(c.isEmpty()); // 输出: false


        <5>.boolean remove(Object c): 删除元素
            {1}.举例:
                    c.add("hello");
                    c.add("world");
                    c.remove("hello");
                    System.out.println(c.remove("hello")); // 输出:false
                    System.out.println(c); // 输出: [world]

        <6>.int size(): 返回集合中的个数
            {1}.举例:
                    c.add("hello");
                    c.add("world");
                    System.out.println(c.size()); // 输出: 2		

        <7>.Object[] toArray(): 返回对象数组
            {1}.举例:
                    c.add("hello");
                    c.add("world");
                    c.remove("hello");
                    System.out.println(c.remove("hello")); // 输出:false
                    System.out.println(c); // 输出: [world] 

        <8>.详细代码请看:  day17/code/CollectionDemo2    
