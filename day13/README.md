#  接口
##  1.接口的概述
        <1>.为什么要使用接口?
                {1}.Java语言的继承是单一继承，一个子类只能有一个父类(一个儿子只能有一个亲爹)
                {2}.Java语言给我们提供了一个机制，用于处理继承单一的局限性的，接口

        <2>.定义:
                接口是一个比抽象类还要抽象的类，接口里所有的方法全是抽象方法，接口和类的关系是实现，implements
                interface

        <3>.格式:
                interface 格式名 {

                }
        
        <4>.举例:
                public class InterfaceDemo {
                    public static void main(String[] args) {
                        BillGates gates = new BillGates();
                        gates.code(); // 输出: "写代码"
                        gates.manage(); // 输出: "管理公司"
                    }
                }

                /*class Boss{
                    public void manage(){
                        System.out.println("管理公司");
                    }
                }

                class Programmer{
                    public void code(){
                        System.out.println("写代码");
                    }
                }
                // 比尔盖茨既写代码又管理公司用继承就无法实现
                class BillGates extends Programmer {}*/

                interface Work{ // 接口
                    public abstract void manage();
                    public abstract void code();
                }

                class BillGates implements Work{

                    @Override
                    public void manage() {
                        System.out.println("管理公司");
                    }

                    @Override
                    public void code() {
                        System.out.println("写代码");
                    }
                }

##  2.接口的成员特点
        <1>.接口的成员特点:
                {1}.只能有抽象方法
                
                {2}.只能有常量(思考为什么? 因为: 如果是变量，接口中没有方法体，不能给变量赋值，只能一开始就初始化好，一开始就初始化好却不改变，这就是常量)
                
                {3}.默认使用abstract和public修饰方法
                
                {4}.只能使用abstract和public修饰方法   (思考为什么？因为：类与接口的关系是实现关系，如果接口里有private私有化的方法，类就无法访问，也就无法实现)
                
                {5}.默认使用public static final来修饰成员变量
        
        <2>.建议：
                建议大家手动的给上默认修饰符，如:
                        public static final int num = 10; // 常量	
	                    public abstract void eat(); // 抽象方法     

        <3>.注意:
                {1}.接口不能创建对象(不能实例化) 
                
                {2}.类与接口的关系是实现关系，一个类实现一个接口必须实现他所有的方法

        <4>.举例:   
                public class InterfaceDemo2 {
                    public static void main(String[] args) {
                //		Animal a = new Animal();  // 不能实例化
                    }
                }

                interface Animal { // 接口
                    public static final int num = 10; // 常量	
                    public abstract void eat(); // 抽象方法
                }

                class Cat implements Animal{ // 使用关键字implements实现接口的所有方法
                    @Override
                    public void eat() {
                        
                    }	
                }     

##  3.接口与类的关系
        <1>.类与类: 继承关系。
                    特点: 单一继承，多层继承

        <2>.类与接口: 实现关系。
                    特点: 多实现

        <3>.接口与接口: 接触关系。
                    特点: 多继承    

        <4>.举例:
                public class InterfaceDemo3 {
                    public static void main(String[] args) {
                        Demo d = new Demo();
                        d.function(); // 输出: "interB的实现"
                    }
                }

                interface InterA extends InterB{
                    public abstract void method();
                }

                interface InterB{
                    public abstract void function();
                //	public abstract void method();
                }

                interface InterC extends InterA{}

                // class Demo implements InterC{ //实现
                // 	@Override
                // 	public void method() { // 如果接口内的方法完全相同，只执行一次
                // 		System.out.println("interA的实现");
                // 	}

                // 	@Override
                // 	public void function() {
                // 		System.out.println("interB的实现");
                // 	}
                    
                // }

                class Demo implements InterA,InterB{ //实现
                    @Override
                    public void method() { // 如果接口内的方法完全相同，只执行一次
                        System.out.println("interA的实现");
                    }

                    @Override
                    public void function() {
                        System.out.println("interB的实现");
                    }	
                }     

