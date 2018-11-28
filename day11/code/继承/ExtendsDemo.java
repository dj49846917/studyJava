package com.itheima;
/*
 * 继承: 
 * 		多个类共同的成员变量和成员方法，抽取到另外一个类中(父亲)，再让多个类去继承这个父类，我们的多个类就可以获取到父类中的成员了。
 */
public class ExtendsDemo {
	public static void main(String[] args) {
        // 实例化并调用
		Dota d = new Dota();
		d.start();
		
		Lol l = new Lol();
		l.stop();
	}
}

class Games{
	String name;
	double version;
	String agent;
	
	public void start(){
		System.out.println("游戏启动了");
	}
	
	public void stop(){
		System.out.println("游戏关闭了");
	}
}
// 继承Games类，能获取里面的成员变量和方法
class Dota extends Games{}

class Lol extends Games{}
