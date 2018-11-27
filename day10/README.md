## 1. IO流概述和分类
    <1>.概念:
        IO流用来处理设备之间的数据传输，可以把数据存储到文件，也可以从文件中读取数据

    <2>.常见应用:
        1).文件复制(U盘拷贝内容)
        2).上传文件(微信图片，QQ图片)
        3).下载文件(迅雷)

    <3>.分类:
        1).输入流 (读数据)
        2).输出流 (写数据)

## 2. 往文件中写数据
    <1>.构造方法:
 		FileWriter(String filename): 传递一个文件名称

    <2>.成员方法:
 		void write(String str): 写数据(字符串)
 		void flush(): 刷新数据
		void close(): 释放资源

    <3>.输出流写数据的步骤:
 		1): 创建输出流对象
 		2): 调用输出流对象的写数据的方法
 		3): 释放资源

    <4>.举例:
        import java.io.FileWriter;
        import java.io.IOException;

        public class FileWriterDemo {
            public static void main(String[] args) throws IOException {
                // 创建输出流对象
                FileWriter fw = new FileWriter("d:\\a.txt"); // 输出的文件
                /*
                * 创建输出流对象做了哪些事情：
                * 		A： 调用系统资源，创建了一个文件
                * 		B： 创建输出流对象
                * 		C： 把输出流对象指向文件
                */
                
                // 写一个字符串
                fw.write("IO流,你好");
                
                // 数据没有直接写到文件，其实是写到了内测缓冲区
                fw.flush();
                
                // 释放资源
                // 通知系统释放和该文件相关的资源
                fw.close();
            }
        }

    <5>.FileWriter写数据的方法
        1). void write(String str): 写一个字符串数据
                举例:
		            fw.write("abcde"); // 输出: 'abcde'

        2). void write(String str,int index,int len): 写一个字符串中的一部分数据
                举例:
		            fw.write("abcde",0,5); // 输出: 'abcde'
		            fw.write("abcde",1,3); // 输出： 'bcd'

        3). void write(int ch)： 写一个数据，这里写int类型的好处是既可以写char类型的数据，也可以写char对应的int类型的值。'a',97
                举例:
                    fw.write('a');
		            fw.write(98); // 输出"ab"

        4). void write(char[] chs): 写一个字符数组数据
                举例:
                    char[] chs = {'a','b','c','d','e'};
			        fw.write(chs); // 输出"abcde"

        5). void write(char[] chs,int index,int len): 写一个字符数组的一部分数据
                举例:
                    char[] chs = {'a','b','c','d','e'};
                    fw.write(chs,0,3); // 输出"abc"

        6). 详细代码请看: day10/code/FileWriterDemo3.java

## 3.数据的换行和追加
        <1>. 如何实现数据的换行?
                \n可以实现换行，但是windows系统自带的记事本打开并没有换行，这是为什么呢？因为windows识别的换行不是\n,而是\r\n
                    windows: \r\n
                    linux:  \n
                    mac: \r	

        <2>. 如何实现数据的追加写入?
 		        FileWriter(String fileName, boolean append)

        <3>. 举例:
                import java.io.FileWriter;
                import java.io.IOException;

                public class FileWriterDemo4 {
                    public static void main(String[] args) throws IOException {
                        // 创建输出流对象
                        // FileWriter fw = new FileWriter("c.txt");
                        
                        FileWriter fw = new FileWriter("c.txt", true);
                        
                        for (int x = 0; x < 10; x++) {
                            fw.write("hello" + x);
                            fw.write("\n"); // 换行
                        }
                        // 释放资源
                        fw.close();
                    }
                }

## 4.输出流的注意问题
        <1>. 相对路径和绝对路径的区别:
                1).相对路径: 相对当前项目而言的，在项目的根目录下(a.txt);
                2).绝对路径: 以盘符开始的路径(d:\\a.txt);
        
        <2>. close()和flush()的区别:
                1). flush()： 刷新缓冲区。流对象还可以使用
                2). close(): 先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用

        <3>. 举例:
                import java.io.FileWriter;
                import java.io.IOException;

                public class FileWriterDemo2 {
                    public static void main(String[] args) throws IOException {
                        // 创建输出流对象
                //		FileWriter fw = new FileWriter("d:\\b.txt"); // 绝对路径
                        FileWriter fw = new FileWriter("b.txt"); // 相对路径
                        // 调用输出流对象的写数据方法，并刷新缓冲区
                        fw.write("welloworld");
                        fw.flush();
                        
                        fw.write("java");
                        fw.flush(); // 输出 welloworldjava
                        
                        // 释放资源
                        fw.close();
                        
                        // Stream closed
                //		fw.write("java"); 报错
                //		fw.flush();
                    }
                }

