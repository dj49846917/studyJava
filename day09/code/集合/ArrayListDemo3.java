package com.itheima_01;

import java.util.ArrayList;

/*
 * ArrayList集合的遍历
 */
public class ArrayListDemo4 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("张三");
		array.add("李四");
		array.add("王麻子");
		System.out.println(array); // 输出 [张三, 李四, 王麻子]
		
		for(int x=0;x<array.size();x++){
			String s = array.get(x);
			System.out.println(s); // 分别输出张三，李四，王麻子
		}
	}
}
