package com.itheima_02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 输入流读取数据的方法:
 * 		A： 创建输入流对象
 * 		B：调用对应的读取方法
 * 		C： 释放资源
 */
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
