package com.itheima_03;
/*
 * String的判断功能:
 * 		boolean equals(Object obj): 比较字符串的内容是否相同
 * 		boolean equalsIgnoreCase(String: str): 比较字符串的内容是否相同，忽略大小写
 * 		boolean startsWith(String str): 判断字符串对象是否为指定str开头
 * 		boolean endsWith(String str): 判断字符串对象是否为指定的str结尾
 */
public class StringDemo3 {
	public static void main(String[] args) {
		String str = "hello,world";
		String s1 = "hello,world";
		String s2 = "Hello,World";
		String s3 = "hel";
		String s4 = "old";
		System.out.println(str.equals(s1));
		System.out.println(str.equalsIgnoreCase(s2));
		System.out.println(str.startsWith(s3));
		System.out.println(str.endsWith(s4));
	}
}
