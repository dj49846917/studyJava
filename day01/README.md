# 第一天

## 1.常用dos命令
        <1>. win + R 然后cmd回车    (打开控制台)
        <2>. d: 回车                (切换盘)
        <3>. dir                    (列出当前目录下的文件以及文件夹)
        <4>. cd                     (进入指定目录)
        <5>. cls                    (清屏)
        <6>. exit                   (退出dos命令行)
    
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
![nodepad的配置](https://github.com/dj49846917/vueShopping/blob/master/static/images/home.jpg)

    <5>.path环境变量的配置