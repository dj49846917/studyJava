package com.itheima_08;
/*
 * StringBuilder和String的相互转化
 * 
 * StringBuilder ==>String
 * 		public String toString(): toString()将StringBuilder转化为String
 * 
 * String ==> StringBuilder
 * 		StringBuilder(String str): 用过构造方法就可以实现把String转化为StringBuilder
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		
		// StringBuilder 转化为 String
		StringBuilder sb = new StringBuilder();
		sb.append("hello").append("world");
		System.out.println("sb:" + sb); // 输出"sb:helloworld"
		String s = sb.toString();
		System.out.println("s:" +s); // 输出"s:helloworld"
		
		// String 转化为 StringBuilder
		String arr = "好好学习";
		StringBuilder ar = new StringBuilder(arr);
		System.out.println("ar:"+ar); // 输出 "ar: 好好学习"
	}
}
