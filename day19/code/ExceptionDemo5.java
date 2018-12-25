package com.itheima;

import java.io.FileWriter;
import java.io.IOException;

/*
 * finally: 组合try...catch使用，用于释放资源等收尾工作，无论try...catch语句如何执行，finally的代码一定会执行
 * 
 * 
 * try{
 * 		有可能出问题的代码
 * } catch (异常对象) {
 * 		处理异常
 * } finally {
 * 		释放资源;
 * 		清理资源
 * }
 * 
 */
public class ExceptionDemo5 {
	public static void main(String[] args) {
//		method();
		FileWriter fw = null;
		try {
			System.out.println(2 / 0); // 写到这里报错空指针因为没有new对象
			fw = new FileWriter("a.txt");
			fw.write("hello");
			fw.write("world");
			System.out.println(2 / 0);
			fw.write("java");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			// 释放资源
			try {
				if(fw != null){
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void method() {
		try {
			System.out.println(2 / 0);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		} finally {
			System.out.println("清理垃圾");
		}
	}
}
