package com.itheima_02;

import java.util.ArrayList;

/*
 * 存储自定义对象存储
 * 
 * 分析:
 * 		A: 定义学生类
 * 		B: 创建集合对象
 * 		C: 创建学生对象
 * 		D: 把学生对象作为元素添加到集合中
 * 		E: 遍历集合
 */
public class ArrayListTest3 {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		Student s1 = new Student("李沁",24);
		Student s2 = new Student("贾静雯",45);
		Student s3 = new Student("柳岩",27);
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		for(int x=0;x<array.size();x++){
			Student res = array.get(x);
			System.out.println(res.getName()+"----"+res.getAge());
		}
	}
}
