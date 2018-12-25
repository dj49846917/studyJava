package com.itheima;

/*
 * 如何处理多个异常：
 * 		可以使用多个try...catch语句
 * 		使用一个try和多个catch
 * 
 * 多个catch之间的顺序:
 * 		多个catch之间可以有子父类
 * 		同级之间没有顺序关系
 * 
 */
public class ExceptionDemo3 {
	public static void main(String[] args) {
//		method();
		
		// 类似if和else
		method2();
	}

	private static void method2() {
		try {
//			String s = null;
//			System.out.println(s.length()); // 报错	输出: 出现空指针了
			
//			int[] arr = new int[5];
//			System.out.println(arr[8]); // 报错  	输出: 数组越界
			
			System.out.println(2 / 0); // 报错	输出: 操作异常
		} catch (NullPointerException e) {
			System.out.println("出现空指针了");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界");
		} catch (Exception e) {
			System.out.println("操作异常");
		}
	}

	private static void method() {
		try {
			String s = null;
			System.out.println(s.length()); // 报错
		} catch (NullPointerException e) {
			System.out.println("出现空指针了");
		}

		try {
			int[] arr = new int[5];
			System.out.println(arr[8]); // 报错
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界");
		}
	}
}
