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
                    Object[] objs = c.toArray();
                    for(int i=0;i<objs.length;i++){
                            System.out.println(objs[i]);
                    }

        <8>.详细代码请看:  day17/code/CollectionDemo2 

        <9>.练习: 
                判断集合中是否包含元素java,如果有则添加元素android   

                {1}.具体代码请看:
                        day17/code/IteratorTest.java

##  3.Iterator类(迭代器)
    <1>.集合的遍历方式:
            {1}.toArray,可以把集合转换为数组，然后遍历数组即可
                1).举例:
                        // 创建集合对象
                        Collection c = new ArrayList();
                        // 添加元素
                        c.add("hello");
                        c.add("world");
                        c.add("java");
                        Object[] objs = c.toArray();
                        // 遍历
                        for (int i = 0; i < objs.length; i++) {
                            System.out.println(objs[i]);
                        }

            {2}.iterator,可以返回一个迭代器对象，我们可以通过迭代器对象来迭代集合

                1).举例:
                         // 创建集合对象
                        Collection c = new ArrayList();
                        // 添加元素
                        c.add("hello");
                        c.add("world");
                        c.add("java");
                        Iterator it = c.iterator();
                        while(it.hasNext()){
                            System.out.println(it.next());
                        }

    <2>.Iterator: 可以用于遍历集合
            {1}.next(): 
                    返回下一个元素

    <3>.注意:
            Exception in thread "main" java.util.NoSuchElementException
          	使用next方法获取下一个元素，如果没有元素可以获取，则出现NoSuchElementException

    <4>.详细代码请参考:
            day17/code/IteratorDemo.java

##  4.泛型:
        <1>.泛型: 
                是一种广泛的类型，把明确数据类型的工作提前到了编译时期，借鉴了数组的特点

        <2>.什么时候可以使用泛型？
         		问API，当我们看到<E>,就可以使用泛型了

        <3>.泛型的好处：
                {1}.避免了类型转换的问题
                {2}.可以减少黄色警告线
                {3}.可以简化我们代码的书写

        <4>.需求: 使用集合存储自定义对象并遍历

        <5>.注意:Exception in thread "main" java.lang.ClassCastException: com.itheime_03.Student cannot be cast to java.lang.String
            由于集合可以存储任意类型的对象，当我们存储了不同类型的对象，就有可能在转换的时候出现类型转换的错误,
            所以java为了解决这个问题，给我们提供了一种机制，叫做泛型

        <6>.举例:
                详细代码请看:day17/code/GenericDemo.java