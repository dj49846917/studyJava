package com.itheima_04;

import java.util.LinkedList;

/*
 * List的常用子类
 * 		ArrayList
 * 			底层是数据结构，查询快，增删慢
 * 		LinkedList
 * 			底层结构是链表，查询慢，增删快
 * 
 * 如何选择使用不同的集合？
 * 		如果查询多，增删少: 则使用ArrayList
 * 		如果查询少，增删多: 则使用LinkedList
 * 		如果你不知道使用什么，则使用ArrayList
 * 
 * LinkedList的特有功能:
 * 		void addFirst(E e): 将元素添加到索引为0的位置
 * 		void addLast(E e): 将元素添加到索引为size()-1的位置
 * 		E getFirst(): 获取索引为0的元素
 * 		E getLast(): 获取索引为size()-1的元素
 * 		E removeFirst(): 删除索引为0的元素并返回
 * 		E removeLast(): 删除索引为size()-1的元素并返回
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		// 创建LinkedList对象
		LinkedList<String> link = new LinkedList<String>();
		link.add("hello");
		link.add("world");
		
		// void addFirst(E e): 将元素添加到索引为0的位置
		link.addFirst("php");
		System.out.println(link); // 输出: [php, hello, world]
		
		// void addLast(E e)： 将元素添加到索引为size()-1的位置
		link.addLast("android");
		System.out.println(link); // 输出: [php, hello, world, android]
		
		// E getFirst()
		System.out.println(link.getFirst()); // 输出: php
		
		// E getLast()
		System.out.println(link.getLast());// 输出: android
		
		// E removeFirst()
		System.out.println(link.removeFirst()); // 输出: php
		System.out.println(link); // 输出: [hello, world, android]
		
		// E removeLast()
		System.out.println(link.removeLast()); // 输出：android
		System.out.println(link); // 输出: [hello, world]
	}
}
