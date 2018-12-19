package com.itheima_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 需求: 判断集合中是否包含元素java,如果有则添加元素android
 *
 */
public class IteratorTest {
	public static void main(String[] args) {
		 method();
	}

	private static void method() {
		// 创建集合对象
		Collection c = new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		if (c.contains("java")) {
			c.add("android");
		}
		System.out.println(c);
	}
}
