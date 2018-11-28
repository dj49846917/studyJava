package com.itheima_03;

public class MyArrays {
	private MyArrays() {}; // 私有之后就不用实例化了
	
	// 返回数组中最大的元素
	public static int getMax(int[] arr){
		// 定义一个参照物
		int max = arr[0];
		for(int x = 0; x < arr.length; x++){
			if(max<arr[x]){
				max = arr[x];
			}
		}
		return max;
	}
	
	// 获取指定元素的索引
	public static int getIndex(int[] arr, int a){
		for(int x=0;x<arr.length;x++){
			if(a == arr[x]){
				return x;
			}
		}
		return -1; // 如果查不到就返回-1
	}
}
