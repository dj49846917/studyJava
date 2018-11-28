package com.itheima_03;

public class MyArraysDemo {
	public static void main(String[] args) {
		int[] arr = { 10, 42, 51, 12, 52 };
		int max = MyArrays.getMax(arr);
		System.out.println("最大值:" + max);
		
		int index = MyArrays.getIndex(arr, 12);
		System.out.println("索引:" + index);
	}

}
