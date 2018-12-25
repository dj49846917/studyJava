# 异常
## 1. 异常的介绍

## 2. 异常的处理方式
        <1>. 捕获处理:
                1).try...catch语句

                2).格式:
                     try{
                        有可能出现问题的代码;
                    } catch(ArithmeticException ae) {
                        处理异常;
                    }   

                3).try...catch的执行顺序
                    首先执行try语句
 					如果发现异常，异常下面的代码不再执行，直接跳入catch语句中，catch语句结束后，整个try...catch结束
 					如果没有发现异常，try语句执行结束后，try...catch直接结束，不再执行catch语句		

        <2>.抛出去:
                当我们不想处理异常，或者没有能力处理的时候，我们可以选择抛出异常，谁调用方法谁处理异常
     			使用关键字throws在方法的声明出抛出异常

        <3>jvm处理异常的方式:
                如果出现异常我们没有处理，jvm会帮我们处理，他会把异常的类型，原因还有位置显示在命令行上
                并且还终止了程序，异常后面的代码将不再执行

        <4>.具体代码请看: 
                day19/code/ExceptionDemo2.java

##  3.处理多个异常
        <1>.方式:
                {1}. 可以使用多个try...catch语句
                {2}. 使用一个try和多个catch

        <2>.多个catch之间的顺序:
                {1}. 多个catch之间可以有子父类
                {2}. 同级之间没有顺序关系

        <3>.举例:
                public class ExceptionDemo3 {
                    public static void main(String[] args) {
                //		method();
                        
                        // 类似if和else
                        method2();
                    }

                    private static void method2() {
                        try {
                //			String s = null;
                //			System.out.println(s.length()); // 报错	输出: 出现空指针了
                            
                //			int[] arr = new int[5];
                //			System.out.println(arr[8]); // 报错  	输出: 数组越界
                            
                            System.out.println(2 / 0); // 报错	输出: 操作异常
                        } catch (NullPointerException e) {
                            System.out.println("出现空指针了");
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("数组越界");
                        } catch (Exception e) {
                            System.out.println("操作异常");
                        }
                    }

                    private static void method() {
                        try {
                            String s = null;
                            System.out.println(s.length()); // 报错
                        } catch (NullPointerException e) {
                            System.out.println("出现空指针了");
                        }

                        try {
                            int[] arr = new int[5];
                            System.out.println(arr[8]); // 报错
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("数组越界");
                        }
                    }
                }

##  4.Throwable的常用方法
        <1>.String getMessage(): 原因

        <2>.String toString(): 类型和原因

        <3>.void printStackTrace()： 类型、原因和位置

        <4>.快捷键:
                选中代码右键 =》 Surround with =》 try/catch block

        <5>. 举例:
                public class ExceptionDemo4 {
                    public static void main(String[] args) {
                //		method();
                        try {
                            System.out.println(2 / 0);
                        } catch (ArithmeticException e) {
                            e.printStackTrace();
                        }
                    }

                    private static void method() {
                        try{
                            System.out.println(2 / 0);
                        } catch (ArithmeticException e) {
                            // String getMessage(): 原因
                            System.out.println(e.getMessage());
                            
                            // String toString(): 类型和原因
                            System.out.println(e.toString());
                            
                            // void printStackTrace()： 类型、原因和位置
                            e.printStackTrace();
                        }
                        System.out.println("hello");
                    }
                }

