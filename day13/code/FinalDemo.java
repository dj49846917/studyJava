package com.itheima_01;
/*
 * final: 修饰符，可以用于修饰类、成员方法和成员变量
 * final所修饰的类: 不能被继承，不能有子类
 * final修饰的方法: 不能被重写
 * final所修饰的变量: 是不可以修改的，是常量
 * 
 * 常量:
 * 		字面量常量: 1,2,3
 * 		自定义常量: 被final修饰的成员变量，一旦初始化则不可改变
 * 
 * 注意:
 * 		自定义常量必须初始化，可以选择显示初始化或者构造初始化
 * 		 
 */
public class FinalDemo {
	public static void main(String[] args) {
		Dog d = new Dog();
//		d.eat();
//		d.num = 20; // final修饰的变量不能修改
		System.out.println(d.num); // 输出: 10
		System.out.println(d.NUM); // 输出: 20
	}
}

/*final*/ class Animal{
	public final void eat(){
		System.out.println("吃东西");
	}
}

class Dog extends Animal{
//	public void eat(){} // final修饰的方法，不能被重写
	
	final int num = 10;
	final int NUM;
	public Dog(){
		NUM = 20;
	}
}

//class Dog extends Animal{} // 被final修饰的类不能被继承
