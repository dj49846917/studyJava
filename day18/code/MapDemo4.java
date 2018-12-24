package com.itheima_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map的第一种遍历方式:
 * 		首先召集所有的丈夫
 * 		遍历所有的丈夫
 * 		获取每一个丈夫
 * 		让每一个丈夫找他自己的媳妇儿
 * 
 */
public class MapDemo4 {
	public static void main(String[] args) {
		// 创建map对象
			Map<String,String> map = new HashMap<String,String>();
		// 添加映射关系
			map.put("谢霆锋", "张柏芝");
			map.put("黄晓明","杨颖");
			map.put("邓超", "孙俪");
		// 遍历Map对象
			Set<String> keys = map.keySet();
		// 遍历所有的丈夫
			for(String item : keys){
				// 让每个丈夫去找自己的媳妇
				String value = map.get(item);
				System.out.println("丈夫:"+ item +"---"+ "媳妇:" + value);
			}
		// 
	}
}
