##  1.内部类
        <1>.成员内部类:
                {1}.在类的成员位置，和成员变量以及成员方法所在的位置是一样的
                {2}.在内部类当中，可以直接访问外部类的成员，包括私有成员

        <2>.举例:
                public class InnerDemo {
                    public static void main(String[] args) {
                //		Outer o = new Outer();
                //		o.method();
                        
                        // 另外一种方式调function()方法
                        Outer.Inner i = new Outer().new Inner();
                        i.function();
                    }
                }

                class Outer{
                    private int num = 10;
                //	public void method(){
                //		Inner i = new Inner();
                //		i.function();
                //	}
                    // 内部类
                    class Inner{
                        public void function(){
                            System.out.println("function");
                            System.out.println(num); // 内部类可以获取外部类的私有变量
                        }
                    }
                }

##  2.成员内部类的修饰符
        <1>.成员内部类的修饰符：
                我们可以使用权限修饰符修饰内部类，但是如果使用私有来修饰，则无法在其他类中访问

        <2>.我们可以使用abstract,final修饰成员内部类

        <3>.举例:
                public class InnerDemo2 {
                    public static void main(String[] args) {
                //		Outer2.Inner2 i; // 报错
                        
                        /*Outer2.Inner2 i = new Outer2.Inner2(); // 使用static修饰的内部类，可以省去外部类的对象
                        i.function();*/
                        
                        Outer2.Inner2.function(); // static修饰内部类和内部类的方法，可以直接类名调用
                    }
                }

                class Outer2{
                    public void method(){
                        Inner2 i = new Inner2();
                        i.function();
                    }
                //	private class Inner2{
                //		public void function(){
                //			System.out.println("function");
                //		}
                //	}
                    
                    static class Inner2{
                //		public void function(){
                //			System.out.println("function");
                //		}
                        public static void function(){
                            System.out.println("function");
                        }
                    }
                }

##  3.内部内部类
        <1>.局部内部类：
            在方法内，出了方法之后就无法使用

        举例:
            public class InnerDemo3 {
                public static void main(String[] args) {
                    Outer o = new Outer();
                    o.method();
                }
            }

            class Outer{
                public void method(){
                    int num = 10;
                    class Inner{
                        public void function(){
                            System.out.println("function");
                        }
                    }
                    Inner i = new Inner();
                    i.function();
                }
                
                public void test(){
            //		System.out.println(num); // 报错，局部变量出了函数都不能使用
            //		Inner i = new Inner(); // 报错，局部内部类，出了方法就无法使用
                }
            }

##  4.匿名内部类:
        <1>.匿名内部类:
                {1}.可以把匿名内部类看成是一个没有名字的局部内部类
                {2}.定义在方法当中
                {3}.必须在定义匿名内部类的时候创建的对象

        <2>.格式:
                new 类/接口{
                    如果是创建了继承这个类的子类对象，我们可以重写父类的方法
                    如果是创建了实现这个接口的子类对象，我们必须要实现该接口所有的方法
                }

        <3>.原理: 而是创建了继承这个类的子类对象或者是创建了实现这个接口的子类对象

        <4>.举例:
                public class InnerDemo4 {
                    public static void main(String[] args) {
                        Outer o = new Outer();
                        o.method();
                    }
                }

                interface Inner{
                    public void function();
                }

                class Outer{
                    public void method(){
                        // 方法一
                        /*new Inner(){
                            @Override
                            public void function() {
                                System.out.println("function");
                            }
                        }.function();;*/
                        
                        // 方法二
                        Inner i = new Inner(){
                            @Override
                            public void function() {
                                System.out.println("function");	
                            }	
                        };
                        
                        i.function();
                        i.function();
                    }
                }

        <5>.练习:
                参考:  day15/code/匿名内部类的使用
