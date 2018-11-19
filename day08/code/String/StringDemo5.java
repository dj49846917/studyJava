package com.itheima_05;
/*
 * String类的转换功能:
 * 		char[] toCharArray(): 把字符串转换为字符数组
 * 		String toLowerCase(): 把字符串转换为小写字符串
 * 		String toUpperCase(): 把字符串转换为大写字符串
 */
public class StringDemo {
	public static void main(String[] args) {
		String arr = "HelloWorld";
		char[] a = arr.toCharArray();
		
		//char[] toCharArray(): 把字符串转换为字符数组
		System.out.println(a); 
		
		// String toLowerCase(): 把字符串转换为小写字符串
		String b = arr.toLowerCase(); // 输出: "helloworld"
		System.out.println(b);
		
		// String toUpperCase(): 把字符串转换为大写字符串
		String c = arr.toUpperCase();
		System.out.println(c); // 输出： "HELLOWORLD"
	}
}
