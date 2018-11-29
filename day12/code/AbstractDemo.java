package com.itheima_01;
/*
 * abstract：关键字，用于修饰方法和类
 * 抽象方法：不同类的方法是相似，但是具体内容又不太一样，所以我们只能抽取他的声明，没有具体的方法体，没有具体方法体的方法就是抽象方法
 * 抽象类: 有抽象方法的类必须是抽象类
 * 
 * 注意: 一个类继承了抽象类需要重写他所有的抽象方法,否则这个类就得是抽象类
 * 
 */
public class AbstractDemo {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.run();
	}
}

abstract class Animal{
	public abstract void eat();
	
	//非抽象的方法，子类可以不用重写
	public void run(){
		System.out.println("奔跑吧，大犀牛");
	}
}

class Cat extends Animal{
	@Override
	public void eat() {
		System.out.println("猫吃鱼");
		
	}
}

abstract class Dog extends Animal{

}
