package com.itheima;
/*
 * Throwable的常用方法:
 * 		String getMessage(): 原因
 * 		String toString(): 类型和原因
 * 		void printStackTrace()： 类型、原因和位置
 * 
 * 快捷键:
 * 		选中代码右键 =》 Surround with =》 try/catch block
 * 
 */
public class ExceptionDemo4 {
	public static void main(String[] args) {
//		method();
		try {
			System.out.println(2 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	private static void method() {
		try{
			System.out.println(2 / 0);
		} catch (ArithmeticException e) {
			// String getMessage(): 原因
			System.out.println(e.getMessage());
			
			// String toString(): 类型和原因
			System.out.println(e.toString());
			
			// void printStackTrace()： 类型、原因和位置
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}
