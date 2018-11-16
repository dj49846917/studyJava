package com.itheima4;
/*
 * 学生类
 * 	
 * 通过对象直接访问成员变量，会存在数据安全问题
 * 这个时候，我们就想能不能不让外界的对象直接访问成员变量呢？
 * 
 * 如何实现呢？
 * 		private关键字
 * 
 * private:
 * 		是一个修饰符
 * 		可以修饰成员变量，也可以修饰成员方法
 * 		被private修饰的成员只能在本类中被访问
 * 
 * 针对private修饰的成员变量，我们会相应的提供getxxx()和setxxx()用于获取和设置成员变量的值，
 * 方法用public修饰
 * 
 * this: 代表所在类的对象引用
 * 		方法被哪个对象调用,this就代表那个对象
 */
package com.itheima5;
/*
 * 学生类
 */
public class Student {
	private String name;
	private int age;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
}

