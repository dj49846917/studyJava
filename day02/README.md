# eclipse的安装与运行

## 1.安装
    <1>.安装到与jdk同一目录  F:\develop\Java
    <2>.打开eclipse, 将workplace的目录放到jdk同一目录  F:\develop\Java

## 2.eclipse的基本使用
    <1>.新建项目
        在空白区域右键 ==> new ==> Project ==>点击选择JAVA project ==> 点击next ==>项目名称 ==>finish

    <2>.创建包(文件夹)
        在src目录右键 ==> new ==> package ==> 在name处填写com.itheima ==> finish

    <3>.创建类(HelloWorld)
        在com.itheima下右键 ==> new => class ==> 在name处填写HelloWorld ==> finish

    <4>.编译
        保存时自动编译

    <5>.运行
        在文件代码中右键 ==> Run as ==> Java Application

## 3.eclipse工作空间基本配置
    <1>.行号的显示和隐藏
        点击行号右键 ==> show line numbers勾选

    <2>.字体大小及颜色
        1).代码区域的字体大小
            window ==> Preferences ==> General ==> Appearance ==> Colors and Fonts ==> Java ==> Java Editor Text Font ==> edit ==> 选12 ==> 点击确定 ==> 点击apply ==> OK

        2).控制台
             window ==> Preferences ==> General ==> Appearance ==> Colors and Fonts ==> Debug ==> console fonts ==> edit ==> 选12 ==> 点击确定 ==> 点击apply ==> OK

    <3>.窗体给弄乱了，怎么办
        window ==> Prespective ==> Reset Perspective
            
    <4>.控制台找不到了，怎么办
        window ==> Show View ==>console

## 4.eclipse辅助键和快捷键
    <1>.内容辅助键          alt + /
        main   然后alt + / + 回车
        syso   然后alt + / + 回车

    <2>.快捷键
        1).单行注释
            选中内容, ctrl + /,取消就再来一次

        2).多行注释
            选中内, ctrl + shift + /
            取消 ctrl + shift + \
        
        3).格式化
            ctrl + shift + f        或者 右键 ==>Source ==> Format

## 5.eclipse中项目的删除和导入
    <1>.删除项目
        选中项目 ==> 右键 ==>delete ==> ok
        1).从项目区域删除
        2).硬盘上删除
            选中项目 ==> 右键 ==> delete ==> 勾选 delete project contents on desk ==> ok
        
    <2>.导入项目
        项目区域右键 ==> import ==> exising projects into workspace ==> next ==> Browse ==> 选择你的项目 ==> finish

