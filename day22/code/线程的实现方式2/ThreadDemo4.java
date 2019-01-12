package com.itheima_02;

/*
 * 多线程实现方式2:
 * 		声明实现 Runnable 接口的类。该类然后实现 run 方法。然后可以分配该类的实例，在创建 Thread 时作为一个参数来传递并启动
 * 
 * Thread (Runnable target)
 * static Thread currentThread(): 返回当前线程对象
 * 
 * 既然有了继承Thread为何还要整出来实现Runnable？ 
 * 		因为继承具有单一性，如果一个类继承了thread，就不能继承其他类了
 */
public class ThreadDemo4 {
	public static void main(String[] args) {
		// 创建线程实例
		MyThread2 mt = new MyThread2();
		Thread t = new Thread(mt);
		// 修改线程名称
		t.setName("李四");
		// 启动线程
		t.start();

		// 创建线程实例
		MyThread2 mt2 = new MyThread2();
		Thread t2 = new Thread(mt2);
		// 修改线程名称
		t2.setName("王麻子");
		// 启动线程
		t2.start();
	}
}
