package com.itheima_09;
import java.util.Scanner;
/*
 * 需求: 键盘录入一个字符串，并判断是否为对称字符串
 * 
 * 分析:
 * 		A: 键盘录入一个字符串
 * 		B: 写方法实现一个字符串是否为对称字符串
 * 				把字符串反转，和反转前的字符串进行比较，如果内容相同，就说明是对称字符串
 * 		C: 调用方法
 * 		D: 输出结果
 */
public class StringBuilderTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数据");
		String s = sc.nextLine();
		reverseData(s);
	}
	
//	public static void reverseData(String s){ // 错误案例
//		StringBuilder data = new StringBuilder(s);
//		StringBuilder result = data.reverse();
//		System.out.println("result:" + result);
//		if(data == result){
//			System.out.println("是对称字符串");
//		}else{
//			System.out.println("不是对称字符串");
//		}
//		
//	}
	
	public static void reverseData(String s){
		StringBuilder data = new StringBuilder(s);
		String res = data.reverse().toString();
		boolean result = res.equals(s);
		if(result){
			System.out.println("是对称字符串");
		}else{
			System.out.println("不是对称字符串");
		}
	}
}
