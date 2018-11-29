package com.itheima_02;
/*
 * 基础班老师，就业班老师
 * 
 * 共性：
 * 		属性: 姓名、年龄、性别
 * 		行为: 讲课、唱歌
 * 
 */
public class AbstractTest {
	public static void main(String[] args) {
		BasicTeacher bt = new BasicTeacher();
		bt.name = "张三";
		bt.teach(); // 输出： "张三讲基础课程"
		
		JobTeacher jt = new JobTeacher();
		jt.name = "苍老师";
		jt.teach(); // 输出: "苍老师讲就业课程"
	}
}

abstract class Teacher{
	String name;
	int age;
	String gender;
	// 讲课
	public abstract void teach();
}

class BasicTeacher extends Teacher{
	@Override
	public void teach() {
		System.out.println(name + "讲基础课程");	
	}
}

class JobTeacher extends Teacher{
	@Override
	public void teach() {
		System.out.println(name + "讲就业课程");	
	}
}
