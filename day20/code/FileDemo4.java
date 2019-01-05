package com.itheima;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 	获取功能:
 * 		File getAbsoluteFile(): 以file对象的形式返回当前file对象所有指向的绝对路径
 * 		String getAbsolutePath(): 返回file对象所指向的绝对路径
 * 		String getParent(): 获取file对象的父路径
 * 		File getParentFile(): 以对象的形式获取file对象的父路径
 *  	String getName(): 获取文件或文件夹的名称
 * 		String getPath(): 获取创建File对象时给的路径
 * 		long lastModified(): 以毫秒值的形式返回最后修改时间
 * 		long length(): 返回文件的字节数		
 * 
 * 	修改功能:
 * 		boolean renameTo(File dest)
 * 
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
//		method();
		
//		method2();
		
//		method3();
		
//		method4();
		
//		method5();
		
//		method6();
		
//		method7();
	}

	private static void method7() {
		// boolean renameTo(File dest): 将当前file对象所指向的路径修改为指定file对象所指向的路径
		// 修改的路径不能存在，存在则不能修改
		File f10 = new File("a.txt");
		File f11 = new File("d.txt");
		System.out.println(f10.renameTo(f11)); // 输出: true
	}

	private static void method6() {
		// long length(): 返回文件的字节数
		File f8 = new File("b\\c.txt");
		File f9 = new File("b");
		System.out.println(f8.length()); // 输出: 5
		System.out.println(f9.length()); // 输出: 0
	}

	private static void method5() throws IOException {
		// long lastModified(): 以毫秒值的形式返回最后修改时间
		File f7 = new File("a.txt");
		f7.createNewFile();
		System.out.println(f7.lastModified()); // 输出: 1546653657941
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		Date d = new Date(f7.lastModified());
		System.out.println(sdf.format(d)); // 输出: 19-01-05 10:00:57
	}

	private static void method4() {
		// String getName(): 获取文件或文件夹的名称
		File f4 = new File("a.txt");
		File f5 = new File("d:\\a\\b.txt");
		File f6 = new File("b");
//		System.out.println(f4.getName()); // 输出：a.txt
//		System.out.println(f5.getName()); // 输出: b.txt
//		System.out.println(f6.getName()); // 输出: b
		
		// String getPath(): 获取创建File对象时给的路径
		System.out.println(f4.getPath()); // 输出: a.txt
		System.out.println(f5.getPath()); // 输出: d:\a\b.txt
		System.out.println(f6.getPath()); // 输出: b
	}

	private static void method3() throws IOException {
		File parent = new File("b");
		File f3 = new File(parent,"c.txt");
		if(!parent.exists()){
			parent.mkdirs();
		}
		System.out.println(f3.createNewFile());
		// String getParent(): 获取file对象的父路径
		System.out.println(f3.getParent()); // 返回字符串
		
		// File getParentFile(): 以对象的形式获取file对象的父路径
		System.out.println(f3.getParentFile()); // 返回对象
	}

	private static void method2() {
		// String getAbsolutePath(): 返回file对象所指向的绝对路径
		File f2 = new File("d:\\a\\b.txt");
		System.out.println(f2.getAbsolutePath()); // 返回的是字符串
	}

	private static void method() {
		// File getAbsoluteFile(): 以file对象的形式返回当前file对象所有指向的绝对路径
		File f = new File("d:\\a\\b.txt");
		System.out.println(f.getAbsoluteFile()); // 返回的是file对象
	}
}
