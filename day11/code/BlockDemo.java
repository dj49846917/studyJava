package com.itheima_04;
/*
 * 代码块
 * 	
 */
public class BlockDemo {
	public static void main(String[] args) {
		/*{
			for(int x=0;x<10;x++){
				System.out.println("我爱java");
				int num = 10;
			}
		}
		System.out.println(num); // 报错 */
		
		Teacher t = new Teacher(); // 输出10遍
		Teacher t2 = new Teacher("张三",20); // 输出10遍
	}
}

class Teacher{
	String name;
	int age;
	// 静态代码块
	static {
		System.out.println("我爱学习");
	}
	
	public Teacher() {
		System.out.println("我是无参构造");
	}
	public Teacher(String name, int age) {
		System.out.println("我是有参构造");
		this.name = name;
		this.age = age;
	}
	// 构造代码块
//	{
//		System.out.println("我爱java");
//	}
}
