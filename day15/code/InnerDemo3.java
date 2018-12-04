package com.itheima_02;

/*
 * 局部内部类：
 * 		在方法内，出了方法之后就无法使用
 * 
 */
public class InnerDemo3 {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}

class Outer{
	public void method(){
		int num = 10;
		class Inner{
			public void function(){
				System.out.println("function");
			}
		}
		Inner i = new Inner();
		i.function();
	}
	
	public void test(){
//		System.out.println(num); // 报错，局部变量出了函数都不能使用
//		Inner i = new Inner(); // 报错，局部内部类，出了方法就无法使用
	}
}