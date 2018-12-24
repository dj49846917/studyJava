package com.itheima_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 使用HashMap存储数据并遍历(字符串作为key)
 * 
 */
public class HashMapDemo {
	public static void main(String[] args) {
		// 创建map对象
		HashMap<String,String> hm = new HashMap<String,String>();
		// 添加映射关系
		hm.put("001", "张三");
		hm.put("002", "李四");
		hm.put("003", "王五");
		hm.put("003", "赵柳");
		// 遍历Map对象
		
		// 方法1: 获取所有的key,通过key来获取value
		method(hm);
		
		// 方法2: 获取所有的结婚证对象，通过结婚证对象获取丈夫和媳妇
		method2(hm);
	}

	private static void method2(HashMap<String, String> hm) {
		Set<Map.Entry<String, String>> entry = hm.entrySet();
		for(Map.Entry<String, String> item : entry){
			String key = item.getKey();
			String value = item.getValue();
			System.out.println("学号:" + key + "---" + "姓名:" + value);
		}
	}

	private static void method(HashMap<String, String> hm) {
		Set<String> keys = hm.keySet();
		for(String key : keys){
			String value = hm.get(key);
			System.out.println("学号:" + key + "---" + "姓名:" + value);
		}
	}
}
