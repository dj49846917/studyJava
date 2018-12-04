package com.itheima_04;
/*
 * 匿名内部类的应用场景:
 * 		作为参数传递
 * 
 */
public class InnerDemo {
	public static void main(String[] args) {
		method(new Dog());
		method(new Cat());
	}
	
	public static void method(Animal a){
		a.eat();
	}
}
