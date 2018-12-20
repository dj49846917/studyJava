package com.itheima;

import java.util.HashSet;

/*
 * 使用HashSet存储自定义对象并遍历
 * 发现可以重复添加
 * 
 * 原因：
 * 		HashSet的add()方法，首先会使用当前集合中的每一个元素和新添加的元素进行hash值比较
 * 		如果hash值不一样，则直接添加新的元素
 * 		如果Hash值一样，比较地址值或者使用equals方法进行比较
 * 		比较结果一样，则认为是重复不添加
 * 		所有的比较结果都不一样则添加
 *      new的对象，hash值不同，所以直接添加了
 * 
 * 解决办法:
 *      重写hashcode和equals方法（鼠标右键 => source => Generate hashCode() and equals()）
 * 	
 * 
 */
public class HashSetDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		HashSet<Student> hs = new HashSet<Student>();
		
		// 创建元素对象
		Student s = new Student("张三",18);
		Student s2 = new Student("李四",19);
		Student s3 = new Student("李四",19);
		
		// 添加元素对象
		hs.add(s);
		hs.add(s2);
		hs.add(s3);
		
		// 遍历集合对象
		for(Student item : hs){
			System.out.println(item); // 没有去重
		}
	}
}

class Student{
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj; // 向下转型，可以获取子类特有成员
		
		// 比较年龄是否相等，如果不等则返回false
		if(this.age != s.age){
			return false;
		}
		
		// 比较姓名是否相等，如果不等则返回false
		if(!this.name.equals(s.name)){
			return false;
		}
		
		// 默认返回true,说明两个学生是相等的
		return true;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
}
