package com.itheima;

import java.io.File;
import java.io.IOException;

/*
 * 	判断功能:
 * 		boolean exits(): 判断文件或者文件夹是否存在，如果存在，返回true,否则返回false
 * 		boolean isAbsolute(): 判断File对象指向的路径是否是绝对路径，如果是则返回true,否则返回false
 * 		boolean isDirectory(): 判断File对象指向的路径是否是文件夹，如果是则返回true,否则返回false
 * 		boolean isFile(): 判断File对象指向的路径是否是文件，如果是则返回true,否则返回false
 * 
 */
public class FileDemo3 {
	public static void main(String[] args) throws IOException {
		// method();
		
		// method2();
		
		// method3();
		
		 method4();
	}

	private static void method4() {
		File f = new File("a.txt");
		File f2 = new File("c");
		// boolean isFile(): 判断File对象指向的路径是否是文件，如果是则返回true,否则返回false
		System.out.println(f.isFile()); // 输出: true
		System.out.println(f2.isFile()); // 输出： false
	}

	private static void method3() {
		File f = new File("a.txt");
		File f2 = new File("c");
		
		// boolean isDirectory(): 判断File对象指向的路径是否是文件夹，如果是则返回true,否则返回false
		System.out.println(f.isDirectory()); // 输出: false
		System.out.println(f2.isDirectory()); // 输出: true
	}

	private static void method2() {
		// boolean isAbsolute(): 判断File对象指向的路径是否是绝对路径，如果是则返回true,否则返回false
		File f = new File("a.txt");
		System.out.println(f.isAbsolute()); // 返回:false
		
		File f2 = new File("E:\\a\b.txt");
		System.out.println(f2.isAbsolute()); // 返回: true
	}

	private static void method() {
		File f = new File("a.txt");
//		f.createNewFile();
		
		// boolean exits(): 判断文件或者文件夹是否存在，如果存在，返回true,否则返回false
		System.out.println(f.exists()); // 输出false
	}
}
