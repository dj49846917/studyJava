# 第一天

## 1.常用dos命令
        <1>. win + R 然后cmd回车    (打开控制台)
        <2>. d: 回车                (切换盘)
        <3>. dir                    (列出当前目录下的文件以及文件夹)
        <4>. cd                     (进入指定目录)
        <5>. cls                    (清屏)
        <6>. exit                   (退出dos命令行)
        <7>.win + D                 (切换回桌面)
        <8>.Ctrl + Shift + <=       (选中当前行)
    
## 2.环境安装
    <1>.JDK的下载和安装
        安装：
            路径：F:\develop\Java\jdk1.8.0_191\     jre路径：F:\develop\Java\jre8

    <2>.helloworld案例的编写及运行
        1).找到jdk的bin路径： F:\develop\Java\jdk1.8.0_191\bin

        2).看到有个javac.exe, 在bin目录下创建helloworld.java文件。

        3).helloworld的编写  
            {1}.首先定义一个类                      public class 类名
                
            {2}.在类定义后加上一对大括号             {}

            {3}.在大括号中间添加一个主（main）方法/函数        public static void main(String args){}

            {4}.在主方法的大括号中间添加一行输出语句            System.out.println("helloworld")
            
            {5}.代码如下:
                public class HelloWorld {
                    public static void main (String[] args){
                        System.out.println("HelloWorld");
                    }
                }

        4).helloworld的运行
            {1}.在F:\develop\Java\jdk1.8.0_191\bin目录下cmd
                
            {2}.输入javac HelloWorld.java,看到生成了HelloWorld.class的文件  （编译过程）

            {3}.输入java HelloWorld (不用输入.class后缀)    （解释运行）

    <3>.helloworld案例常见问题

        public class HelloWorld {
            public static void main (String[] args){
                System.out.println("HelloWorld");
            }
        }

        1).单词拼写问题
            {1}.class  ==>  Class   (错误)
            {2}.String  ==>  string   （错误）
            {3}.System  ==>  system    (错误)
            {4}.main   ==>   mian   (错误)

        2).中文符号问题
            提示非法字符

    <4>.Notepad软件的安装与使用
        1).安装路径: F:\develop\Notepad++  一直下一步

        2).设置
            点击设置 ==> 首选项 ==> 新建 ==>默认语言和编码
![nodepad的配置][https://raw.githubusercontent.com/dj49846917/studyJava/master/day01/%E8%A7%A3%E9%87%8A%E5%9B%BE/nodepad%E7%9A%84%E9%85%8D%E7%BD%AE.png]

    <5>.path环境变量的配置
        1).为什么要配置
            程序的执行和编译需要用到javac和java命令，所以只能在bin目录下编写，实际开发中不用

        2).如何配置
            {1}.创建新的变量名: JAVA_HOME
                计算机 ==> 右键 ==> 高级系统设置 ==> 环境变量 ==> 系统变量

            {2}.为JAV_HOME添加变量值: JDK安装目录

            {3}.在path环境变量最前面添加如下内容
                %JAVA_HOME%\bin;
