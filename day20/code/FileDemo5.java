package com.itheima;

import java.io.File;

/*
 * String List(): 返回当前路劲下所有的文件和文件夹名称
 * File[] listFiles():以对象的形式返回当前路劲下所有的文件和文件夹名称
 * static File[] listRoots(): 以file对象的形式返回盘符
 * 
 */
public class FileDemo4 {
	public static void main(String[] args) {
		// method();
		
		// method2();
		
		// method3();
	}

	private static void method3() {
		// static File[] listRoots(): 以file对象的形式返回盘符
		File[] f = File.listRoots();
		for(File item : f){
			System.out.println(item);
		}
	}

	private static void method2() {
		// File[] listFiles():以对象的形式返回当前路劲下所有的文件和文件夹名称
		File f = new File("c");
		File f2 = new File("D:\\大前端学习资料\\01.java基础(共300集左右)\\20 IO流-高级\\20 IO流-高级\\视频\\avi");
		File f3 = new File("a.txt");
		File[] files = f2.listFiles();
		for(File item : files){
			System.out.println(item.getName());
		}
	}

	private static void method() {
		// String List(): 返回当前路劲下所有的文件和文件夹名称
		// 注意: 只有指向文件夹的File对象才可以调用该方法
		File f = new File("c");
		String[] files = f.list();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
		
		File f2 = new File("D:\\大前端学习资料\\01.java基础(共300集左右)\\20 IO流-高级\\20 IO流-高级\\视频\\avi");
		String[] File = f2.list();
		for (int i = 0; i < File.length; i++) {
			System.out.println(File[i]);
		}
	}
}
