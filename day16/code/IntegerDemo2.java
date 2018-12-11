package com.itheima;
/*
 * JDK1.5特性: 自动装箱和拆箱
 * 
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		// Integer i = new Integer(10);
		
		// 自动装箱
		// 相当于: Integer i = new Integer(10);
		Integer i = 10;
		
		//自动拆箱
		// 相当于: int i = 
		Integer j = 20;
		int k = j;
	}
}
