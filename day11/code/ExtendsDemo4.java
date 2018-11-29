package com.itheima_05;
/*
 * 继承中成员方法的特点
 * 		子类中没有这个方法，调用父类的
 * 		子类中重写了这个方法，调用子类的
 * 
 * 	方法的重写: 在子父类当中，子类的方法和父类完全一样,子类覆盖了父类的方法，当子类覆盖了父类的方法之后，使用子类对象调用的就是子类的方法
 * 	方法的重载: 在一个类中，有多个重名的方法，但是其参数不一样(参数的个数、类型、顺序)，和返回值无关
 */
public class ExtendsDemo4 {
	public static void main(String[] args) {
		Kid k = new Kid();
		k.eat();
	}
}

class Dad{
	public void eat() {
		System.out.println("小酌两口");
		System.out.println("去睡觉了");
	}
}

class Kid extends Dad{
	public void eat() {
		System.out.println("好好吃饭");
	}
}
