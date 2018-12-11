package com.itheima;
/*
 * string toString():	返回该对象的字符表示
 * 
 * // 代码区域右键 ==》 source ==> Generate toString()...  快捷键
 * 
 */
public class ObjectDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "张三";
		s.age = "18";
		System.out.println(s.toString()); // 输出: com.itheima.Student@3fa5ac
		System.out.println(s); // 说明默认就是toString()方法
	}
}

class Student extends Object{
	String name;
	String age;
	/*
	public String toString(){
		return name + "@" + age;
	}*/
	@Override
	public String toString() {
		// 代码区域右键 ==》 source ==> Generate toString()...
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
