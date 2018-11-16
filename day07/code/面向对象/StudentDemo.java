// package com.itheima4;

// public class StudentDemo {
// 	public static void main(String[] args) {
// 		Student s = new Student();
// 		s.show();
		
// 		s.name = "张国荣";
// //		s.age = 20;
// //		s.age = -18; // 报错
// //		s.setAge(-18); //校验了  输出: 姓名是:张国荣,年龄是:0
// 		s.setAge(22);
// 		s.show();
// 	}
// }

package com.itheima5;

public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.getName() +"-------" +s.getAge());
		s.setName("张国荣");
		s.setAge(20);
		System.out.println(s.getName() +"-------" +s.getAge());
	}
}

