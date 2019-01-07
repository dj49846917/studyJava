package com.itheima_03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 使用字符流复制文本文件
 * 
 * 输入源: FileTest.java
 * 目的地: d:\\FileTest.java
 * 
 */
public class FileTest3 {
	public static void main(String[] args) throws IOException {
		// 创建字符输入流对象
		FileReader fr = new FileReader("src\\com\\itheima_02\\FileTest.java");
		// 创建字符输出流对象
		FileWriter fw = new FileWriter("d:\\FileTest.java");
		
		// 一次读写一个字符
		int ch;
		while((ch = fr.read())!=-1){
			fw.write(ch);
			fw.flush();
		}
		
		// 一次读写一个字符数组
		int len; // 用于存储读到的字符个数
		char[] chs = new char[1024];
		while((len = fr.read(chs))!=-1){
			fw.write(chs,0,len);
			fw.flush();
		}
		
		fr.close();
		fw.close();
	}
}