##  4.接口的优点
        <1>.类与接口的关系，实现关系，而且是多实现的，一个类可以实现多个接口,类与类之间是继承关系，java中的继承是单一继承，一个类只能有一个父亲，道破了继承的局限性

        <2>.对外提供规则

        <3>.降低了程序的耦合性(可以实现模块化开发，定义好规则，每个人实现自己的模块，提高了开发的效率)
        
##  5.接口和抽象类的区别
        <1>.共性：
                不断的抽取，抽取出抽象的概念

        <2>.区别:
                {1}.与类的关系:
                        1).类与接口是实现关系，而且是多实现，一个类可以实现多个接口
                        
                        2).类与抽象类是继承关系，Java中的继承是单一继承，一个类只能有一个父类，Java中的继承是多层继承
                {2}.成员:
                        1).成员变量:
                            [1].抽象类可以有成员变量，也可以有常量
                            [2].接口只能有常量

                        2).成员方法:
                            [1].抽象类可以有抽象方法，可以有非抽象方法
                            [2].接口只能有抽象方法，而且方法有默认修饰符 public abstract

                        3).构造方法:
                            [1].抽象类有构造方法的
                            [2].接口没有构造方法

##  6.练习
        <1>.  篮球运动员和教练
            乒乓球运动员和教练
            现在篮球运动员和教练要出国访问，需要学习英语
            请根据你所学的知识，分析出来哪些是类，哪些是接口，哪些是抽象类

        <2>.解释图请参考:
