package com.itheima_04;
/*
 * String类的获取功能:
 * 		int length(): 获取字符串的长度，其实也就是字符个数
 * 		char charAt(int index): 获取指定索引处的字符
 * 		int indexOf(String str): 获取str在字符串对象中第一次出现的索引
 * 		String substring(int start): 从start开始截取字符串
 * 		String substring(int start, int end): 从start开始,到end结束截取字符串。包括start,不包括end
 */
public class StringDemo {
	public static void main(String[] args) {
		String arr = "helloworld";
		
		// int length(): 获取字符串的长度，其实也就是字符个数
		System.out.println(arr.length()); // 输出10
		System.out.println("-------");
		
		// char charAt(int index): 获取指定索引处的字符
		System.out.println(arr.charAt(5)); // 输出 "w"
		System.out.println("-------");
		
		// int indexOf(String str): 获取str在字符串对象中第一次出现的索引
		System.out.println(arr.indexOf("l")); // 输出 2
		System.out.println(arr.indexOf("ak")); // 输出 -1
		System.out.println("-------");
		
		// String substring(int start): 从start开始截取字符串
		System.out.println(arr.substring(3)); // 输出"loworld"
		System.out.println("-------");
		
		// String substring(int start, int end): 从start开始,到end结束截取字符串。包括start,不包括end
		System.out.println(arr.substring(5, arr.length())); // 输出"world"
	}
}
