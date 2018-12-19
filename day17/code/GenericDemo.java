package com.itheime_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 使用集合存储自定义对象并遍历
 * 
 *   Exception in thread "main" java.lang.ClassCastException: com.itheime_03.Student cannot be cast to java.lang.String
 *   由于集合可以存储任意类型的对象，当我们存储了不同类型的对象，就有可能在转换的时候出现类型转换的错误,
 * 所以java为了解决这个问题，给我们提供了一种机制，叫做泛型
 * 
 * 泛型: 是一种广泛的类型，把明确数据类型的工作提前到了编译时期，借鉴了数组的特点
 * 
 * 泛型的好处：
 * 		避免了类型转换的问题
 * 		可以减少黄色警告线
 * 		可以简化我们代码的书写
 * 
 * 什么时候可以使用泛型？
 * 		问API，当我们看到<E>,就可以使用泛型了
 * 
 */
public class GenericDemo {
	public static void main(String[] args) {
		// 泛型使用前的代码
//		method();

		// 创建集合对象
		Collection<Student> c = new ArrayList<Student>();
		// 创建元素对象
		Student s = new Student("张三", 18);
		Student s2 = new Student("李四", 20);
		// 添加元素对象
		c.add(s);
		c.add(s2);
		// 遍历元素对象
		Iterator<Student> it = c.iterator();
		while (it.hasNext()) {
			Student st = it.next();
			System.out.println(st.getName());
		}

	}

	private static void method() {
		// 创建集合对象
		Collection c = new ArrayList();
		// 创建元素对象
		Student s = new Student("张三", 18);
		Student s2 = new Student("李四", 20);
		// 添加元素对象
		c.add(s);
		c.add(s2);
		// 遍历元素对象
		Iterator it = c.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
	}
}

class Student {
	String name;
	int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}