##  1.java手册的使用
        详细情况 day08/API/API的使用.txt

##  2.Scanner: 键盘录入
        举例:
            import java.util.Scanner;

            public class ScannerDemo {
                public static void main(String[] args) {
                    // 创建键盘输入数据
                    Scanner sc = new Scanner(System.in);
                    // 接收数据
                    System.out.println("请输入一个数据");
                    String s = sc.nextLine();
                    // 输出数据
                    System.out.println(s);
                }
            }

##  3.String类
        <1>.String类: 字符串类
		    由多个字符串组成的遗传数据

        <2>.构造方法：
                String(String original):把字符串数据封装成字符串对象
                String(char[] value):把字符数组的数据封装成字符串对象
                String(char[] value, int index, int count):把字符数组中的一部分数据封装成字符串对象

        <3>.注意：
                字符串是一种比较特殊的引用数据类型，直接输出字符串对象输出的是该对象中的数据。

        <4>.举例如下:
                public class StringDemo {
                    public static void main(String[] args) {
                        // 方法1：
                        // String(String original):把字符串数据封装成字符串对象
                        String s1 = new String("hello");
                        System.out.println(s1); // 输出 "hello"
                        System.out.println("-------------");
                        
                        // 方法2
                        // String(char[] value):把字符数组的数据封装成字符串对象
                        char[] arr = {'h','e','l','l','o'};
                        String s2 = new String(arr);
                        System.out.println(s2); // 输出"hello"
                        System.out.println("-------------");
                        
                        // 方法3
                        // String(char[] value, int index, int count):把字符数组中的一部分数据封装成字符串对象
                        String s3 = new String(arr, 1,3);
                        System.out.println(s3); // 输出"ell"
                        System.out.println("-------------");
                        
                        // 方法4
                        String s4 = "hello";
                        System.out.println(s4); // 输出"hello"
                    }
                }

##  4.构造方法创建的字符串对象和直接赋值方式创建的区别
        <1>.通过构建方法创建字符串对象是在堆内存
            直接赋值方式创建对象是在方法区的常量池

        <2>. ==:
                基本数据类型: 比较的是基本数据类型的值是否相同
                引用数据类型: 比较的是引用数据类型的地址值是否相同

        <3>.举例如下:
                public class StringDemo2 {
                    public static void main(String[] args) {
                        String s1 = new String("hello");
                        String s2 = "hello";
                        System.out.println("s1:" + s1); // 输出"s1:hello"
                        System.out.println("s2:" + s2); // 输出"s2:hello"
                        System.out.println("s1==s2" + (s1==s2));// 输出false
                        
                        String s3 = "hello";
                        System.out.println("s2==s3" + (s2==s3));// 输出true
                    }
                }

##  5.String的判断功能:
 		<1>. boolean equals(Object obj): 
                比较字符串的内容是否相同

 		<2>. boolean equalsIgnoreCase(String: str): 
                比较字符串的内容是否相同，忽略大小写

 		<3>. boolean startsWith(String str): 
                判断字符串对象是否为指定str开头

 		<4>. boolean endsWith(String str): 
                判断字符串对象是否为指定的str结尾
        
        <5>.举例:
                public class StringDemo {
                    public static void main(String[] args) {
                        String str = "hello,world";
                        String s1 = "hello,world";
                        String s2 = "Hello,World";
                        String s3 = "hel";
                        String s4 = "old";
                        System.out.println(str.equals(s1)); // 输出 true
                        System.out.println(str.equalsIgnoreCase(s2)); // 输出 true
                        System.out.println(str.startsWith(s3)); // 输出 true
                        System.out.println(str.endsWith(s4)); // 输出 false
                    }
                }

        <6>.练习:  模拟登陆，给3次机会，并提示还有几次
                代码请看: day08/code/String/StringTest.java

##  6.string的获取功能
		<1>.int length(): 
                获取字符串的长度，其实也就是字符个数

 		<2>.char charAt(int index): 
                获取指定索引处的字符

 		<3>.int indexOf(String str): 
                获取str在字符串对象中第一次出现的索引

 		<4>.String substring(int start): 
                从start开始截取字符串

 		<5>.String substring(int start, int end): 
                从start开始,到end结束截取字符串。包括start,不包括end

        <6>.举例:
                public class StringDemo {
                    public static void main(String[] args) {
                        String arr = "helloworld";
                        
                        // int length(): 获取字符串的长度，其实也就是字符个数
                        System.out.println(arr.length()); // 输出10
                        
                        // char charAt(int index): 获取指定索引处的字符
                        System.out.println(arr.charAt(5)); // 输出 "w"
                        
                        // int indexOf(String str): 获取str在字符串对象中第一次出现的索引
                        System.out.println(arr.indexOf("l")); // 输出 2
                        System.out.println(arr.indexOf("ak")); // 输出 -1
                        
                        // String substring(int start): 从start开始截取字符串
                        System.out.println(arr.substring(3)); // 输出"loworld"
                        
                        // String substring(int start, int end): 从start开始,到end结束截取字符串。包括start,不包括end
                        System.out.println(arr.substring(5, arr.length())); // 输出"world"
                    }
                }

        <7>.练习：
            {1}.遍历字符串(获取每个字符)
                代码请看:   day08/code/String/StringTest2.java

            {2}.统计一个字符串中大写字母字符,小写字母字符,数字字符出现的次数(不考虑其他字符)
                代码请看:   day08/code/String/StringTest3.java

##  7.string的转换功能
        <1>.char[] toCharArray(): 
                把字符串转换为字符数组

 		<2>.String toLowerCase(): 
                把字符串转换为小写字符串

 		<3>.String toUpperCase(): 
                把字符串转换为大写字符串

        <4>.举例：
                public class StringDemo {
                    public static void main(String[] args) {
                        String arr = "HelloWorld";
                        char[] a = arr.toCharArray();
                        
                        //char[] toCharArray(): 把字符串转换为字符数组
                        System.out.println(a); 
                        
                        // String toLowerCase(): 把字符串转换为小写字符串
                        String b = arr.toLowerCase(); // 输出: "helloworld"
                        System.out.println(b);
                        
                        // String toUpperCase(): 把字符串转换为大写字符串
                        String c = arr.toUpperCase();
                        System.out.println(c); // 输出： "HELLOWORLD"
                    }
                }