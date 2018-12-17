package com.itheima;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection
 * 			boolean add(E e): 是否添加成功
 * 			void clear(): 清空集合
 * 			boolean contains(Object c): 判断集合中是否包含某个元素
 * 			boolean isEmpty()：  判断是否为空
 * 			boolean remove(Object c): 删除元素
 * 			int size(): 返回集合中的个数		
 * 			Object[] toArray()
 * 
 * 
 * Interator<E> iterator()			
 * 
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		// Collection c = new Collection(); // Collection是接口，不能实例化
		Collection c = new ArrayList(); // 多态，父类引用指向子类对象
		
		// boolean add(E e): 是否添加成功(永远可以添加成功，因为ArrayList它允许重复)
//		method1(c);
		
		// void clear(): 清空集合
//		method2(c);
		
		// boolean contains(Object c): 判断集合中是否包含某个元素
//		method3(c);
		
		// boolean isEmpty()： 判断是否为空
//		method4(c);
		
		// boolean remove(Object c)： 删除元素
//		method5(c);
		
		// int size(): 返回集合中的个数		
//		method6(c);
		
		// Object[] toArray(): 将集合转换成一个Object类型的数组
//		method7(c);
	}

	private static void method7(Collection c) {
		c.add("hello");
		c.add("world");
		Object[] objs = c.toArray();
		for(int i=0;i<objs.length;i++){
			System.out.println(objs[i]);
		}
	}

	private static void method6(Collection c) {
		c.add("hello");
		c.add("world");
		System.out.println(c.size()); // 输出: 2
	}

	private static void method5(Collection c) {
		c.add("hello");
		c.add("world");
		c.remove("hello");
		System.out.println(c.remove("hello")); // 输出:false
		System.out.println(c); // 输出: [world]
	}

	private static void method4(Collection c) {
		c.add("hello");
		c.add("world");
		System.out.println(c.isEmpty()); // 输出: false
		
	}

	private static void method3(Collection c) {
		c.add("hello");
		c.add("world");
		System.out.println(c.contains("world")); // 输出: true
		System.out.println(c.contains("wor")); // 输出: false
	}

	private static void method2(Collection c) {
		c.add("hello");
		c.add("world");
		c.clear();
		System.out.println(c); // 输出: []
	}

	private static void method1(Collection c) {
		System.out.println(c.add("hello")); // 输出: true
		System.out.println(c.add("world"));
		
		System.out.println(c); // 输出: "[hello, world]"
	}
}
