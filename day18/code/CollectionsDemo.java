package com.itheima_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Collections:
 * 	面试题: Collection和Collections有什么区别?
 * 		Collection是集合体系的最顶层，包含了集合体系的共性
 * 		Collections是一个工具类(特点:1.不需要创建对象，也不能创建对象。2.方法全是static修饰的),方法都是用于操作Collection的
 * 
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		// static int binarySearch(List list, Object key) : 使用二分查找法查找指定元素在指定列表的索引位置（要求数据是有序的，参数只能是Lists）
//		method();
		
		// static void copy(List dest, List src): 把源列表中的数据覆盖到目标列表
//		method2();
		
		// static void fill(List list, Object obj): 使用指定的对象填充指定列表的所有元素
//		method3();
		
		// static void reverse(List list): 反转
//		method4();
		
		// static void shuffe(List list): 随机置换
//		method5();
		
		// static void sort(List list): 排序(升序)
//		method6();
		
		// static void swap(List list, int i, int j): 将指定列表中的两个索引进行位置互换
//		method7();
	}

	private static void method7() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		Collections.swap(list, 0, 1);
		System.out.println(list);
	}

	private static void method6() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(40);
		list.add(18);
		list.add(80);
		list.add(16);
		Collections.sort(list); 
		System.out.println(list); // 输出： [1, 5, 16, 18, 40, 80]
	}

	private static void method5() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Collections.shuffle(list);
		System.out.println(list);
	}

	private static void method4() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Collections.reverse(list);
		System.out.println(list);
	}

	private static void method3() {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		System.out.println(list); // 输出: [hello, world, java]
		
		Collections.fill(list, "android");
		System.out.println(list); // 输出: [android, android, android]
	}

	private static void method2() {
		// 注意: 目标列表的长度至少等于源列表的长度
		// 创建源列表
		List<String> src = new ArrayList<String>();
		src.add("hello");
		src.add("world");
		src.add("java");
		
		// 创建目标列表
		
//		List<String> dest = new ArrayList<String>();
//		Collections.copy(dest, src); // 运行报错，因为目标列表数据个数必须大于等于源列表的个数
		
		List<String> dest = new ArrayList<String>();
		dest.add("php");
		dest.add("php");
		dest.add("php");
		dest.add("php");
		Collections.copy(dest, src);
		System.out.println(dest); // 输出: [hello, world, java, php]
	}

	private static void method() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		int index = Collections.binarySearch(list, 3);
		System.out.println(index); // 输出: 2
	}
}
