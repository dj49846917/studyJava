package com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter写数据的方法
 * 
 * void write(String str): 写一个字符串数据
 * void write(String str,int index,int len): 写一个字符串中的一部分数据
 * void write(int ch)： 写一个数据，这里写int类型的好处是既可以写char类型的数据，也可以写char对应的int类型的值。'a',97
 * void write(char[] chs): 写一个字符数组数据
 * void write(char[] chs,int index,int len): 写一个字符数组的一部分数据
 */
public class FileWriterDemo3 {
	public static void main(String[] args) throws IOException {
		// 创建输出流对象
		FileWriter fw = new FileWriter("b.txt");
		
		// void write(String str): 写一个字符串数据
		// fw.write("abcde"); // 输出: 'abcde'
		
		// void write(String str,int index,int len): 写一个字符串中的一部分数据
		// fw.write("abcde",0,5); // 输出: 'abcde'
		// fw.write("abcde",1,3); // 输出： 'bcd'
		
		// void write(int ch)： 写一个数据，这里写int类型的好处是既可以写char类型的数据，也可以写char对应的int类型的值。'a',97
		// fw.write('a');
		// fw.write(98); // 输出"ab"
		
		// void write(char[] chs): 写一个字符数组数据
			 char[] chs = {'a','b','c','d','e'};
			// fw.write(chs); // 输出"abcde"
		
		// void write(char[] chs,int index,int len): 写一个字符数组的一部分数据
			fw.write(chs,0,3); // 输出"abc"
		
		// 释放资源
		fw.close();
	}
}
