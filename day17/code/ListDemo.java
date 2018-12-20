package com.itheima_04;

import java.util.ArrayList;
import java.util.List;

/*
 * List:
 * 		<1>.有序的(存储和读取的顺序是一样的)
 * 		<2>.有整数序列
 * 		<3>.允许重复的
 * 
 * List的特有功能:
 * 		void add(int index, E element): 增加
 * 		E get(int index): 根据索引获取
 * 		E remove(int index)： 删除并返回指定元素
 * 		E set(int index,E element): 根据索引修改指定元素
 * 
 * 增删改查
 * 
 */
public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// void add(int index, E element): 添加
		list.add(0, "hello");
		list.add(0,"world");
		System.out.println(list); // 输出: [world, hello]
		list.add(1, "java");
		System.out.println(list); // 输出: [world, java, hello]
		
		// E get(int index) : 根据索引返回元素
//		method(list);
		
		// E remove(int index) : 删除指定的元素并返回
		System.out.println(list.remove(2)); // 输出: hello
		System.out.println(list); // 输出: [world, java]
		
		// E set(int index,E element): 根据索引修改指定元素
		list.set(0, "php");
		System.out.println(list); // 输出:[php, java]
	}

	private static void method(List<String> list) {
		System.out.println(list.get(0)); // 输出: world
		System.out.println(list.get(1)); // 输出: java
		System.out.println(list.get(3)); // 输出: 报错
	
		for(String item : list){
			System.out.println(item);
		}
	}
}
