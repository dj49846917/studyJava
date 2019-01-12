package com.itheima_03;
/*
 * 模拟火车站售票
 * 
 * 分析:
 * 		首先要有火车票的总数量，每售出一张则数量减一
 * 		当火车票数量小于1的时候停止售票
 * 		使用多线程模拟多个窗口进行售票
 * 		当火车票全部售完火车站也一样敞开大门欢迎我们
 * 
 * static void sleep(long millis): 让当前线程睡一会儿
 * 
 */
public class ThreadTest {
	public static void main(String[] args) {
		// 创建线程对象
		TicketThread tt = new TicketThread();
		Thread t = new Thread(tt);
		t.setName("窗口1");
		Thread t2 = new Thread(tt);
		t2.setName("窗口2");
		Thread t3 = new Thread(tt);
		t3.setName("窗口3");
		
		// 启动线程对象
		t.start();
		t2.start();
		t3.start();
	}
}
