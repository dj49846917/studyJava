package com.itheima_03;

/*
 * 问题出现的原因:
 * 		要有多个线程
 * 		要有被多个线程所共享的数据
 * 		多个线程并发的访问共享的数据
 * 
 * synchronized: 同步(锁)，可以修饰代码块和方法，被修饰的代码块和方法一旦被某个线程访问，则直接锁住，其他的线程将无法访问
 * 
 * 同步代码块:
 * 		{
 * 			synchronized(锁对象){
 * 			
 * 			}
 * 		}
 * 
 * 注意:	锁对象需要被所有的线程所共享
 * 
 * 同步: 安全性高，效率低
 * 非同步: 效率高，但是安全性低
 * 
 */
public class TicketThread implements Runnable {
	int tickets = 100; // 火车票数量
	Object obj = new Object();
	
	@Override
	public void run() {
		// 出售火车票
		while (true) {
			// 当火车票小于0张，则停止售票
			synchronized (obj) { // 同步代码块
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + ":" + tickets--);
				}
			}
		}
	}

}
