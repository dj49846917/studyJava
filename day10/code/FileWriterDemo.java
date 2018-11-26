package com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求: 往文件中写数据
 * 			写数据--输出流--FileWriter
 * 
 * 构造方法:
 * 		FileWriter(String filename): 传递一个文件名称
 * 
 * 成员方法:
 * 		void write(String str)
 * 		void flush()
 * 		void close()
 * 
 * 输出流写数据的步骤:
 * 		A: 创建输出流对象
 * 		B: 调用输出流对象的写数据的方法
 * 		C: 释放资源
 * 
 * 
 * 
 */
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
