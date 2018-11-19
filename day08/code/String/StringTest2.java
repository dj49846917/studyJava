package com.itheima_04;

/*
 * 遍历字符串(获取每个字符)
 */
public class StringTest {
	public static void main(String[] args) {
		String arr = "helloworld";
		for (int x = 0; x < arr.length(); x++) {
			System.out.println(arr.charAt(x));
		}
	}
}
