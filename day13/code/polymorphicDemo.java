package com.itheima_01;
/*
 * 多态的前提:
 * 		子父类的继承关系
 * 		方法的重写
 * 		父类引用指向子类对象
 * 
 * 动态绑定: 运行期间调用的方法，是根据其具体的类型
 * 
 */
public class polymorphicDemo {
	public static void main(String[] args) {
		/*Cat a = new Cat();
		a.eat();*/
		
		// 父类引用	Animal a
		// 指向		=
		// 子类对象	new Cat()
		Animal a = new Cat(); // 通俗理解就是: 猫是猫，猫是动物
		a.eat(); // 输出: '猫吃鱼'
	}
}

class Animal{ // 父类
	public void eat(){
		System.out.println("吃东西");
	}
}

class Cat extends Animal{ // 子类
	@Override
	public void eat(){
		System.out.println("猫吃鱼");
	}
}
