package com.itheima_09;
import java.util.Scanner;
/*
 * 需求: 键盘录入一个数据，并实现反转
 */
public class StringBuilderTest2 {
	public static void main(String[] args) {
		// 键盘录入一个数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数据");
		String s = sc.nextLine();
		// StringBuilder ==>String
		StringBuilder ss = new StringBuilder(s);
		// 数据反转
		StringBuilder result = ss.reverse();
		// string ==>stringBuilder
		String res = result.toString();
		System.out.println(res);
	}
}