![分析](https://raw.githubusercontent.com/dj49846917/studyJava/master/day13/%E8%A7%A3%E9%87%8A%E5%9B%BE/player.png)  

        <3>.详细代码参考:
                day13/code/InterfaceTest.java      

##  7.匿名对象
        <1>.匿名对象:
                没有名字的对象     

        <2>.应用场景:
                {1}.当对象只调用一次的时候可以使用户匿名对象
                {2}.可以当做参数进行传递，但是无法在传参之前做其他的事情    

        <3>.注意:
                匿名对象可以调用成员变量并赋值，但是赋值没有意义（因为每次都是new出来的，所以都是初始值）

        <4>.举例:
                public class AnonymousObjectDemo {
                    public static void main(String[] args) {
                        /*Student s= new Student();
                        s.study();
                        s.study();
                        s.study();*/
                        
                        /*new Student(); // 匿名对象，没有变量引用的对象
                        new Student().study();
                        new Student().study();
                        new Student().study();*/
                        
                        new Student().age = 18;
                        System.out.println(new Student().age); // 输出: 0  因为new出来的，初始值为0
                    }
                }

                class Student{
                    String name;
                    int age;
                    
                    public void study(){
                        System.out.println("好好学习");
                    }
                }

##  8. final常量
        <1>.final: 
                修饰符，可以用于修饰类、成员方法和成员变量

        <2>.特点:
                {1}.final所修饰的类:
                        不能被继承，不能有子类

                {2}.final修饰的方法: 
                        不能被重写

                {3}.final所修饰的变量: 
                        是不可以修改的，是常量

        <3>.常量:
                {1}.字面量常量: 1,2,3
                {2}.自定义常量: 被final修饰的成员变量，一旦初始化则不可改变

        <4>.注意:
                自定义常量必须初始化，可以选择显示初始化或者构造初始化

        <5>.详细代码如下:
                public class FinalDemo {
                    public static void main(String[] args) {
                        Dog d = new Dog();
                //		d.eat();
                //		d.num = 20; // final修饰的变量不能修改
                        System.out.println(d.num); // 输出: 10
                        System.out.println(d.NUM); // 输出: 20
                    }
                }

                /*final*/ class Animal{
                    public final void eat(){
                        System.out.println("吃东西");
                    }
                }

                class Dog extends Animal{
                //	public void eat(){} // final修饰的方法，不能被重写
                    
                    final int num = 10;
                    final int NUM;
                    public Dog(){
                        NUM = 20;
                    }
                }

                //class Dog extends Animal{} // 被final修饰的类不能被继承

##  9.多态
        <1>.多态的前提:
                {1}.子父类的继承关系
                {2}.方法的重写
                {3}.父类引用指向子类对象

        <2>.动态绑定: 
                运行期间调用的方法，是根据其具体的类型

        <3>.具体代码:
                public class polymorphicDemo {
                    public static void main(String[] args) {
                        /*Cat a = new Cat();
                        a.eat();*/
                        
                        // 父类引用	Animal a
                        // 指向		=
                        // 子类对象	new Cat()
                        Animal a = new Cat(); // 通俗理解就是: 猫是猫，猫是动物
                        a.eat(); // 输出: '猫吃鱼'
                    }
                }

                class Animal{ // 父类
                    public void eat(){
                        System.out.println("吃东西");
                    }
                }

                class Cat extends Animal{ // 子类
                    @Override
                    public void eat(){
                        System.out.println("猫吃鱼");
                    }
                }

##  10.多态的特点
        <1>.多态的成员特点:
                {1}.成员变量： 编译时看的是左边(父类)，运行时看的左边(父类)
                {2}.成员方法: 编译时看的是左边(父类)，运行时看的是右边(子类)
                {3}.静态方法: 编译时看的是左边(父类)，运行时看的是左边(父类)

        <2>.编译时看的都是左边，运行时成员方法看的是右边，其他(成员变量和静态的方法)看的都是左边

        <3>.具体代码如下:
                public class polymorphicDemo2 {
                    public static void main(String[] args) {
                        Dad d = new Kid();
                //		System.out.println(d.num); // 报错，如果父类没有成员变量num，会报错
                //		System.out.println(d.num); // 输出:20   如果父类有成员变量num,子类也有,输出父类的变量  
                //		d.method(); // 输出:"子类成员方法"
                        d.function(); // 输出: "父类静态方法"   使用变量去调用静态方法，其实相当于用变量类型的类名去掉用
                    }
                }

                class Dad{
                    int num = 20;
                    
                    public void method(){
                        System.out.println("父类成员方法");
                    }
                    
                    public static void function(){
                        System.out.println("父类静态方法");
                    }
                }

                class Kid extends Dad{
                    int num = 10;
                    
                    public void method(){
                        System.out.println("子类成员方法");
                    }
                    
                    public static void function(){
                        System.out.println("子类静态方法");
                    }
                }

##  11.多态中的向上转型和向下转型
        <1>.引用类型之间的转换
                {1}.向上转型(自动)
                        由小到大(子类型转换成父类型)
                {2}.向下转型(强制)
                        由大到小

        <2>.基本数据类型的转换
                {1}.自动类型转换
                        由小到大
                        byte short char ==> int ==> long ==> float ==> double
                {2}.强制类型转换
                        由大到小

        <3>.具体代码如下:
                public class polymorphicDemo3 {
                    public static void main(String[] args) {
                        Animal2 a = new Dog(); // 向上转型
                //		a.eat(); // 输出:"吃东西"
                        
                //		Dog d = a; // 报错，通俗举例: 狗是动物，动物是狗就错了
                        
                        Dog d = (Dog)a; // 向下转型
                        d.eat(); // 输出: "补钙"
                    }
                }

                class Animal2{
                    public void eat(){
                        System.out.println("吃东西");
                    }
                }

                class Dog extends Animal2{
                    @Override
                    public void eat(){
                        System.out.println("补钙");
                    }
                }

##  12.多态的优缺点
        <1>.优点:
                可以提高可维护性(多态前提保证的)，提高代码的可拓展性

        <2>.缺点:
                无法直接访问子类持有的成员

        <3>.举例:
                public class polymorphicDemo4 {
                    public static void main(String[] args) {
                        MiFactory factory = new MiFactory();
                        factory.createPhone(new MiNote()); // 输出："打电话"
                        factory.createPhone(new RedMi());
                    }
                }

                class MiFactory {
                    /*public void createPhone(MiNote mi){
                        mi.call();
                    }
                    
                    public void createPhone(RedMi mi){
                        mi.call();
                    }*/
                    public void createPhone(Phone p){
                        p.call();
                    }
                }

                interface Phone{
                    public abstract void call();
                }

                // 小米note
                class MiNote implements Phone{
                    public void call(){
                        System.out.println("小米note打电话");
                    }
                }

                // 红米打电话
                class RedMi implements Phone{
                    public void call(){
                        System.out.println("红米打电话");
                    }
                }