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
                    静态代码块 》 构造代码块 》 函数代码块HHHHHHHHHHHHHHHHHHHHHHHHHHh

##  7.继承
    <1>.继承的作用:
            多个类共同的成员变量和成员方法，抽取到另外一个类中(父亲)，再让多个类去继承这个父类，我们的多个类就可以获取到父类中的成员了。

    <2>.举例:
            public class ExtendsDemo {
                public static void main(String[] args) {
                    Dota d = new Dota();
                    d.start();
                    
                    Lol l = new Lol();
                    l.stop();
                }
            }

            class Games{
                String name;
                double version;
                String agent;
                
                public void start(){
                    System.out.println("游戏启动了");
                }
                
                public void stop(){
                    System.out.println("游戏关闭了");
                }
            }

            class Dota extends Games{}

            class Lol extends Games{}

##  8.继承的特点
        <1>.Java语言只支持单一继承，只能继承一个父类(一个儿子只能有一个亲爹)
        <2>.Java语言支持多层继承(一个儿子可以有一个亲爹，还可以有一个亲爷爷)

        <3>. 举例:
                public class ExtendsDemo2 {
                    public static void main(String[] args) {
                        Game1 l = new Game1();
                        l.update(); // 输出: "PCGame更新了"
                        l.start(); // 输出: "游戏启动了"
                    }
                }
                // 爷爷
                class Game {
                    public void start(){
                        System.out.println("游戏启动了");
                    }
                }
                // 父类
                class PCGames extends Game {
                    public void update(){
                        System.out.println("PCGame更新了");
                    }
                }
                // 父类
                class MobileGames extends Game {
                    public void update(){
                        System.out.println("MobileGames更新了");
                    }
                }
                // 子类
                class Game1 extends PCGames{}

##  9.继承中成员变量的特点:
         <1>.继承中成员变量的特点:
            {1}.子类只能获取父类非私有成员
            {2}.子父类中成员变量的名字不一样直接获取父类的成员变量
            {3}.子父类中成员变量的名字一样的获取的是子类的成员变量

        <2>.就近原则: 谁离我近我就用谁
                {1}.如果有局部变量就用局部变量
                {2}.如果没有局部变量，有子类的成员变量就用子类的成员变量
                {3}.如果没有局部变量和子类的成员变量，有父类的成员变量就使用父类的成员变量

        <3>.super: 可以获取父类的成员变量和成员方法，用法和this是相似的

        <4>.举例:
                public class ExtendsDemo3 {
                    public static void main(String[] args) {
                        Kid k = new Kid();
                        k.show(); // 输出: "建林"
                    }
                }

                class Dad{
                    String name = "建林";
                //	private String name = "建林"; // 子类引用会报错
                }

                class Kid extends Dad{
                    String name = "李四";
                    
                    public void show(){
                        String name = "王麻子";
                        System.out.println(super.name); // 就算子类定义了name,也输出: "建林"
                        System.out.println(this.name); // 输出： "李四"
                        System.out.println(name); // 输出: "王麻子"
                    }
                }

##  10.继承中成员方法的特点
        <1>.继承中成员方法的特点:
                {1}.子类中没有这个方法，调用父类的
                {2}.子类中重写了这个方法，调用子类的

        <2>.方法的重写: 
                在子父类当中，子类的方法和父类完全一样,子类覆盖了父类的方法，当子类覆盖了父类的方法之后，使用子类对象调用的就是子类的方法
 	    
        <3>.方法的重载: 
                在一个类中，有多个重名的方法，但是其参数不一样(参数的个数、类型、顺序)，和返回值无关

        <4>.举例:
                public class ExtendsDemo4 {
                    public static void main(String[] args) {
                        Kid k = new Kid();
                        k.eat(); // 输出: "好好吃饭"
                    }
                }

                class Dad{
                    public void eat() {
                        System.out.println("小酌两口");
                        System.out.println("去睡觉了");
                    }
                }

                class Kid extends Dad{
                    public void eat() {
                        System.out.println("好好吃饭");
                    }
                }

##  11.方法重写的注意事项
        <1>.方法重写的应用场景:
                当父类的方法不能完全满足子类使用，这个时候子类重写父类的方法，并可以在方法中使用关键字super调用父类的方法，这样做既可以保有父类的功能，又可以拥有子类持有的功能

        <2>.方法重写的注意事项:
                <1>.不能重写父类私有的方法
                <2>.权限必须大于等于父类方法的权限

        <3>.注解： @

        <4>.举例:
                public class ExtendsDemo5 {
                    public static void main(String[] args) {
                        NewPhone np = new NewPhone();
                        np.call();
                    }
                }
                class Phone {
                    public void call(){
                        System.out.println("打电话");
                    }
                //	private void call(){
                //		System.out.println("打电话");
                //	}
                }
                class NewPhone extends Phone {
                    // 加入重写的注解，可以规范代码，严格校验
                    @Override
                    public void call(){ // 父类私有方法，重写会报错
                        System.out.println("录音");
                        super.call(); // 继承父类的方法
                    }
                }

##  12.继承中构造方法的执行顺序
        <1>.继承中构造方法的执行顺序：
                在有子父类继承关系的类中，创建子类的对象，调用子类的构造方法，如果子类构造方法的第一行代码没有调用父类的构造方法，则会调用父类的无参构造,肯定要执行父类的构造，因为要先给父类的成员变量进行初始化，子类肯会使用到

        <2>.我们可以使用super()在子类构造方法的第一行中调用父类的构造方法

        <3>.我是父类无参构造 --- 我是子类有参构造 --- 我是子类无参构造

        <4>.举例:
                public class ExtendsDemo6 {
                    public static void main(String[] args) {
                        Children c = new Children();
                    }
                }

                class Father {
                    public Father(){
                        System.out.println("父类无参构造");
                    }
                    public Father(int num){
                        System.out.println("父类有参构造");
                    }
                }

                class Children extends Father {
                    public Children(){
                        /*
                        * super(1) 输出: 	父类有参构造
                                            子类无参构造
                        */
                //		super(1);
                        /*
                        * this(1); 输出:	父类无参构造
                                            子类有参构造
                                            子类无参构造
                        */
                        this(1);
                        System.out.println("子类无参构造");
                    }
                    public Children(int num){
                        System.out.println("子类有参构造");