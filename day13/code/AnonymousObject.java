package com.itheima_01;
/*
 * 匿名对象:
 * 		没有名字的对象
 * 
 * 应用场景:
 * 		{1}.当对象只调用一次的时候可以使用户匿名对象
 * 		{2}.可以当做参数进行传递，但是无法在传参之前做其他的事情
 * 
 * 注意:
 * 		匿名对象可以调用成员变量并赋值，但是赋值没有意义（因为每次都是new出来的，所以都是初始值）
 * 
 */
public class AnonymousObjectDemo {
	public static void main(String[] args) {
		/*Student s= new Student();
		s.study();
		s.study();
		s.study();*/
		
		/*new Student(); // 匿名对象，没有变量引用的对象
		new Student().study();
		new Student().study();
		new Student().study();*/
		
		new Student().age = 18;
		System.out.println(new Student().age); // 输出: 0  因为new出来的，初始值为0
	}
}

class Student{
	String name;
	int age;
	
	public void study(){
		System.out.println("好好学习");
	}
}
