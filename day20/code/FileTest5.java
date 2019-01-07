package com.itheima_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 使用字节流复制文本文件
 * 
 * 数据源	a.txt
 * 目的地 	d:\\a.txt
 * 
 */
public class FileTest5 {
	public static void main(String[] args) throws IOException {
		// 创建字节输入流对象
		FileInputStream fis = new FileInputStream("a.txt");
		// 创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("d:\\a.txt");

		// 一次读写一个字节
		int len;
		while ((len = fis.read()) != -1) {
			fos.write(len);
		}

		// 一次读写一个字节数组
		int by;
		byte[] bys = new byte[1024];
		while ((by = fis.read(bys)) != -1) {
			fos.write(bys, 0, by);
		}

		fis.close();
		fos.close();
	}
}
