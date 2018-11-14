package com.itheima5;

/*
 * 遍历二维数组，打印每一个值
 */
public class ArrDemo2 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int x = 0; x < arr.length; x++) {
			System.out.println("第一级:" + arr[x]);
			for (int y = 0; y < arr[x].length; y++) {
				System.out.println("第二级:" + arr[x][y]);
			}
		}
	}
}
