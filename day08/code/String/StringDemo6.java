package com.itheima_02;
/*
 * 去除字符串两端的空格
 * 		String trim()
 * 
 * 按指定符号分割字符串
 * 		String[] split(String str)
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = "  helloworld  ";
		String s3 = " hello world ";
		System.out.println("---" + s1 + "---");
		System.out.println("---" + s1.trim() + "---"); // 输出---helloworld---
		System.out.println("---" + s2 + "---");// 输出---  helloworld  ---
		System.out.println("---" + s2.trim() + "---");// 输出---helloworld---
		System.out.println("---" + s3 + "---");// 输出--- hello world --- 
		System.out.println("---" + s3.trim() + "---");// 输出---hello world---
	
		// String[] split(String str);
		String s = "aa,bb,cc";
		String[] arr = s.split(",");
		System.out.println(arr);
		for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
	}
}
