##  1.抽象类abstract
        <1>.abstract：关键字，用于修饰方法和类

        <2>.抽象方法：
                不同类的方法是相似，但是具体内容又不太一样，所以我们只能抽取他的声明，没有具体的方法体，没有具体方法体的方法就是抽象方法
        
        <3>.抽象类: 
                有抽象方法的类必须是抽象类

        <4>.注意: 
                一个类继承了抽象类需要重写他所有的抽象方法,否则这个类就得是抽象类

        <5>.举例:
                public class AbstractDemo {
                    public static void main(String[] args) {
                        Cat c = new Cat();
                        c.run();
                    }
                }

                abstract class Animal{
                    public abstract void eat();
                    
                    //非抽象的方法，子类可以不用重写
                    public void run(){
                        System.out.println("奔跑吧，大犀牛");
                    }
                }

                class Cat extends Animal{
                    @Override
                    public void eat() {
                        System.out.println("猫吃鱼");
                        
                    }
                }

                abstract class Dog extends Animal{

                }

##  2.抽象类的特点
        <1>.抽象类的特点:
                {1}.抽象方法只能在抽象类里面
                {2}.抽象类和抽象方法必须被abstract修饰
                {3}.抽象类不能创建对象(不能实例化)
                {4}.抽象类中可以有非抽象的方法
                {5}.抽象类和类的关系也是继承
                {6}.一个类继承了抽象类要么重写所有的抽象方法，要么他自己是抽象类

        <2>.举例:
                public class AbstractDemo2 {
                    public static void main(String[] args) {
                //		Animals a = new Animals(); // 抽象类不能被实例化
                    }
                }

                abstract class Animals{
                    public abstract void eat();
                    // 非抽象方法
                    public void run(){}
                }

                abstract class Cats extends Animals{
                //	@Override
                //	public void eat() {
                //	}
                }

##  3.抽象类的成员特点
        <1>.抽象类的成员特点:
                {1}.成员变量
                        1).可以有成员变量
                        2).可以有成员常量

                {2}.成员方法
                        1).可以有抽象方法
                        2).可以有非抽象方法

                {3}.构造方法
                        1).可以有构造方法，需要对抽象类的成员变量进行初始化	

        <2>.举例:
                public class AbstractDemo3 {
                    public static void main(String[] args) {
                        Dog d = new Dog();
                        d.backing();
                    }
                }

                abstract class Animal{
                    /*成员变量*/
                    String name = "哮天犬";
                    final int num = 10; // 常量
                    
                    /*构造方法*/
                    public Animal(){
                        System.out.println("抽象类的构造方法");
                    }
                    
                    /*成员方法*/
                    public abstract void eat(); // 抽象方法
                    public void run(){ // 非抽象方法
                        System.out.println("奔跑吧，大犀牛");
                    }
                }

                class Dog extends Animal{
                    public void backing(){
                        System.out.println(name); // 输出: "哮天犬"
                        System.out.println(num); // 输出: 10
                    }

                    @Override
                    public void eat() {
                        
                    }
                }

##  4.抽象类的细节
        <1>.抽象关键字abstract不能和哪些关键字共存?
                答: {1}. final // 常量
                    {2}.private // 父类私有化的成员方法或成员变量

        <2>.抽象类中是否有构造函数?
                答: 有。

                因为:
                    {1}.抽象类也有成员变量，也需要进行初始化
                    {2}.抽象类作为一个类，需要被子类继承的，子类继承就要调用父类的构造函数

        <3>.抽象类中可不可以没有抽象方法?
                答: 可以

##  5.练习
        参考day12/code/练习