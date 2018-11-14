package com.itheima4;

/*
 * 数组获取最大值，最小值
 */
public class ArrTest2 {
	public static void main(String[] args) {
		int[] arr = { 1, 34, 65, 23, 67, 80 };

		// 定义参照物
		int max = arr[0];

		// 遍历数组，获取除0索引以外的元素，进行比较
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}
		// 输出max即可
		System.out.println(max);
	}
}
