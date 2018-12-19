package com.itheima_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 集合的遍历方式:
 * 		1.toArray,可以把集合转换为数组，然后遍历数组即可
 * 		2.iterator,可以返回一个迭代器对象，我们可以通过迭代器对象来迭代集合
 * 
 * Iterator: 可以用于遍历集合
 *  E next(): 返回下一个元素
 *  
 *  注意: Exception in thread "main" java.util.NoSuchElementException
 *  	使用next方法获取下一个元素，如果没有元素可以获取，则出现NoSuchElementException
 * 
 */
public class IteratorDemo {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();
		// 添加元素
		c.add("hello");
		c.add("world");
		c.add("java");

		// toArray循环
// 		method(c);

		// Iterater
//		method2(c);
		
		// Iterator循环
		Iterator it = c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

	private static void method2(Collection c) {
		// 获取迭代器对象
		Iterator it = c.iterator();
		// Object next(): 返回下一个元素
		System.out.println(it.next()); // 输出: hello
		System.out.println(it.next()); // 输出: world
		System.out.println(it.next()); // 输出: java
		// System.out.println(it.next()); // 报错
	}

	private static void method(Collection c) {
		// 获取数组
		Object[] objs = c.toArray();
		// 遍历
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
	}

	private static void method() {
		// 创建集合对象
		Collection c = new ArrayList();
		// 添加元素
		c.add("hello");
		c.add("world");
		c.add("java");
		method(c);
	}
}
