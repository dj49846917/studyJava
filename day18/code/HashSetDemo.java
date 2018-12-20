package com.itheima;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 使用HashSet存储字符串并遍历
 * 
 * Set集合的特点:
 * 		{1}.无序(存储和读取的顺序有可能不一样)
 * 		{2}.不允许重复(要求元素唯一)
 * 		{3}.没有索引
 * 
 */
public class HashSetDemo {
	public static void main(String[] args) {
		// 创建集合对象
		// HashSet<String> hs = new HashSet<String>();
		Set<String> set = new HashSet<String>(); // 多态，父接口引用指向子类对象

		// 添加元素对象
		set.add("hello");
		set.add("world");
		set.add("java");

		// 遍历集合对象
		// 方法一：转数组
//		method(set);
		
		// 迭代器
//		method2(set);
		
		// 增强for
//		foreachMethod(set);
	}

	private static void foreachMethod(Set<String> set) {
		for(String item : set){
			System.out.println(item);
		}
	}

	private static void method2(Set<String> set) {
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}

	private static void method(Set<String> set) {
		Object[] objs = set.toArray();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
	}
}
