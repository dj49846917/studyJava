package com.itheima_01;
/*
 * 抽象类的成员特点:
 * 		成员变量
 * 			{1}.可以有成员变量
 * 			{2}.可以有成员常量
 * 		成员方法
 * 			{1}.可以有抽象方法
 * 			{2}.可以有非抽象方法
 * 		构造方法
 * 			{1}.可以有构造方法，需要对抽象类的成员变量进行初始化			
 * 
 */
public class AbstractDemo3 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.backing();
	}
}

abstract class Animal{
	/*成员变量*/
	String name = "哮天犬";
	final int num = 10; // 常量
	
	/*构造方法*/
	public Animal(){
		System.out.println("抽象类的构造方法");
	}
	
	/*成员方法*/
	public abstract void eat(); // 抽象方法
	public void run(){ // 非抽象方法
		System.out.println("奔跑吧，大犀牛");
	}
}

class Dog extends Animal{
	public void backing(){
		System.out.println(name); // 输出: "哮天犬"
		System.out.println(num); // 输出: 10
	}

	@Override
	public void eat() {
		
	}
}
