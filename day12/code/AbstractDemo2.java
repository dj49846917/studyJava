package com.itheima_01;
/*
 * 抽象类的特点:
 * 		{1}.抽象方法只能在抽象类里面
 * 		{2}.抽象类和抽象方法必须被abstract修饰
 * 		{3}.抽象类不能创建对象(不能实例化)
 * 		{4}.抽象类中可以有非抽象的方法
 * 		{5}.抽象类和类的关系也是继承
 * 		{6}.一个类继承了抽象类要么重写所有的抽象方法，要么他自己是抽象类
 */
public class AbstractDemo2 {
	public static void main(String[] args) {
//		Animals a = new Animals(); // 抽象类不能被实例化
	}
}

abstract class Animals{
	public abstract void eat();
	
	public void run(){}
}

abstract class Cats extends Animals{

//	@Override
//	public void eat() {
//	}
	
}