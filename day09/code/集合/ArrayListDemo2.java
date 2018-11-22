package com.itheima_01;
import java.util.ArrayList;
/*
 * 获取元素
 * 		public E get(int index): 返回指定索引处的元素
 * 集合长度
 * 		public int size(): 返回集合中的元素的个数
 * 删除元素
 * 		public boolean remove(Object o): 删除指定元素，返回删除是否成功
 * 		public E remove(int index): 删除指定索引的元素，返回被删除的元素
 * 修改元素
 * 		public E set(int index,E element): 修改指定索引处的元素，返回修改的元素
 */
public class ArrayListDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		// 添加
		array.add("hello");
		array.add("world");
		array.add("java");
		System.out.println(array); // 输出[hello, world, java]
		
		// 索引
		System.out.println(array.get(1)); // 输出world
		
		// 元素的个数
		System.out.println("size:" + array.size()); // 输出 size:3
		
		// 删除
//		System.out.println("remove1:" + array.remove("world")); // 输出 remove1:true
		System.out.println("remove2" + array.remove(2)); // 输出 remove2:java
		
		// 修改
		System.out.println("set:"+array.set(1, "androud")); // 输出 world
		System.out.println(array);
	}
}
