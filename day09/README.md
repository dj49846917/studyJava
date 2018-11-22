## 1.对象数组
        <1>.创建一个学生数组,存储三个学生对象并遍历
            {1}.分析:
                A: 定义学生类
                B: 创建学生数组
                C: 创建学生对象
                D: 把学生对象作为元素赋值给学生数组
                E: 遍历学生数组

        <2>.自动生成构造方法: 
                代码区域右键 ==> Source ==> Generate Constructors from Superclass...	无参构造方法
                代码区域右键 ==> Source ==> Generate Constructor using Fields...		带参构造方法

        <3>.自动生成getXxx()/setXxx()
 		        代码区域右键 ==> Source ==> Genrate Getters and Setters...

        <4>.详细代码请参考:  day09/code/对象数组

## 2. 为什么会出现集合类:
 		<1>.    我们学习的是面向对象编程语言,而面向对象编程语言对事物的描述都是通过对象来体现的。
            为了方便对多个对象进行操作，我们就必须对这多个对象进行存储，而要想对多个对象进行存储，
            就不能是一个基本的变量，而应该是一个容器类型的变量。
            到目前为止，我们学习过了哪些容器类型的数据呢？ StringBuilder,数组。
            StringBuilder的结果只能是一个字符串类型，不一定满足我们的需求。
            所以,我们目前只能选择数组了，也就是前面学习过的对象数组。
            但是，数组的长度是固定的，适应不了变化的需求，那么，我们该如何选择呢？
            这个时候，java就提供了集合供我们使用

        <2>. 集合类的特点：
 		        长度可变。

        <3>.ArrayList<E>:
                大小可变数组的实现
        
                <E>:是一种特殊的数据类型，泛型。
                怎么用呢?
                    在出现E的地方我们使用引用数据类型替换即可
                    举例：ArrayList<String>,ArrayList<Student>

        <4>.构造方法：
 		        ArrayList()

        <5>.添加元素：
                public boolean add(E e):添加元素
                public void add(int index,E element):在指定的索引处添加一个元素

        <6>.举例:
                public class ArrayListDemo {
                    public static void main(String[] args) {
                        //创建集合对象
                        ArrayList<String> array = new  ArrayList<String>();
                        
                        //add(E e):添加元素
                        array.add("hello");
                        array.add("world");
                        array.add("java");
                        
                        //add(int index,E element):在指定的索引处添加一个元素
                        //array.add(1, "android");
                    
                        System.out.println("array:"+array);
                    }
                }

        <7>.获取元素：
 		        public E get(int index): 返回指定索引处的元素

                举例：
                    System.out.println(array.get(1)); // 输出world

        <8>.集合长度
 		        public int size(): 返回集合中的元素的个数
                
                举例:
                    System.out.println("size:" + array.size()); // 输出 size:3

        <9>.删除元素
                public boolean remove(Object o): 删除指定元素，返回删除是否成功
                public E remove(int index): 删除指定索引的元素，返回被删除的元素

                举例:
                    System.out.println("remove1:" + array.remove("world")); // 输出 remove1:true
		            System.out.println("remove2" + array.remove(2)); // 输出 remove2:java

        <10>.修改元素
                public E set(int index,E element): 修改指定索引处的元素，返回修改的元素

                举例:
                    System.out.println("set:"+array.set(1, "androud")); // 输出 world

        <11>.详细代码如下:
                import java.util.ArrayList;
                public class ArrayListDemo3 {
                    public static void main(String[] args) {
                        // 创建集合对象
                        ArrayList<String> array = new ArrayList<String>();
                        // 添加
                        array.add("hello");
                        array.add("world");
                        array.add("java");
                        System.out.println(array); // 输出[hello, world, java]
                        
                        // 索引
                        System.out.println(array.get(1)); // 输出world
                        
                        // 元素的个数
                        System.out.println("size:" + array.size()); // 输出 size:3
                        
                        // 删除
                //		System.out.println("remove1:" + array.remove("world")); // 输出 remove1:true
                        System.out.println("remove2" + array.remove(2)); // 输出 remove2:java
                        
                        // 修改
                        System.out.println("set:"+array.set(1, "androud")); // 输出 world
                        System.out.println(array);
                    }
                }

        <12>.ArrayList的遍历
                详细代码如下:
                    import java.util.ArrayList;
                    public class ArrayListDemo4 {
                        public static void main(String[] args) {
                            ArrayList<String> array = new ArrayList<String>();
                            array.add("张三");
                            array.add("李四");
                            array.add("王麻子");
                            System.out.println(array); // 输出 [张三, 李四, 王麻子]
                            
                            for(int x=0;x<array.size();x++){
                                String s = array.get(x);
                                System.out.println(s); // 分别输出张三，李四，王麻子
                            }
                        }
                    }
        
        <13>.ArrayList的练习:
                {1}.存储字符串并遍历
                        详细代码请看: day09/code/集合/ArrayListTest.java

                {2}. 给定一个字符串数组: {"张三丰","宋远桥","张无忌","尹丽婷","张翠山","莫胜谷"},将数组中的元素添加到集合中,并把所有性张的人员打印到控制台上
                        详细代码请看: day09/code/集合/ArrayListTest2.java

                {3}.存储自定义对象存储
                        详细代码请看: day09/code/集合/ArrayListTest3.java

                {4}.创建一个集合，存储学生对象，学生对象的数据来至键盘录入,最后，遍历集合