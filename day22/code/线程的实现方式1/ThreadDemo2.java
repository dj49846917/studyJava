package com.itheima;

/*
 * 多线程的实现方式:
 * 		方式1: 一种方法是将类声明为Thread的子类。该子类应重写Thread的run方法。接下来可以分配并启动该子类的实例
 * 
 * Thread
 * 		String getName(): 返回该线程的名称
 * 		void setName(String name):  改变线程名称，使之与参数名相同 
 * 
 * CPU执行程序的随机性
 * 
 * 
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		// 创建线程实例
		MyThread mt = new MyThread();
		// 修改线程名称
		mt.setName("张三");
		// 启动线程
		mt.start();

		// 创建线程实例
		MyThread mt2 = new MyThread();
		// 修改线程名称
		mt2.setName("老王");
		// 启动线程
		mt2.start();
	}
}
