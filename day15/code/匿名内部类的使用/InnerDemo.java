package com.itheima_04;
/*
 * �����ڲ����Ӧ�ó���:
 * 		��Ϊ��������
 * 
 */
public class InnerDemo {
	public static void main(String[] args) {
		method(new Dog());
		method(new Cat());
	}
	
	public static void method(Animal a){
		a.eat();
	}
}
