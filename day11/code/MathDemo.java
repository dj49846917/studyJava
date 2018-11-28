package com.itheima_02;

public class MathDemo {
	public static void main(String[] args) {
		// Math: 包含了一些基本的数学运算方法
		
		// static double ceil(double a) 天花板
		System.out.println(Math.ceil(1.6)); // 输出: 2.0
		
		// static double floor(double a) 地板
		System.out.println(Math.floor(1.6)); // 输出: 1.0
		
		// static double random(double a) 随机数 0-1之间
		System.out.println(Math.random()); // 输出: 0.9536876090577943
		
		// static double round(double a)  四舍五入
		System.out.println(Math.round(1.2)); // 输出: 1
		System.out.println(Math.round(1.6)); // 输出: 2
		
		// static double max(double a,double b) 输出最大值
		System.out.println(Math.max(1.2, 4.2)); // 输出: 4.2
	}
}
