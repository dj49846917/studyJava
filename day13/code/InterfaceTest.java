package com.itheima_01;
/*
 * 篮球运动员和教练
 * 乒乓球运动员和教练
 * 现在篮球运动员和教练要出国访问，需要学习英语
 * 请根据你所学的知识，分析出来哪些是类，哪些是接口，哪些是抽象类
 * 
 */
public class InterfacrTest {
	public static void main(String[] args) {
		BasketballPlayer bp = new BasketballPlayer();
		bp.speak();
		bp.study();
		bp.eat();
		bp.sleep();
	}
}

class Person{
	String name; // 姓名
	int age; // 年龄
	String gender; // 性别
	// 构造方法
	public Person() {}
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	// 吃
	public void eat(){
		System.out.println("吃饭");
	}
	// 睡
	public void sleep(){
		System.out.println("睡觉");
	}
}

// 学习说英语
interface SpeakEnglish{
	public abstract void speak();
}

// 运动员
abstract class Player extends Person{
	// 学习
	public abstract void study();
}

// 教练
abstract class Coach extends Person{
	// 教
	public abstract void teach();
}

// 篮球运动员
class BasketballPlayer extends Player implements SpeakEnglish{
	// 学扣篮
	@Override
	public void study() {
		System.out.println("学扣篮");
	}
	// 学英语
	@Override
	public void speak() {
		System.out.println("学英语");
	}
	
}
// 乒乓球运动员
class PingPangPlayer extends Player{
	// 学抽球
	@Override
	public void study() {
		System.out.println("学抽球");
	}
	
}
// 篮球教练
class BasketballCoach extends Coach implements SpeakEnglish{
	// 教扣篮
	@Override
	public void teach() {
		System.out.println("教扣篮");
	}
	// 学英语
	@Override
	public void speak() {
		System.out.println("学英语");
	}
	
}
// 乒乓球教练
class PingPangCoach extends Coach{
	// 教抽球
	@Override
	public void teach() {
		System.out.println("教抽球");
	}
}