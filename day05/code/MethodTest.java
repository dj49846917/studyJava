package com.itheima2;
import java.util.Scanner;

/*
 * 求和
 */
public class MethodTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int[] arr = { a, b, c, d, e };
		int f = change(arr);
		System.out.println(f);
	}

	public static int change(int[] arr) {
		int sum = 0;
		for (int x = 0; x < arr.length; x++) {
			sum += arr[x];
		}
		return sum;
	}
}
