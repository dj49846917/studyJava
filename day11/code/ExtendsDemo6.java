package com.itheima_05;
/*
 * 继承中构造方法的执行顺序
 * 		在有子父类继承关系的类中，创建子类的对象，调用子类的构造方法，如果子类构造方法的第一行代码没有调用父类的构造方法，则会调用父类的无参构造,肯定要执行父类的构造，因为要先给父类的成员变量进行初始化，子类肯会使用到
 * 
 * 我们可以使用super()在子类构造方法的第一行中调用父类的构造方法
 * 
 * 我是父类无参构造 --- 我是子类有参构造 --- 我是子类无参构造
 * 
 */
public class ExtendsDemo6 {
	public static void main(String[] args) {
		Children c = new Children();
	}
}

class Father {
	public Father(){
		System.out.println("父类无参构造");
	}
	public Father(int num){
		System.out.println("父类有参构造");
	}
}

class Children extends Father {
	public Children(){
		/*
		 * super(1) 输出: 	父类有参构造
							子类无参构造
		 */
//		super(1);
		/*
		 * this(1); 输出:	父类无参构造
							子类有参构造
							子类无参构造
		 */
		this(1);
		System.out.println("子类无参构造");
	}
	public Children(int num){
		System.out.println("子类有参构造");
	}
}
