package com.itheima_01;
/*
 * 多态中的向上转型和向下转型:
 * 	
 * 引用类型之间的转换
 * 		向上转型(自动)
 * 			由小到大(子类型转换成父类型)
 * 		向下转型(强制)
 * 			由大到小
 * 
 * 基本数据类型的转换
 * 		自动类型转换
 * 			由小到大
 * 			byte short char ==> int ==> long ==> float ==> double
 * 		强制类型转换
 * 			由大到小
 */
public class polymorphicDemo3 {
	public static void main(String[] args) {
		Animal2 a = new Dog(); // 向上转型
//		a.eat(); // 输出:"吃东西"
		
//		Dog d = a; // 报错，通俗举例: 狗是动物，动物是狗就错了
		
		Dog d = (Dog)a; // 向下转型
		d.eat(); // 输出: "补钙"
	}
}

class Animal2{
	public void eat(){
		System.out.println("吃东西");
	}
}

class Dog extends Animal2{
	@Override
	public void eat(){
		System.out.println("补钙");
	}
}


