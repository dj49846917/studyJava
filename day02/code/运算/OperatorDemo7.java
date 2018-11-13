// package com.itheima_05;

/*
 * 三元运算符:
 * 		关系表达式? 表达式1 ： 表达式2
 * 
 * 执行流程:
 * 		A: 计算关系表达式的值,看是true还是false
 * 		B：如果是true,表达式1就是结果
 * 		      如果是false,表达式2就是结果
 */
public class OperatorDemo {
	public static void main(String[] args) {
		// 定义变量
		int a = 10;
		int b = 20;

		int c = (a > b) ? a : b;
		System.out.println("c:" + c);
	}
}
