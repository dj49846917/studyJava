package com.itheima_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

/*
 * 分别使用字符流和字节流复制图片
 * 
 * 二进制文件只能使用字节流进行复制(使用windows自带记事本打开读不懂的)(视频，音频，图片)
 * 文本文件的复制即可以使用字符流，也可以使用字节流
 * 
 */
public class FileTest4 {
	public static void main(String[] args) throws IOException {
		method();
		
		// 创建字节输入流对象
		FileInputStream fis = new FileInputStream("预览图_千图网_编号28488963.jpg");
		// 创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("d:\\预览图_千图网_编号28488963.jpg");
		
		// 一次读写一个字节数组
		int len; // 用于存储读取的字节个数
		byte[] chs = new byte[1024];
		while((len=fis.read(chs))!=-1){
			fos.write(chs,0,len);
		}
		
		fis.close();
		fos.close();
	}

	private static void method() throws FileNotFoundException, IOException {
		// 创建字符输入流对象
		FileReader fr = new FileReader("预览图_千图网_编号28488963.jpg");
		// 创建字符输出流对象
		FileWriter fw = new FileWriter("d:\\预览图_千图网_编号28488963.jpg");
		
		// 一次读写一个字符数组
		int len; // 用于存储读取的字符个数
		char[] chs = new char[1024];
		while((len=fr.read(chs))!=-1){
			fw.write(chs,0,len);
			fw.flush();
		}
		
		fr.close();
		fw.close();
	}
}
