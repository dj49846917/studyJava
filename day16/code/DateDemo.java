package com.itheima_03;

import java.util.Date;

/*
 * Date: 表示特定的瞬间，精确到毫秒，他可以通过方法来设定自己所表示的时间，可以表示任意的时间
 * System.currentTimeMills() : 返回的是当前系统时间，1970-1-1至今的毫秒数
 * 
 * 构造方法:
 * 		Date() : 创建的是一个表示当前系统时间的Date对象
 * 		Date(long date) : 根据"指定时间"创建Date对象
 */
public class DateDemo {
	public static void main(String[] args) {
		// Date()
//		Date d = new Date();
//		System.out.println(d); // 输出: Mon Dec 10 14:33:32 CST 2018
//		System.out.println(d.toLocaleString()); // 输出: 2018-12-10 14:36:49(过时，不推荐用)
		
		
		// 有参构造: Date(long date)
//		Date d2 = new Date(1000*60*60*24); // 时区有时差
//		System.out.println(d2.toLocaleString());
	}
}
