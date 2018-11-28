/*
 * static: 是一个关键字，用于修饰成员变量和成员方法
 * 
 * static的特点:
 * 		{1}.被所有的对象所共享
 * 		{2}.可以使用类名调用
 */
public class StaticDemo {
	public static void main(String[] args) {
		// 类名调用
		Person.graduateFrom = "传智学院";
		
		Person p = new Person();
		p.name = "张三";
		p.age = 20;
//		p.graduateFrom = "传智学院";
		p.speak();
		
		Person p2 = new Person();
		p2.name = "李四";
		p2.age = 22;
//		p2.graduateFrom = "传智学院";
		p2.speak();
	}
}

class Person {
	String name;
	int age;
	static String graduateFrom;

	public void speak() {
		System.out.println(name + "--------" + graduateFrom);
	}
}