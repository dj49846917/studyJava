package com.itheima_02;

import java.util.HashMap;
import java.util.Map;

/*
 * Map的常用功能:
 * 		映射功能:
 * 				V put(K key, V value): 就是将key映射到value,如果key存在，则覆盖value,并将原来的value返回
 * 		获取功能:
 * 				V get(Object key)
 * 				int size(): 返回对应关系的个数
 * 		判断功能:
 * 				boolean containsKey(Object key): 判断指定的key是否存在
 * 				boolean containsValue(Object value): 判断指定的value是否存在
 * 				boolean isEmpty(): 判断map是否为空
 * 		删除功能:
 * 				void clear(): 清空所有的对应关系
 * 				V remove(Object key): 根据指定的key删除对应关系，并返回key所对应的值，如果没有删除成功则返回null;
 * 		遍历功能:
 * 				Set<Map.Entry<K,V>> entrySet()
 * 
 * 				Set<K> keySet()
 * 				Collection<V> values()
 * 
 */
public class MapDemo2 {
	public static void main(String[] args) {
		// 创建map对象
		Map<String,String> map = new HashMap<String,String>();
		
		// V put(K key, V value): 就是将key映射到value,如果key存在，则覆盖value,并将原来的value返回
		System.out.println(map.put("001", "张三")); // 输出: null
		System.out.println(map.put("002", "李四")); // 输出: null
		System.out.println(map.put("001", "王五")); // 输出: 张三
		
		// boolean containsKey(Object key): 判断指定的key是否存在
//		containsKeymethod(map);
		
		// boolean containsValue(Object value): 判断指定的value是否存在
//		containsValueMethod(map);
		
		// void clear(): 清空所有的对应关系
//		clearMethod(map);
		
		// boolean isEmpty(): 判断map是否为空
//		isEmptyMethod(map);
		
		// V remove(Object key): 根据指定的key删除对应关系，并返回key所对应的值，如果没有删除成功则返回null;
//		removeMethod(map);
		
		// int size(): 返回对应关系的个数
		System.out.println(map.size()); // 输出: 2
		
		// V get(Object key): 根据指定的Key返回对应的value
//		getMethod(map);
		
		System.out.println(map); // 输出: {001=王五, 002=李四}
		
		
		
	}

	private static void getMethod(Map<String, String> map) {
		System.out.println(map.get("001")); // 输出: 王五
		System.out.println(map.get("006")); // 输出: null
	}

	private static void removeMethod(Map<String, String> map) {
		System.out.println(map.remove("001")); // 输出: 王五
		System.out.println(map.remove("005")); // 输出: null
	}

	private static void isEmptyMethod(Map<String, String> map) {
		System.out.println(map.isEmpty()); // 输出: true
	}

	private static void clearMethod(Map<String, String> map) {
		map.clear();
	}

	private static void containsValueMethod(Map<String, String> map) {
		System.out.println(map.containsValue("001")); // 输出: false
		System.out.println(map.containsValue("张三")); // 输出: false
		System.out.println(map.containsValue("李四")); // 输出: true
	}

	private static void containsKeymethod(Map<String, String> map) {
		System.out.println(map.containsKey("001")); // 输出: true
		System.out.println(map.containsKey("003")); // 输出: false
	}
}
