## 1. static静态
        <1>.概念:
                static: 是一个关键字，用于修饰成员变量和成员方法

        <2>.特点:
                {1}.被所有的对象所共享
                {2}.可以使用类名作调用
                {3}.静态的加载是优先于对象(对象创建前就已经加载了,随着类的加载而加载，加载在内存的方法区中) 

        <3>.具体代码如下:
            public class StaticDemo {
                public static void main(String[] args) {
                    // 类名调用
                    Person.graduateFrom = "传智学院";
                    
                    Person p = new Person();
                    p.name = "张三";
                    p.age = 20;
            //		p.graduateFrom = "传智学院";
                    p.speak();
                    
                    Person p2 = new Person();
                    p2.name = "李四";
                    p2.age = 22;
            //		p2.graduateFrom = "传智学院";
                    p2.speak();
                }
            }
            // 定义类
            class Person {
                String name;
                int age;
                static String graduateFrom;

                public void speak() {
                    System.out.println(name + "--------" + graduateFrom);
                }
            }

##  2. static的注意事项:
        <1>. 静态方法:
                可以调用静态的成员变量
                可以调用静态的成员方法
                不可以调用非静态的成员变量
                不可以调用非静态的成员方法

        <2>. 非静态方法:
                可以调用静态的成员变量
     			可以调用静态的成员方法
                可以调用非静态的成员变量
                可以调用非静态的成员方法

        <3>. 静态的方法中是否有this这个对象? 
                没有

        <4>.详细代码如下:
                public class StaticDemo2 {
                    public static void main(String[] args) {
                        Student.graduateFrom = "传智播客";
                        Student.study();
                    }
                }

                class Student {
                    String name;
                    int age;
                    static String graduateFrom;
                    
                    public static void study(){
                        // 可以调用静态的成员变量
                        System.out.println(graduateFrom);
                        // 可以调用静态的成员方法
                        sleep();
                        
                //		System.out.println(name); // 报错，不能调用非静态成员变量
                //		eat(); // 报错 不能调用非静态的成员方法
                    }
                    
                    public static void sleep(){
                        System.out.println("sleep");
                        
                //		this  // 报错，静态方法没有this这个对象
                    }
                    
                    public void eat(){
                        System.out.println("eat");
                        
                        //非静态方法可以调用静态的成员变量
                        System.out.println(graduateFrom);
                        // 非静态方法可以调用静态的成员方法
                        sleep();
                    }
                }

##  3. static(静态)的优缺点
        <1>.优点:
                {1}. 对对象的共享数据提供单独空间的存储，节省空间，没有必要每一个对象都存储一份
                {2}. 可以直接被类名调用，不用在堆内存创建对象

        <2>.缺点:
                {1}. 访问出现局限性。(静态虽好，但只能访问静态)

##  4. Math的部分方法
            <1>. static double ceil(double a) 天花板（去小数点进一）
                    举例:   
                        System.out.println(Math.ceil(1.6)); // 输出: 2.0

            <2>. static double floor(double a) 地板 （去小数点）
                    举例:
                        System.out.println(Math.floor(1.6)); // 输出: 1.0

            <3>. static double random(double a) 随机数 0-1之间
                    举例:
                        System.out.println(Math.random()); // 输出: 0.9536876090577943

            <4>. static double round(double a)  四舍五入
                    举例:
                        System.out.println(Math.round(1.2)); // 输出: 1
		                System.out.println(Math.round(1.6)); // 输出: 2

            <5>. static double max(double a,double b) 比较两个值，输出最大值
                    举例:
                        System.out.println(Math.max(1.2, 4.2)); // 输出: 4.2

##  5. static练习
        <1>.写出一个4位数的验证码
                {1}.分析:
                        A：创建StringBuilder对象
                        B: 循环并获取每一位随机数的下标，并得到每一位的字符
                        C: 添加到StringBuilder中
                        D: 键盘录入一个数据
                        E：判断

                {2}.详细代码请参考:
                        day11/code/MathTest.java

        <2>.自定义工具类，获取数组中的最大值和指定值的索引
                {1}.使用private修饰的构造方法，不用实例化

                {2}.详细代码请看:
                        day11/code/自定义工具类

##  6. 代码块 {}
        <1>.分类:
                {1}. 局部代码块:
                        存在于方法中, 控制变量的生命周期(作用域)

                        1).举例:
                            public class BlockDemo {
                                public static void main(String[] args) {
                                    // 局部代码块: 存在于方法中, 控制变量的生命周期(作用域)
                                    {
                                        for(int x=0;x<10;x++){
                                            System.out.println("我爱java");
                                            int num = 10;
                                        }
                                    }
                                    System.out.println(num); // 报错
                                }
                            }

                {2}. 构造代码块：
                        提取构造方法中的共性，每次创建对象都会执行，并且在构造方法执行之前执行

                        1).举例:
                                public class BlockDemo {
                                    public static void main(String[] args) {
                                        Teacher t = new Teacher(); // 输出10遍
                                        Teacher t2 = new Teacher("张三",20); // 输出10遍
                                    }
                                }

                                class Teacher{
                                    String name;
                                    int age;
                                    public Teacher() {}
                                    public Teacher(String name, int age) {
                                        this.name = name;
                                        this.age = age;
                                    }
                                    // 构造代码块: 所有的构造函数都会执行构造代码块
                                    {
                                        for(int x=0;x<10;x++){
                                            System.out.println("我爱java");
                                        }
                                    }
                                }

                        2).举例:
                                public class BlockDemo {
                                    public static void main(String[] args) {
                                        Teacher t = new Teacher(); // 输出10遍
                                        Teacher t2 = new Teacher("张三",20); // 输出10遍
                                    }
                                }

                                class Teacher{
                                    String name;
                                    int age;
                                    public Teacher() {
                                        System.out.println("我是无参构造");
                                    }
                                    public Teacher(String name, int age) {
                                        System.out.println("我是有参构造");
                                        this.name = name;
                                        this.age = age;
                                    }
                                    // 构造代码块: 所有的构造函数都会执行构造代码块
                                    {
                                        System.out.println("我爱java");
                                    }
                                    /*
                                     输出:      我爱java
                                                我是无参构造
                                                我爱java
                                                我是有参构造
                                    */
                                }


                {3}. 静态代码块:
                        随着类的加载而加载，只加载一次，加载类时需要做的一些初始化，比如加载驱动

                        1).举例:
                            public class BlockDemo {
                                public static void main(String[] args) {
                                    Teacher t = new Teacher(); // 输出10遍
                                    Teacher t2 = new Teacher("张三",20); // 输出10遍
                                }
                            }

                            class Teacher{
                                String name;
                                int age;
                                // 静态代码块
                                static {
                                    System.out.println("我爱学习");
                                }
                                
                                public Teacher() {
                                    System.out.println("我是无参构造");
                                }
                                public Teacher(String name, int age) {
                                    System.out.println("我是有参构造");
                                    this.name = name;
                                    this.age = age;
                                }

                                /*
                                    输出:   我爱学习
                                            我是无参构造
                                            我是有参构造

                                */
                            }

                {4}. 同步代码块

            <2>.顺序:
                    静态代码块 》 构造代码块 》 函数代码块