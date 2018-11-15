package com.itheima2;
/*
 * Student是一个学生事物描述类，main方法不适合放到它里面
 * 
 * 使用一个类，其实就是使用该类的成员。(成员变量和方法)
 * 而我们想使用一个类的成员，就必须首先拥有该类的对象
 * 
 * 如何拥有一个类的对象呢?
 * 		创建对象
 * 
 * 如何创建对象？
 * 		格式: 类名 对象名 = new 类名()
 * 
 * 对象如何访问成员呢？
 * 		成员变量: 对象名.变量名
 * 		成员方法: 对象名.方法名(...)
 */
public class StudentDemo {
	public static void main(String[] args) {
		// 格式: 类名 对象名 = new 类名()
		Student st = new Student();
//		System.out.println(st); // 输出com.itheima2.Student@19bb25a
		
		System.out.println("姓名:" + st.name);
		System.out.println("年龄:" + st.age);
	}
}
