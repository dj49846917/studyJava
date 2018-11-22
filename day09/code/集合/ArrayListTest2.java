package com.itheima_02;

import java.util.ArrayList;

/*
 * 给定一个字符串数组: {"张三丰","宋远桥","张无忌","尹丽婷","张翠山","莫胜谷"},将数组中的元素添加到集合中,并把所有性张的人员打印到控制台上
 *
 * 分析:
 * 		A: 定义字符串数组
 * 		B: 创建集合对象
 * 		C: 遍历字符串数组，获取每一个字符串元素
 * 		D: 把获取到的字符串元素添加到集合
 * 		E: 遍历集合
 * 				要判断每一个字符串元素是否以"张"开头, 如果是,就输出在控制台上
 */
public class ArrayListTest2 {
	public static void main(String[] args) {
		String[] arr = {"张三丰","宋远桥","张无忌","尹丽婷","张翠山","莫胜谷"};
		ArrayList<String> array = new ArrayList<String>();
		for(int x=0;x<arr.length;x++){
			array.add(arr[x]);
			if(arr[x].startsWith("张")){
				System.out.println("有张的内容:" +arr[x]);
			}
		}
	}
}
