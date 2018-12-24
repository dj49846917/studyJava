package com.itheima_02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Set<K> keySet(): 以Set的形式返回所有的key  (key不允许重复，所以返回的是set)
 * Collection<V> values(): 以Collection的形式返回所有的value (values是允许重复的)
 * 
 */
public class MapDemo3 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("001", "张三");
		map.put("002","李四");
		map.put("003", "王麻子");
		
		// Set<K> keySet(): 以Set的形式返回所有的key  (key不允许重复，所以返回的是set)
//		method(map);
		
		// Collection<V> values(): 以Collection的形式返回所有的value (values是允许重复的)
//		method2(map);
	}

	private static void method2(Map<String, String> map) {
		Collection<String> values = map.values();
		for(String item : values){
			System.out.println(item);
		}
	}

	private static void method(Map<String, String> map) {
		Set<String> keys = map.keySet();
		for(String item : keys){
			System.out.println(item);
		}
	}
}
