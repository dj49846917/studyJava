package com.itheima_04;
/*
 * 逻辑运算符:用于连接关系表达式
 * 	&, |, ^, !
 * 	&&, ||
 * 	
 * &: 有false则false
 * |: 有true则true
 * ^: 相同则false，不同则true。 举例: 情侣关系。(男女)
 * !: true则false,false则true
 */
public class OperatorDemo {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		// &: 有false则false
		System.out.println((a>b)&(a>c)); // false&false =>输出false
		System.out.println((a>b)&(a<c)); // false&true =>输出false
		System.out.println((a<b)&(a>c)); // true&false =>输出false
		System.out.println((a<b)&(a<c)); // true&true =>输出true
		System.out.println("--------------------");
		
		// |: 有true则true
		System.out.println((a>b)|(a>c)); // false|false =>输出false
		System.out.println((a>b)|(a<c)); // false|true =>输出true
		System.out.println((a<b)|(a>c)); // true|false =>输出true
		System.out.println((a<b)|(a<c)); // true|true =>输出true
		System.out.println("--------------------");
		
		// ^: 相同则false，不同则true
		System.out.println((a>b)^(a>c)); // false^false =>输出false
		System.out.println((a>b)^(a<c)); // false^true =>输出true
		System.out.println((a<b)^(a>c)); // true^false =>输出true
		System.out.println((a<b)^(a<c)); // true^true =>输出false
		System.out.println("--------------------");
		
		// !: true则false,false则true
		System.out.println((a>b)); // 输出false
		System.out.println(!(a>b)); // 输出true
	}
}
