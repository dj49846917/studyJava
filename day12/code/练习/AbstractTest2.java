package com.itheima_02;
/*
 * 雇员(Employee)示例:
 * 要求:
 * 		公司中
 * 			程序员(programmer)有姓名(name),工号(id),薪水(pay),工作内容(work)。
 * 			项目经理(Manager)除了有姓名,工号(id),薪水(pay),还有奖金(bonus),工作内容(work)
 * 
 * 员工:
 * 		属性： name,id,pay
 * 		行为: work
 * 
 */
public class AbstractTest2 {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.work(); // 输出: "写代码"
		
		Manager m = new Manager();
		m.work(); // 输出: "监督程序员写代码"
	}
}

abstract class Employee{
	String name; // 姓名
	String id; // id
	double pay; // 薪水 
	// 工作
	public abstract void work();
}

class Programmer extends Employee{
	@Override
	public void work() {
		System.out.println("写代码");	
	}
}

class Manager extends Employee{
	byte bonus;
	
	@Override
	public void work() {
		System.out.println("监督程序员写代码");
	}
}