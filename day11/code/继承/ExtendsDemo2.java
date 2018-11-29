package com.itheima;
/*
 * Java中继承的特点:
 * 		Java语言只支持单一继承，只能继承一个父类(一个儿子只能有一个亲爹)
 * 		Java语言支持多层继承(一个儿子可以有一个亲爹，还可以有一个亲爷爷)
 */
public class ExtendsDemo2 {
	public static void main(String[] args) {
		Game1 l = new Game1();
		l.update(); // 输出: "PCGame更新了"
		l.start(); // 输出: "游戏启动了"
	}
}
// 爷爷
class Game {
	public void start(){
		System.out.println("游戏启动了");
	}
}
// 父类
class PCGames extends Game {
	public void update(){
		System.out.println("PCGame更新了");
	}
}
// 父类
class MobileGames extends Game {
	public void update(){
		System.out.println("MobileGames更新了");
	}
}
// 子类
class Game1 extends PCGames{}