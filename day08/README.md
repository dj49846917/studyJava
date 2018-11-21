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

        <5>.练习：
                {1}.键盘录入一个字符串，把该字符串的首字母转成大写，其余小写(只考虑英文大小写字母字符);
                        代码请参考:  day08/code/String/StringTest4.java

        <6>.去除字符串两端的空格
                String trim()

        <7>.按指定符号分割字符串
                String[] split(String str)

        <8>. 举例：
                public class StringDemo {
                    public static void main(String[] args) {
                        String s1 = "helloworld";
                        String s2 = "  helloworld  ";
                        String s3 = " hello world ";
                        System.out.println("---" + s1 + "---");
                        System.out.println("---" + s1.trim() + "---"); // 输出---helloworld---
                        System.out.println("---" + s2 + "---");// 输出---  helloworld  ---
                        System.out.println("---" + s2.trim() + "---");// 输出---helloworld---
                        System.out.println("---" + s3 + "---");// 输出--- hello world --- 
                        System.out.println("---" + s3.trim() + "---");// 输出---hello world---
                    
                        // String[] split(String str);
                        String s = "aa,bb,cc";
                        String[] arr = s.split(",");
                        System.out.println(arr);
                        for(int x=0;x<arr.length;x++){
                            System.out.println(arr[x]); // ["aa","bb","cc"];
                        }
                    }
                }

        <9>.练习:   
                {1}.把数组中的数据按照指定格式拼接成一个字符串
                        举例: int[] arr = {1,2,3};
                        输出结果: [1,2,3];
                        代码请看： day08/code/String/StringTest5.java

                {2}.字符串反转
                        举例: 键盘录入"abc"
                        输出: "cba"
                        代码请看： day08/code/String/StringTest6.java
                
##  8.StringBuilder类
        <1>.拼接字符串耗费内存原因:
                每次拼接都会产生新的字符串对象,而利用StringBuilder来拼接字符串自始至终用的都是同一个StringBuilder容器
        
        <2>.概念:
                是一个可变的字符串。字符串缓冲区类。

        <3>.String和StringBuilder的区别:
                String的内容是固定的。
                String的Builder的内容是可变的。

        <4>.成员方法:
                public int capacity(): 返回当前容量
                public int length(): 返回长度(字符数)
        
                容量:理论值
                长度:实际值

        <5>.举例：
                public class StringBuilderDemo {
                    public static void main(String[] args) {
                        StringBuilder sb = new StringBuilder();
                        System.out.println(sb);
                        System.out.println("sb.capacity"+sb.capacity()); // 输出16
                        System.out.println("sb.length()"+sb.length()); // 输出0
                    }
                }

        <6>.
            {1}.添加功能:
		        public StringBuilder append(任意类型): 添加数据，并返回自身对象

            {2}.反转功能:
                public StringBuilder reverse()

            {3}.链式编程
                    举例:
                        sb.append("hello").append("world").append(true);
		                System.out.println(sb); // 输出"helloworldtrue"
            
            {4}.代码如下:
                public class StringBuilderDemo {
                    public static void main(String[] args) {
                        // 创建对象
                        StringBuilder sb = new StringBuilder();
                        
                        // public StringBuilder append(任意类型)
                        StringBuilder sb2 = sb.append("hello");
                        

                        System.out.println("sb2" + sb2); // 输出"hello"
                        System.out.println("sb" + sb);// 输出"hello"
                        System.out.println(sb == sb2);// 输出true 说明作用于同一个地址
                        
                        sb.append("world");
                        sb.append(true);
                        System.out.println(sb); // 输出"helloworldtrue"
                        
                        // 链式编程
                        sb.append("hello").append("world").append(true);
                        System.out.println(sb); // 输出"helloworldtrue"
                        
                        // public StringBuilder reverse() // 反转
                        sb.reverse();
                        System.out.println(sb); // 输出"eurtdlrowolleholleh"
                    }
                }

        
        <7>.StringBuilder与String的相互转化
            {1}. StringBuilder ==> String
                    public String toString(): toString()将StringBuilder转化为String

            {2}. String ==> StringBuilder
                    StringBuilder(String str): 用过构造方法就可以实现把String转化为StringBuilder

            {3}.举例:
                    public class StringBuilderTest {
                        public static void main(String[] args) {
                            
                            // StringBuilder 转化为 String
                            StringBuilder sb = new StringBuilder();
                            sb.append("hello").append("world");
                            System.out.println("sb:" + sb); // 输出"sb:helloworld"
                            String s = sb.toString();
                            System.out.println("s:" +s); // 输出"s:helloworld"
                            
                            // String 转化为 StringBuilder
                            String arr = "好好学习";
                            StringBuilder ar = new StringBuilder(arr);
                            System.out.println("ar:"+ar); // 输出 "ar: 好好学习"
                        }
                    }
            
            {4}.练习
                    1).把数组拼接成一个字符串
                        举例：int[] arr = {1,2,3}
                        结果:[1,2,3]
                        代码请看：
                                day08/code/StringBuilder/StringBuilderTest.java

                    2).键盘录入一个数据，并实现反转
                        代码请看:
                                day08/code/StringBuilder/StringBuilderTest2.java

                    3).键盘录入一个数据，并判断是否为对称字符串
                        代码请看:
                                day08/code/StringBuilder/StringBuilderTest3.java
                        
        