## 5. 输入流读取数据
        <1>. 构造方法:
                FileReader(String filename): 传递文件名称

        <2>. 成员方法:
                int read();
                int read(char[] abuf);

        <3>. 输入流读取文件的步骤:
                1):  创建输入流对象
                2)： 调用输入流对象的读取数据方法
                3)： 释放资源

        <4>. 举例:
                import java.io.FileNotFoundException;
                import java.io.FileReader;
                import java.io.IOException;

                public class FileReaderDemo {
                    public static void main(String[] args) throws IOException {
                        // 创建输入流对象
                //		FileReader fr = new FileReader("fr.txt");
                        FileReader fr = new FileReader("FileWriterDemo1.java");
                        
                        // 调用输入流对象的读取数据方法
                        // int read()： 一次读取一个字符
                        
                        /*
                        // 第一次读数据
                        int ch = fr.read();
                        System.out.println(ch); // 输出: 97(a=>97)
                        System.out.println((char)ch); //输出: a 
                        
                        // 第二次读数据
                        ch = fr.read();
                        System.out.println(ch); // 输出: 98(b=>98)
                        System.out.println((char)ch); //输出: b 
                        
                        // 第三次读数据
                        ch = fr.read();
                        System.out.println(ch); // 输出: 99(b=>99)
                        System.out.println((char)ch); //输出: c
                        
                        // 这个时候，我们发现代码的重复度很高，想用循环改进，但是不知道循环的结束条件是什么
                        ch = fr.read();
                        System.out.println(ch); // 输出: -1
                        
                        ch = fr.read();
                        System.out.println(ch); // 输出: -1
                        
                        // 通过测试，我们知道，如果读取数据的返回值是-1的时候，就说明没有数据了，就也是循环的结束条件
                        */
                        
                        /*
                        for(int ch;(ch=fr.read())!=-1;){ // 用for循环
                            System.out.println(ch); // 输出： 97 98 99
                            System.out.println((char)ch); // 输出 a b c
                        }
                        */
                        int ch;
                        while((ch=fr.read())!=-1){
                            // System.out.println(ch); // 输出： 97 98 99
                //			System.out.println((char)ch); // 输出 a b c 这个会换行
                            System.out.print((char)ch); // 输出abc 不会换行(推荐)
                        }
                        
                        // 释放资源
                        fr.close();	
                    }
                }
        
        <5>.练习： 
                {1}.把项目路径下的FileWriterDemo.java中的内容复制到项目路径下的Copy.java中
                        数据源:
                                FileReaderDemo.java --读数据-- FileReader
                        目的地:
                                Copy.java --写数据-- FileWriter

                    详细代码如下:
                        public class CopyFileDemo {
                            public static void main(String[] args) throws IOException {
                                FileReader fr = new FileReader("FileWriterDemo1.java");
                                FileWriter fw = new FileWriter("Copy.java");
                                
                                int ch;
                                while((ch=fr.read())!=-1){
                                    System.out.print((char)ch);
                                    fw.write(ch);
                                }
                                
                                fr.close();
                                fw.close();
                            }
                        }

        <6>.使用int read(char[] cubf)
                <1>.代码如下:
                        public class FileReaderDemo2 {
                            public static void main(String[] args) throws IOException {
                                // 创建输入流对象
                        //		FileReader fr = new FileReader("fr2.txt");	
                                FileReader fr = new FileReader("FileWriterDemo1.java");	
                                
                                char[] chs = new char[5]; // 这里可以是1024及其整数倍
                                int len;
                                while((len=fr.read(chs))!=-1){
                                    System.out.print(new String(chs,0,len));
                                }
                                fr.close();
                            }
                        }


