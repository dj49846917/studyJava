package com.itheima;
/*
 * 继承中成员变量的特点:
 * 		子类只能获取父类非私有成员
 * 		子父类中成员变量的名字不一样直接获取父类的成员变量
 * 		子父类中成员变量的名字一样的获取的是子类的成员变量
 * 
 * 就近原则: 谁离我近我就用谁
 * 		如果有局部变量就用局部变量
 * 		如果没有局部变量，有子类的成员变量就用子类的成员变量
 * 		如果没有局部变量和子类的成员变量，有父类的成员变量就使用父类的成员变量
 * 
 * super: 可以获取父类的成员变量和成员方法，用法和this是相似的
 */
public class ExtendsDemo3 {
	public static void main(String[] args) {
		Kid k = new Kid();
		k.show(); // 输出: "建林"
	}
}

class Dad{
	String name = "建林";
//	private String name = "建林"; // 子类引用会报错
}

class Kid extends Dad{
	String name = "李四";
	
	public void show(){
		String name = "王麻子";
		System.out.println(super.name); // 就算子类定义了name,也输出: "建林"
		System.out.println(this.name); // 输出： "李四"
		System.out.println(name); // 输出: "王麻子"
	}
}
