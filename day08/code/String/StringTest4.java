package com.itheima_01;
import java.util.Scanner;
/*
 * 键盘录入一个字符串，把该字符串的首字母转成大写，其余小写(只考虑英文大小写字母字符)
 */
public class StringDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr = sc.nextLine();
		String firstArr = arr.substring(0, 1);
		String lastArr = arr.substring(1,arr.length());
		String newArr = firstArr.toUpperCase()+lastArr;
		System.out.println(newArr);
	}
}