![找到环境变量](https://raw.githubusercontent.com/dj49846917/studyJava/master/day01/%E8%A7%A3%E9%87%8A%E5%9B%BE/path1.png)
![新建JAVA_HOME变量](https://raw.githubusercontent.com/dj49846917/studyJava/master/day01/%E8%A7%A3%E9%87%8A%E5%9B%BE/path2.png)
![编辑path变量](https://raw.githubusercontent.com/dj49846917/studyJava/master/day01/%E8%A7%A3%E9%87%8A%E5%9B%BE/path3.png)

## 3.注释
    <1>.的单行注释   // 注释文字
    <2>.多行注释    /* 注释文字 */

## 4.关键字
    <1>.被Java语言赋予特定含义的单词
    <2>.特点:
        1).组成关键字的字母全部小写
        2).常用的代码编辑器,针对关键字有特殊的颜色标记，非常直观

    <3>.常用关键字如下:
![常用关键字](https://raw.githubusercontent.com/dj49846917/studyJava/master/day01/%E8%A7%A3%E9%87%8A%E5%9B%BE/keyword.png)  

## 5.常量
    <1>.常量：在程序执行的过程中，其值不可以发生改变的量
    
    <2>.常量分类：
        A:字符串常量	"HelloWorld"
        B:整数常量		12,-23
        C:小数常量		12.34
        D:字符常量		'a','0'
        E:布尔常量		true,false
        F:空常量		null(后面讲解)

    <3>.代码如下:

        public class ChangLiang {
            public static void main(String[] args) {
                //字符串常量
                System.out.println("HelloWorld");
                
                //整数常量
                System.out.println(12);
                
                //小数常量
                System.out.println(12.34);
                
                //字符常量
                System.out.println('a');
                System.out.println('0');

                //布尔常量
                System.out.println(true);
                System.out.println(false);
            }
        }

## 6.变量
    <1>.变量的定义和使用
        1).代码实例如下:
            public class BianLiang{
                public static void main(String[] args){
                    int i = 10;
                    System.out.println(i);
                }
            }

        2).变量定义的注意事项:
            {1}.变量未赋值，不能直接使用
                错误案例:
                    public class Variable2{
                        public static void main(String[] args){
                            int a;
                            System.out.println(a); // 错误

                            /*
                                int a = 20;
                                System.out.println(a); // 正确
                            */
                        }
                    }

            {2}.变量只在它所属的范围内有效
                错误案例:
                    public class Variable2{
                        public static void main(String[] args){
                            {
                                // 代码块
                                int b = 20;
                                System.out.println(b); // 正确
                            }
                            System.out.println(b); // 错误
                        }
                    }

            {3}.一行上可以定义多个变量，但是不建议
                public class Variable2{
                    public static void main(String[] args){
                        int a,b;
                        a = 10;
                        b = 20;
                        System.out.println(a); // 错误
                        System.out.println(b); // 错误

                        /*
                            int a = 10;
                            int b = 20;
                            System.out.println(a); // 正确
                            System.out.println(b); // 正确
                        */
                    }
                }
            


## 7.计算机存储单元
    <1>.最小信息单元：位（bit）
    <2>.最小存储单元: 字节(byte =>B)
    <3>.单位:
        1B(字节) = 8bit
        1KB = 1024B
        1MB = 1024KB ...

## 8.数据类型
    <1>.java是一种强类型语言，针对每一种数据都给出了明确的数据类型

    <2>.数据类型分类:
        1).基本数据类型
        2).引入数据类型(类，接口，数组)

    <3>.基本数据类型：4种8类
        1).整数                     占用字节数
            byte                    1
            short                   2
            int                     4
            long                    8
        
        2).浮点数
            float                   4
            double                  8

        3).字符
            char                    2

        4).布尔
            boolean                 1

    <4>.注意：
        1).整数默认是int类型，浮点数默认是double类型
        2).定义long类型的时候，要加L或者l，建议加L
        3).定义floa类型的时候，要加F或者f，建议加F

    <5>.常见命名规则
		1).常见的命名
			{1}.包(其实就是文件夹，用于对类进行管理)
				全部小写，多级包.隔开
				举例：  com,com.ithema
				
			{2}.类
				[1].一个单词首字母大写
					举例: Student.Car
				[2].多个单词每个单词的首字母大写
					举例: HelloWorld
			
			{3}: 方法和变量
				[1].一个单词首字母大写
					举例:age.show()
				[2].多个单词组成从第二个单词开始每个单词的首字母大写
					举例:maxAge,getAge()

## 9.类型转换
    <1>. +: 这是一个运算符，用于做加法运算的。
    我们在做运算的时候，一般要求参与运算的数据的类型必须一致

    <2>.类型转换:
        1).隐式转换
        2).强制转换

    <3>.隐式转换：
        1).byte,short,char ==> int ==>long ==> float ==> double
        表示，有int类型，就转化成了int类型，有更高的类型，比如long就转换成long类型

        2).实例:
            public class TypeCast{
                public static void main(String[] args){
                    byte a = 10;
                    int b = 30;
                    System.out.println(a + b); // 输出30
                    
                    byte d = a + b; // 报错
                    System.out.println(d) // 报错

                    int e = a + b; // 正确
                    System.out.println(e) // 正确
                }
            }
    
    <4>.强制转换
        <1>. 目标类型 变量名 = (目标类型)(被转换的数据);
        
        <2>.实例:
            public class TypeCast2{
                public static void main(String[] args){
                    byte a = 10;
                    int b = 20;
                    
                    byte c = a + b; // 报错
                    System.out.println(c) // 报错

                    byte d = (byte) (a + b) // 正确
                    System.out.println(d) // 正确
                }
            }
