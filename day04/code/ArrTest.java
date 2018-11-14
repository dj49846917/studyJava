package com.itheima;
/*
 * 定义一个数组，打印，再赋值，再打印
 */
public class ArrTest {
	public static void main(String[] args) {
		int[] arr = new int[3];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[0] = 100;
		arr[2] = 200;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
