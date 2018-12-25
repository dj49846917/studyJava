package com.itheima;

import java.io.FileWriter;

/*
 * 异常的分类:
 * 		运行时期异常: RuntimeException的子类就是运行时期异常，在编译时期可以选择处理或者不处理
 * 		编译时期异常: 在编译时期必须处理
 * 
 */
public class ExceptionDemo6 {
	public static void main(String[] args) {
		// 运行时期异常举例:
		method();
		
		// 编译时期异常举例:
//		FileWriter fw = new FileWriter("a.txt");
	}

	private static void method() {
		// 1:
		System.out.println(2 / 0);
		
		// 2:
		String s = null;
		System.out.println(s.length());
	}
}
