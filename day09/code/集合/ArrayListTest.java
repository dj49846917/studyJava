package com.itheima_02;

import java.util.ArrayList;

/*
 * 存储字符串并遍历
 */
public class ArrayListTest {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		// 添加数据
		array.add("北京");
		array.add("上海");
		array.add("重庆");
		for(int x=0;x<array.size();x++){
			String res = array.get(x);
			System.out.println(res);
		}
	}
}
