package com.itheima_01;
/*
 * 接口与类的关系
 * 		1.类与类: 继承关系。特点: 单一继承，多层继承
 * 		2.类与接口: 实现关系，多实现
 * 		3.接口与接口: 继承关系。多继承
 * 
 */
public class InterfaceDemo3 {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.function(); // 输出: "interB的实现"
	}
}

interface InterA extends InterB{
	public abstract void method();
}

interface InterB{
	public abstract void function();
//	public abstract void method();
}

interface InterC extends InterA{}

// class Demo implements InterC{ //实现
// 	@Override
// 	public void method() { // 如果接口内的方法完全相同，只执行一次
// 		System.out.println("interA的实现");
// 	}

// 	@Override
// 	public void function() {
// 		System.out.println("interB的实现");
// 	}
	
// }

class Demo implements InterA,InterB{ //实现
	@Override
	public void method() { // 如果接口内的方法完全相同，只执行一次
		System.out.println("interA的实现");
	}

	@Override
	public void function() {
		System.out.println("interB的实现");
	}
	
}
