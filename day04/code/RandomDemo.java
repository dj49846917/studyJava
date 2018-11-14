package com.itheima;

import java.util.Random;
/*
 * Random是用于产生随机数的
 * 
 * 使用步骤:
 * 		A：导包
 * 			import java.util.Random;
 * 		B: 创建对象
 * 			Random r = new Random();
 * 		C: 获取随机数
 * 			int number = r.nextInt();
 * 			获取数据的范围: [0,10),包括0，不包括10
 */

public class RandomDemo {
	public static void main(String[] args) {
		// 创建对象
		Random r = new Random();
		// 获取随机数(0-10)
		// int number = r.nextInt(10);
		// System.out.println(number);

		for (int x = 1; x < 10; x++) {
			int a = r.nextInt(100);
			System.out.println(a);
		}
	}
}
