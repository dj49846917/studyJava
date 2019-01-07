package com.itheima_02;

import java.io.File;

/*
 * 需求: 输出指定目录下的所有java文件名(包含子目录)
 * 
 */
public class FileTest {
	public static void main(String[] args) {
//		File f = new File("src\\com\\itheima");
		// File f = new File("src\\com\\itheima\\FileDemo.java"); // 用这个会报错
//		 method2(f);
		File f2 = new File("src");
		method(f2);
	}
	
	public static void method(File file) {
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File item : files) {
				// 判断是否是文件
				if (item.isFile()) {
					// 判断是否是Java文件
					if (item.getName().endsWith(".java")) {
						System.out.println(item.getName());
					}
				}else{
					// 是一个目录对象
					method(item);
				}
			}
		}
	}

	// 输出指定目录下的所有java文件名(不包含子目录)
	public static void method2(File file) {
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File item : files) {
				// 判断是否是文件
				if (item.isFile()) {
					// 判断是否是Java文件
					if (item.getName().endsWith(".java")) {
						System.out.println(item.getName());
					}
				}
			}
		}
	}
}
