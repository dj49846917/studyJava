package com.itheima;
/*
 * 成员内部类的修饰符：
 * 		我们可以使用权限修饰符修饰内部类，但是如果使用私有来修饰，则无法在其他类中访问
 * 
 * 我们可以使用abstract,final修饰成员内部类
 * 
 */
public class InnerDemo2 {
	public static void main(String[] args) {
//		Outer2.Inner2 i; // 报错
		
		/*Outer2.Inner2 i = new Outer2.Inner2(); // 使用static修饰的内部类，可以省去外部类的对象
		i.function();*/
		
		Outer2.Inner2.function(); // static修饰内部类和内部类的方法，可以直接类名调用
	}
}

class Outer2{
	public void method(){
		Inner2 i = new Inner2();
		i.function();
	}
//	private class Inner2{
//		public void function(){
//			System.out.println("function");
//		}
//	}
	
	static class Inner2{
//		public void function(){
//			System.out.println("function");
//		}
		public static void function(){
			System.out.println("function");
		}
	}
}
