
package com.itheima;
/*
 * 方法重载:
 * 		在同一类中，出现了方法名相同的情况
 * 
 * 特点：
 * 		方法名相同，参数列表不同,与返回值无关。
 * 			A：参数的个数不同
 * 			B：参数对应的数据类型不同
 * 			C：不能出现参数个数相同，参数对应的数据类型也一样，会报错
 * 注意:
 * 		在调用方法的时候，java虚拟机会通过参数列表的不同来区分同名的方法
 */
public class MethodDemo2 {
	public static void main(String[] args) {
		// 定义变量
		int a = 10;
		int b = 20;
		int c = 30;
		
		// 求和方法
		int result2 = sum(a,b,c);
		System.out.println(result2);
	}
	
//	// 参数个数相同，数据类型不同
//	public static float sum(float a, float b){
//		return a + b;
//	}
	
	// 三个数据的求和
	public static int sum(int a, int b, int c){
		return a + b + c;
	}
	
	// 两个数据的求和
	public static int sum(int a, int b){
		return a + b;
	}
}
