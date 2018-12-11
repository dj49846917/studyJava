package com.itheima;
/*
 * 需求： 判断一个数是否符合int类型的范围
 * 由于基本数据类型只能做一些简单的操作和运算，所以Java给我们封装了基本数据类型，为每种数据类型提供了包装类
 * 包装类就是封装了基本数据类型的类，为我们提供了更多复杂的方法和一些变量
 * 
 * byte			Byte
 * short		Short
 * int			Integer
 * long			Long
 * float		Float
 * double		Double
 * char			Character
 * boolean		Boolean
 * 
 * Integer:
 * 		String => int
 * 			方法1： int intValue()
 * 			
 * 			方法2: static int parseInt(String s)
 * 	
 * 		int => String
 * 			方法1: + ""
 * 			
 * 			方法2: String toString()
 * 
 * 构造方法:
 * 		Integer(int value)
 * 		Integer(String s)
 * 
 */
public class IntegerDemo {
	public static void main(String[] args) {
		// 字符串转换为数字：
		 
		// 方法1： Integer(int value)
		Integer i = new Integer("10"); // 将字符串转换为数字
		System.out.println(i);
		
		
		// 方法2： int intValue()
		int b = i.intValue();
		System.out.println(i+b); // 输出：20
		
		// 方法3： static int parseInt(String s)
		int k = Integer.parseInt("40");
		System.out.println(k); // 输出: 40
		
		//--------------------------------
		// 数字转换为字符串:
		
		// 方法1： Integer(int value)
		Integer i2 = new Integer(60);
		System.out.println(i2.toString()); // 输出: "60"
		
		// 方法2: Static String toString(int i)
		String ss = Integer.toString(70);
		System.out.println(ss); // 输出: "70"
	}
}