## 6.运算符
    <1>.概念： 就是用于对变量进行操作的符号
    <2>.表达式: 用运算符连接起来的符合Java语法的式子。不同的运算符连接的表达式是不同类型的表达式
 		举例：a,b
 		    a + b

    <3>.运算符分类：
        1).算术运算符
        2).赋值运算符
        3).关系运算符
        4).三元运算符 

    <4>.算术运算符:
        +,-,*,/,++,--,
        1).加减乘除

            {1}.举例:
                public class Operator{
                    public static void main(String[] args){
                        int a = 3;
                        int b = 4;
                        System.out.println(a + b); // 输出 7
                        System.out.println(a - b); // 输出 -1
                        System.out.println(a * b); // 输出 12
                        System.out.println(a / b); // 输出 0
                    }
                }
            
            {2}.注意，整数相除，只能得到整数，如果想要得到小数，则要浮点数参与运算
                System.out.println(3.0 / 4) // 输出 0.75

        2). %: 用于获取两个数据相除时候的余数
            /: 用于获取两个数据相除时候的商

            举例:
                public class Operator{
                    public static void main(String[] args){
                        int a = 3;
                        int b = 5;
                        System.out.println(b / a) // 输出1(商)
                        System.out.println(b % a) // 输出2(余数)
                    }
                }

        3). 注意:
            + : 做加法运算
            
            {1}. 字符参与加法运算，其实是拿字符在计算机存储的数据值来参与计算的
                    'A' 65
                    'a' 97
                    '0' 48
            
            {2}. 字符串参与加法运算，实际是做字符串的拼接

            {3}.举例如下：
                public class OperatorDemo3 {
                    public static void main(String[] args) {
                        // 定义变量
                        int a = 10;
                        int b = 20;
                        System.out.println(a + b); // 输出30
                        
                        // 字符参与加法运算
                        char c = 'A';
                        System.out.println(a + c); // 输出75
                        
                        // 字符串参与加法运算
                        System.out.println("hello" + a); // 输出hello10
                        System.out.println("hello" + a + b); // 输出hello1020
                        System.out.println(a + b + "hello"); // 输出30hello
                    }
                }
            
            {4}. ++,--:自增自减，用于对变量+1或者-1
                
                [1]. ++，--既可以用在变量的后面，也可以用在变量的前面
                    public class Operator4{
                        public static void main(String[] args){
                            int a = 10;
                            System.out.println("a:" + a)  // 输出a:10
                            
                        }
                    }
                
                [2].单独使用的时候，++或者--放在变量的前面或者后面，结果一样
                    public class Operator4{
                        public static void main(String[] args){
                            int a = 10;

                            // a++;
                    	    // System.out.println("a：" + a); // 输出 a:11

                            ++a;
                    		System.out.println("a：" + a); // 输出 a:11
                            
                        }
                    }

                [3].参与其他操作的时候:
                    ++在后面，先拿变量做操作，然后变量再++;
                    ++在前面，先变量++,然后再变量做操作

                    public class Operator4{
                        public static void main(String[] args){
                            int a = 10;

                            int b = a;
                            System.out.println("b:" + b); // 输出b: 10

                            // int b = a++;
                            // System.out.println("b:" + b); // 输出 b: 10

                            // int b = ++a;
                            // System.out.println("b:" + b); // 输出b: 11
                            
                        }
                    }
    
    <5>.赋值运算符
        {1}.基本的赋值运算符: =
        {2}.扩展的赋值运算符: +=, -=, *=, /= ...

        举例:
            public class OperatorDemo {
                public static void main(String[] args) {
                    // 定义变量
                    int a = 10;
                    
                    // +=的操作
                    // 拿+=的左边和右边的数据做+,然后把赋值给左边
                    a += 20;
                    System.out.println("a：" +a); // 输出 a: 30
                    
                    // 注意:扩展运算符运算，隐含了强制类型转换
                    // 有一个变量a, a+=10;
                    // 相当于: a = (a的数据类型)(a+10)
                    
                    short s = 2;
                    s += 1;
                    System.out.println(s); // 输出3
                }
            }

    <6>.关系运算符
        ==, !=, >, >=, <=
        关系运算符的结果是boolean类型的
        
        举例:
            public class OperatorDemo {
                public static void main(String[] args) {
                    // 定义变量
                    int a = 10;
                    int b = 20;
                    int c = 10;
                    
                    // ==
                    System.out.println(a == b); // 输出flase
                    System.out.println(a == c); // 输出true
                }
            }

        注意:
        // 把b的值赋给a,然后输出a的值 
		    System.out.println(a = b); // 输出20

    <7>.逻辑运算符
        {1}. 逻辑运算符:用于连接关系表达式   &, |, ^, !,	&&, ||
        {2}.&: 有false则false
            public class OperatorDemo {
                public static void main(String[] args) {
                    int a = 3;
                    int b = 4;
                    int c = 5;
                    
                    // &: 有false则false
                    System.out.println((a>b)&(a>c)); // false&false =>输出false
                    System.out.println((a>b)&(a<c)); // false&true =>输出false
                    System.out.println((a<b)&(a>c)); // true&false =>输出false
                    System.out.println((a<b)&(a<c)); // true&true =>输出true
                }
            }

        {3}. |: 有true则true
                System.out.println((a>b)|(a>c)); // false|false =>输出false
                System.out.println((a>b)|(a<c)); // false|true =>输出true
                System.out.println((a<b)|(a>c)); // true|false =>输出true
                System.out.println((a<b)|(a<c)); // true|true =>输出true

        {4}. ^: 相同则false，不同则true。 举例: 情侣关系。(男女)
                System.out.println((a>b)^(a>c)); // false^false =>输出false
                System.out.println((a>b)^(a<c)); // false^true =>输出true
                System.out.println((a<b)^(a>c)); // true^false =>输出true
                System.out.println((a<b)^(a<c)); // true^true =>输出false

        {5}. !: true则false,false则true
            System.out.println((a>b)); // 输出false
            System.out.println(!(a>b)); // 输出true

    <8>.三元运算符
        {1}.格式:
            关系表达式? 表达式1 ： 表达式2
        
        {2}.执行流程:
            A: 计算关系表达式的值,看是true还是false
            B：如果是true,表达式1就是结果
                如果是false,表达式2就是结果

        {3}.举例:
            public class OperatorDemo {
                public static void main(String[] args) {
                    // 定义变量
                    int a = 10;
                    int b = 20;

                    int c = (a > b) ? a : b;
                    System.out.println("c:" + c);
                }
            }

    <9>.键盘录入
        {1}.如何实现键盘录入数据呢？目前我们只能使用JDK提供的类Scanner
        {2}.Scanner使用步骤:
            [1]: 导包
                import java.util.Scanner;
                在一个类中顺序: 
                        package > import > class
            
            [2]: 创建键盘录入对象
                Scanner sc = new Scanner(System.in);
            
            [3]: 接收数据
    			int i = sc.nextInt();
        
        {3}.代码如下:
            package com.itheima;
            import java.util.Scanner;

            public class ScannerDemo{
                public static void main(String[] args){
                    Scanner.sc = new Scanner(System.in);
                    System.out.println("请输入一个数据");

                    int i = nextInt()
                    System.out.println("输出结果:" + i);
                }
            }

        {4}.练习：(判断输入的值是否相等)
            import java.util.Scanner;
            public class ScannerTest{
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("请输入一个数据");

                    int a = sc.nextInt();
                    System.out.println(a);
                    int b = sc.nextInt();
                    System.out.println(b);
                    boolean c = (a == b) ? true : false;
                }
            }




        
        