##  5. finally的用法
        <1>.finally: 
                组合try...catch使用，用于释放资源等收尾工作，无论try...catch语句如何执行，finally的代码一定会执行

        <2>.格式:
                try{
                    有可能出问题的代码
                } catch (异常对象) {
                    处理异常
                } finally {
                    释放资源;
                    清理资源
                }

        <3>.举例:
                public class ExceptionDemo5 {
                    public static void main(String[] args) {
                //		method();
                        FileWriter fw = null;
                        try {
                            System.out.println(2 / 0); // 写到这里报错空指针因为没有new对象
                            fw = new FileWriter("a.txt");
                            fw.write("hello");
                            fw.write("world");
                            System.out.println(2 / 0);
                            fw.write("java");
                        } catch (IOException e) {
                            e.printStackTrace();
                        } finally{
                            // 释放资源
                            try {
                                if(fw != null){
                                    fw.close();
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    private static void method() {
                        try {
                            System.out.println(2 / 0);
                        } catch (ArithmeticException e) {
                            System.out.println("除数不能为0");
                        } finally {
                            System.out.println("清理垃圾");
                        }
                    }
                }

##  6. 异常的分类
        <1>.运行时期异常: RuntimeException的子类就是运行时期异常，在编译时期可以选择处理或者不处理
        <2>.编译时期异常: 在编译时期必须处理
        <3>.举例:
                public class ExceptionDemo6 {
                    public static void main(String[] args) {
                        // 运行时期异常举例:
                        method();
                        
                        // 编译时期异常举例:
                //		FileWriter fw = new FileWriter("a.txt");
                    }

                    private static void method() {
                        // 1:
                        System.out.println(2 / 0);
                        
                        // 2:
                        String s = null;
                        System.out.println(s.length());
                    }
                }

##  7.自定义异常
        <1>. 需求:写一个方法，接收考试成绩，如果考试成绩的范围在0-100之间则属于正常，否则属于异常

        <2>.如何自定义一个异常类呢？
                非常简单，写一个类去继承Exception或者RuntimeException,然后实现多个构造即可

                {1}.运行时： 
                    继承 RuntimeException
                    public class myException1 extends RuntimeException

                        1).举例:
                                public class ExceptionDemo7 {
                                    public static void main(String[] args) {
                                        try {
                                            checkScore(110);
                                        } catch (Exception e) {
                                            System.out.println(e.getMessage());
                                        }
                                    }
                                    
                                    // 抛出myException1自定义的异常(如果是继承的RuntimeException，这里不用抛出异常)
                                    public static void checkScore(int score){
                                        if(score < 0 || score >100){
                                            throw new myException1("不符合要求");
                                        }
                                        System.out.println("成绩符合要求");
                                    }
                                }

                                class myException1 extends RuntimeException{
                                    public myException1() {
                                        super();
                                    }
                                    public myException1(String message) {
                                        super(message);
                                    }
                                }
                        

                {2}.编译时:
                    继承 Exception
                    public class myException2 extends Exception

                        1).举例:
                                public class ExceptionDemo7 {
                                    public static void main(String[] args) {
                                        try {
                                            checkScore(110);
                                        } catch (Exception e) {
                                            System.out.println(e.getMessage());
                                        }
                                    }
                                    
                                    public static void checkScore(int score) throws myException2{
                                        if(score < 0 || score >100){
                                            throw new myException2("不符合要求");
                                        }
                                        System.out.println("成绩符合要求");
                                    }
                                }

                                class myException2 extends Exception{
                                    public myException2() {
                                        super();
                                    }

                                    public myException2(String message) {
                                        super(message);
                                    }
                                }
        
        <3>.快捷键：
        		右键 =》  Source =》 Generate Constructors and Superclass...

        <4>.throws: 处理异常的一种方式，把异常抛出，由调用者来处理
            throw: 制造异常的方式,并且结束方法

        <5>.注意: 如果抛出(throw)的是编译时期异常，必须在方法声明处抛出(throws)

        <6>.详细代码请参考:
                day19/code/ExceptionDemo7.java

##  8.递归
        <1>.递归注意事项:
                递归一定要有出口（内存溢出）
                递归次数不宜过多（内存溢出）

        <2>.练习: 求5的阶乘
            {1}.举例:
                    public class RecurrenceDemo {
                        public static void main(String[] args) {
                            int result = jc(5);
                            System.out.println(result);
                        }
                        
                        public static int jc(int n){
                            // 必须要有出口
                            if(n == 1){
                                return 1;
                            }else {
                                return n * jc(n - 1);
                            }
                        }
                    }

        <3>.练习： 有一对兔子，从出生后第3个月起每个月生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第20个月的兔子对数是多少？
            {1}.举例:
                    public class RecurrenceDemo2 {
                        public static void main(String[] args) {
                            int result = method(20);
                            System.out.println(result); // 输出: 6765
                        }
                        
                        public static int method(int n){
                            // 如果是第一个月，只有一对兔子
                            if(n == 1){
                                return 1;
                            }else if(n == 2){
                                return 1;
                            }else{
                                // 如果不是第一个月和第二个月，则兔子的数量是前两个月之和
                                return method(n-1) + method(n-2);
                            }
                        }
                    }