package com.itheima_04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedWriter: 将文本写入字符输出流，缓冲各种字符，从而提供单个字符、数组和字符串的高效写入
 * BufferedReader: 将文本输入流中读取文本，缓冲各种字符，从而提供单个字符、数组和字符串的高效读取
 */
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
