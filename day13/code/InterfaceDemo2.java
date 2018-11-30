package com.itheima_01;
/*
 * 接口的成员特点:
 * 		只能有抽象方法
 * 		只能有常量(思考为什么? 因为: 如果是变量，接口中没有方法体，不能给变量赋值，只能一开始就初始化好，一开始就初始化好却不改变，这就是常量)
 * 		默认使用abstract和public修饰方法
 * 		只能使用abstract和public修饰方法   (思考为什么？因为：类与接口的关系是实现关系，如果接口里有private私有化的方法，类就无法访问，也就无法实现)
 * 		默认使用public static final来修饰成员变量
 * 
 * 建议:
 * 		建议大家手动的给上默认修饰符
 * 
 * 注意: 
 * 		1.接口不能创建对象(不能实例化)
 * 		2.类与接口的关系是实现关系，一个类实现一个接口必须实现他所有的方法
 * 
 */
public class InterfaceDemo2 {
	public static void main(String[] args) {
//		Animal a = new Animal();  // 不能实例化
	}
}

interface Animal {
	public static final int num = 10; // 常量
	
	public abstract void eat();
}

class Cat implements Animal{

	@Override
	public void eat() {
		
	}
	
}
