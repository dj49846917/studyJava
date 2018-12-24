package com.itheima_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 使用HashMap存储数据并遍历(自定义对象作为key)
 * 
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		// 创建Map对象
		Map<Student, String> map = new HashMap<Student, String>();
		// 创建key对象
		Student s = new Student("张三",18);
		Student s1 = new Student("李四",20);
		Student s2 = new Student("王五",19);
		Student s3 = new Student("王五",19);
		// 添加映射关系
		map.put(s, "001");
		map.put(s1, "002");
		map.put(s2, "003");
		map.put(s3, "003");
		// 遍历Map对象
		
		// 方法1: 获取所有的key,通过key获取value
//		method(map);
		
		// 方法2: 获取所有结婚证对象，通过结婚证对象获取丈夫和媳妇
		method2(map);
	}

	private static void method2(Map<Student, String> map) {
		Set<Map.Entry<Student, String>> entrys = map.entrySet();
		for(Map.Entry<Student, String> item : entrys){
			Student key = item.getKey();
			String value = item.getValue();
			System.out.println(key + "=" + value);
		}
	}

	private static void method(Map<Student, String> map) {
		Set<Student> keys = map.keySet();
		for(Student key : keys){
			String value = map.get(key);
			System.out.println(key + "=" + value);
		}
	}
}
