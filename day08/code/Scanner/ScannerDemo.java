package com.itheima_01;
import java.util.Scanner;
/*
 * Scanner： 用于获取键盘录入的数据(基本数据类型,字符串数据);
 * 		public String nextLine();获取键盘输入的数据;
 */
public class ScannerDemo {
	public static void main(String[] args) {
		// 创建键盘输入数据
		Scanner sc = new Scanner(System.in);
		// 接收数据
		System.out.println("请输入一个数据");
		String s = sc.nextLine();
		// 输出数据
		System.out.println(s);
	}
}
