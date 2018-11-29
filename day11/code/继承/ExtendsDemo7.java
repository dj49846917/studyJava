package com.itheima_05;
/*
 * this和super的区别:
 * 		this: 当前对象的引用
 * 			<1>.调用子类的成员变量
 * 			<2>.调用子类的成员方法
 * 			<3>.在子类的构造方法第一行调用子类其他构造方法			
 * 
 * 		super: 子类对象的父类引用
 * 			<1>.调用父类的成员变量
 * 			<2>.调用父类的成员方法
 * 			<3>.在子类的构造方法第一行调用父类的构造方法
 */
public class ExtendsDemo7 {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.function();
	}
}
// 父类
class Die {
	int num = 10;
	public Die(){
		System.out.println("父类无参构造");
	}
	public Die(int num){
		System.out.println("父类有参构造");
	}
	public void method(){
		System.out.println("父类的方法");
	}
}
// 子类
class Zi extends Die {
//	int num = 30;
	public Zi(){
//		this(1); // 第一行不调用子类其他构造函数或者父类构造，默认调用父类无参构造
		System.out.println("子类无参构造");
	}
	public Zi(int num){
		System.out.println("子类有参构造");
	}
	public void method(){
		System.out.println("子类的方法");
	}
	
	public void function(){
//		this.num = 50;
//		System.out.println(num); // 输出50
//		this.method(); // 输出:"子类的方法"
		
//		super.method(); // 输出: "父类的方法"
//		System.out.println(num); // 输出:10  如果子类没有定义num,则为父类的num
		System.out.println(this.num); // 输出:10  如果子类没有定义num,则为父类的num
	}
}