## 6.BufferedWriter和BufferedReader字符缓冲流
        <1>.BufferedWriter: 
                将文本写入字符输出流，缓冲各种字符，从而提供单个字符、数组和字符串的高效写入

        <2>.BufferedReader: 
                将文本输入流中读取文本，缓冲各种字符，从而提供单个字符、数组和字符串的高效读取

        <3>.举例:
                public class BufferStreamDemo {
                    public static void main(String[] args) throws IOException {
                        // 创建输出缓冲流对象
                        
                        /*
                        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
                        bw.write("hello");
                        // 释放资源
                        bw.close();
                        */
                        
                        // 创建输入流缓冲对象
                        BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo1.java"));
                        
                        // 一次读取一个字符
                //		int ch;
                //		while((ch=br.read())!=-1){
                //			System.out.print((char)ch);
                //		}
                        
                        // 一次读取一个字符数组
                        char[] chs = new char[1024];
                        int ch;
                        while((ch=br.read(chs))!=-1){
                            System.out.print(new String(chs,0,ch));
                        }
                        // 释放资源
                        br.close();
                    }
                }

        <4>.练习：
                {1}.使用字符缓冲流把项目路径下的FileWriterDemo.java中的内容复制到项目路径下的Copy.java中
                
                {2}.详细代码如下:
                        public class BufferedWriterDemo {
                            public static void main(String[] args) throws IOException {
                                BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo1.java"));
                                BufferedWriter bw = new BufferedWriter(new FileWriter("Copy1.java"));

                                // 方法一
                                // int ch;
                                // while((ch=br.read())!=-1){
                                // System.out.print((char)ch);
                                // bw.write(ch);
                                // }

                                // 方法二
                                char[] arc = new char[1024];
                                int ch;
                                while ((ch = br.read(arc)) != -1) {
                                    System.out.print(new String(arc, 0, ch));
                                    bw.write(new String(arc, 0, ch));
                                }

                                br.close();
                                bw.close();
                            }
                        }

## 7.字符缓冲流的特殊功能
        <1>. BufferedWriter
        		void newLine(): 写一个换行符，这个换行符由系统决定

        <2>.BufferedReader
         		String readLine(): 一次读取一行数据,但是不读取换行符

        <3>.举例:
                public class BufferedStreamDemo2 {
                    public static void main(String[] args) throws IOException {

                        <!-- BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
                        for(int x=0;x<10;x++){
                            bw.write("hello" + x);
                //			bw.write("\r\n"); // 换行
                            bw.newLine(); // 换行
                            bw.flush();
                        }
                        bw.close(); -->

                        // 读取
                        BufferedReader br = new BufferedReader(new FileReader("br.txt"));
                        String line;
                        while((line=br.readLine())!=null){
                            System.out.println(line);
                            bw.write(line);
                            bw.newLine();
                        }
                        
                        br.close();
                        bw.close();
                    }
                }

## 8. IO流的练习
        <1>.复制文本文件(5种方式) 
                FileWriterDemo.java  => Copy.java
            
            {1}.具体代码参考:
                    day10/code/练习/BufferedStreamTest.java

        <2>.把ArrayList集合中的字符串数据存储到文本文件中，每一个字符串元素作为文件中的一部分
                helloworldjava =>array.txt

            {1}.具体代码参考:
                    day10/code/练习/BufferedStreamTest2.java

        <3>.从文本文件中读取数据到ArrayList集合中，并遍历集合。每一行数据作为一个字符串元素
                array.txt => arrayList

            {1}.具体代码参考: 
                    day10/code/练习/BufferedStreamTest3.java

        <4>.键盘录入3个学生信息(学号，姓名，年龄，居住地)存入集合。然后遍历集合把每一个学生信息存入文本文件(每一个学生信息为一行数据，自己定义分割标记)
            {1}.分析:
                A: 定义学生类
                B: 创建集合对象
                C: 写方法实现键盘录入学生信息，并把学生对象作为元素添加到集合
                D: 创建输出缓冲流对象
                E: 遍历集合，得到每一个学生信息，并把学生信息按照一定的格式写入文本文件
                    举例: heima001,向问天，30，北京

            {2}.具体代码参考:
                    day10/code/练习/键盘录入并存入文件

        <5>. 把上一题的文本文件中的学生信息读取出来并存储到集合中，然后遍历集合，在控制台输出
            {1}.分析:
                A： 定义学生类
                B： 创建输入流对象
                C： 创建集合对象
                D: 读取文件数据，并把数据按照一定的格式进行分割赋值给学生对象，然后把学生对象作为元素存储到集合
                        heima001,向问天,30,北京
                E: 释放资源
                F: 遍历集合

            {2}.具体代码参考:
                    day10/code/练习/读取文件并存入集合
