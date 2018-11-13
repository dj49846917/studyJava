package com.itheima_01;
/*
 * ++,--:自增自减，用于对变量+1或者-1
 * 
 * ++，--既可以用在变量的后面，也可以用在变量的前面
 * 
 * 单独使用的时候，++或者--放在变量的前面或者后面，结果一样
 * 参与其他操作的时候:
 * 		++在后面，先拿变量做操作，然后变量再++;
 * 		++在前面，先变量++,然后再变量做操作
 */
public class Operator4 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a：" + a); // 输出a:10
		
		// ++的演示(单独)
//		a++;
//		System.out.println("a：" + a); // 输出 a:11
		
//		++a;
//		System.out.println("a:" + a); // 输出 a: 11
		
		// (参与)
//		int b = a;
//		System.out.println("b:" + b); // 输出b: 10
		
//		int b = a++;
//		System.out.println("b:" + b); // 输出 b: 10
		
		int b = ++a;
		System.out.println("b:" + b); // 输出b: 11
	}
}
