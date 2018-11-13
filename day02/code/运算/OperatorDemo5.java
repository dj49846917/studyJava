package com.itheima_03;
/*
 * 关系运算符:
 * 		==, !=, >, >=, <=
 * 		关系运算符的结果是boolean类型的
 */
public class OperatorDemo {
	public static void main(String[] args) {
		// 定义变量
		int a = 10;
		int b = 20;
		int c = 10;
		
		// ==
		System.out.println(a == b); // 输出false
		System.out.println(a == c); // 输出true
		
		// 注意:
		System.out.println(a = b); // 把b的值赋给a,然后输出a的值 // 输出30
	}
}
