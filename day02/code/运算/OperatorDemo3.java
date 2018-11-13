package com.itheima_01;
/*
 * +:
 * 		做加法运算
 * 
 * 字符参与加法运算，其实是拿字符在计算机存储的数据值来参与计算的
 * 		'A' 65
 * 		'a' 97
 * 		'0' 48
 * 
 * 字符串参与加法运算，实际是做字符串的拼接
 */
public class OperatorDemo3 {
	public static void main(String[] args) {
		// 定义变量
		int a = 10;
		int b = 20;
		System.out.println(a + b); // 输出30
		
		// 字符参与加法运算
		char c = 'A';
		System.out.println(a + c); // 输出75
		
		// 字符串参与加法运算
		System.out.println("hello" + a); // 输出hello10

        // 注意先后顺序
		System.out.println("hello" + a + b); // 输出hello1020
		System.out.println(a + b + "hello"); // 输出30hello
	}
}
