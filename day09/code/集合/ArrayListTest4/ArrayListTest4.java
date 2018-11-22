package com.itheima_03;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 创建一个集合，存储学生对象，学生对象的数据来至键盘录入,最后，遍历集合
 * 
 * 分析:
 * 		A: 定义学生类
 * 		B: 创建集合对象
 * 		C: 键盘录入数据，创建学生对象，把键盘录入的数据赋值给学生对象的成员变量里
 * 		D: 把学生对象作为元素存储到集合中
 * 		E: 遍历集合
 */
public class ArrayListTest4 {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();
		// 键盘录入数据，创建学生对象，把键盘录入的数据赋值给学生对象的成员变量里
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student(sc.nextLine(),sc.nextLine());
		System.out.println("s1:"+s1);
		Student s2 = new Student(sc.nextLine(),sc.nextLine());
		System.out.println("s2:"+s2);
		Student s3 = new Student(sc.nextLine(),sc.nextLine());
		System.out.println("s3:"+s3);
		// 把学生对象作为元素存储到集合中
		array.add(s1);
		array.add(s2);
		array.add(s3);
		// 遍历集合
		for(int x =0;x<array.size();x++){
			Student res = array.get(x);
			System.out.println(res.getName()+"----"+res.getAge());
		}
	}
}
