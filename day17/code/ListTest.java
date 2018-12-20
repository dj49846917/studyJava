package com.itheima_04;

import java.util.ArrayList;
import java.util.List;

/*
 * 需求: 定义一个方法，返回指定列表中指定元素的索引位置
 * 
 * 2.判断元素是否存在
 */
public class ListTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
//		int index = index(list, "java");
//		System.out.println(index); // 输出: 2
		
		/*boolean flag = contains(list, "java");
		System.out.println(flag); // 输出： true
*/		
		boolean flag = list.contains("java");
		System.out.println(flag); // 输出: true
	}

	public static int index(List list, Object other) {
		for (int i = 0; i < list.size(); i++) {
			// 获取列表中的元素
			Object objs = list.get(i);
			if (objs.equals(other)) {
				return i;
			}
		}
		// 查找不到指定的元素
		return -1;
	}

	public static boolean contains(List list, Object other) {
		// 获取指定元素在指定列表中的索引位置
		int index = index(list, other);
		// 如果索引>=0,说明该元素存在，否则不存在
		if (index >= 0) {
			return true;
		} else {
			return false;
		}
	}
}
