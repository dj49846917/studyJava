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

        <2>.

        <3>.详细代码参考:
                day13/code/InterfaceTest.java                
