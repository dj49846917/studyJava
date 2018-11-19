package com.itheima_02;
/*
 * String类: 字符串类
 * 		由多个字符串组成的遗传数据
 * 
 * 构造方法：
 * 		String(String original):把字符串数据封装成字符串对象
 * 		String(char[] value):把字符数组的数据封装成字符串对象
 * 		String(char[] value, int index, int count):把字符数组中的一部分数据封装成字符串对象
 * 
 * 注意：字符串是一种比较特殊的引用数据类型，直接输出字符串对象输出的是该对象中的数据。
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		// 方法1：
		// String(String original):把字符串数据封装成字符串对象
		String s1 = new String("hello");
		System.out.println(s1); // 输出 "hello"
		System.out.println("-------------");
		
		// 方法2
		// String(char[] value):把字符数组的数据封装成字符串对象
		char[] arr = {'h','e','l','l','o'};
		String s2 = new String(arr);
		System.out.println(s2); // 输出"hello"
		System.out.println("-------------");
		
		// 方法3
		// String(char[] value, int index, int count):把字符数组中的一部分数据封装成字符串对象
		String s3 = new String(arr, 1,3);
		System.out.println(s3); // 输出"ell"
		System.out.println("-------------");
		
		// 方法4
		String s4 = "hello";
		System.out.println(s4); // 输出"hello"
	}
}
