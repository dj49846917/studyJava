package com.itheima;
import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个数据");
		int a = sc.nextInt();
		
		System.out.println("请输入一个数据");
		int b = sc.nextInt();
		
		boolean c = (a == b) ? true : false;
		System.out.println(c);
	}
}
