package com.itheima_02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 需求: 从文件中读取数据并显示在控制台
 * 			读数据--输入流--FileReader
 * 
 * 构造方法:
 * 		FileReader(String filename): 传递文件名称
 * 
 * 成员方法:
 * 		int read();
 * 		int read(char[] abuf);
 * 
 * 输入流读取文件的步骤:
 * 		A: 创建输入流对象
 * 		B： 调用输入流对象的读取数据方法
 * 		C： 释放资源
 * 
 * java.io.FileNotFoundException: fr.txt (系统找不到指定的文件。)
 */
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
			System.out.print((char)ch); // 输出abc 不会换行
		}
		
		// 释放资源
		fr.close();
		
	}
}
