package com.itheima_02;

public class MyThread2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			// static Thread currentThread(): 返回当前线程对象
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+ ":" + i);
		}	
	}
}
