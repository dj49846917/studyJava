package com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 输出流写数据的步骤；
 * 		A: 创建输出流对象
 * 		B: 调用输出流对象的写数据方法，并刷新缓冲区
 * 		C: 释放资源
 * 
 * 相对路径:相对当前项目而言的，在项目的根目录下(a.txt);
 * 绝对路径:以盘符开始的路径(d:\\a.txt);
 * 
 * close()和flush()的区别:
 * 		flush()： 刷新缓冲区。流对象还可以使用
 * 		close(): 先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用
 */
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
