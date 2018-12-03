package com.itheima_01;
/*
 * 多态的成员特点:
 * 		成员变量： 编译时看的是左边(父类)，运行时看的左边(父类)
 * 		成员方法: 编译时看的是左边(父类)，运行时看的是右边(子类)
 * 		静态方法: 编译时看的是左边(父类)，运行时看的是左边(父类)
 * 
 * 编译时看的都是左边，运行时成员方法看的是右边，其他(成员变量和静态的方法)看的都是左边
 * 
 */
public class polymorphicDemo2 {
	public static void main(String[] args) {
		Dad d = new Kid();
//		System.out.println(d.num); // 报错，如果父类没有成员变量num，会报错
//		System.out.println(d.num); // 输出:20   如果父类有成员变量num,子类也有,输出父类的变量  
//		d.method(); // 输出:"子类成员方法"
		d.function(); // 输出: "父类静态方法"   使用变量去调用静态方法，其实相当于用变量类型的类名去掉用
	}
}

class Dad{
	int num = 20;
	
	public void method(){
		System.out.println("父类成员方法");
	}
	
	public static void function(){
		System.out.println("父类静态方法");
	}
}

class Kid extends Dad{
	int num = 10;
	
	public void method(){
		System.out.println("子类成员方法");
	}
	
	public static void function(){
		System.out.println("子类静态方法");
	}
}