package com.itheima_03;

import java.util.Date;

/*
 * Date的常用方法
 * 		{1}.毫秒值 =》 Date
 * 				设置
 * 				返回值是void,参数long
 * 				void setTime(long time)
 * 				Date(long date)
 * 
 * 		{2}.Date =》毫秒值
 * 				获取
 * 				返回long,无参数
 * 				long getTime()
 * 
 */
public class DateDemo2 {
	public static void main(String[] args) {
		// 当前时间
		Date d = new Date();
//		d.setTime(1000*60*60);
		System.out.println(d.toLocaleString()); // 输出: 2018-12-10 14:55:40
		System.out.println(d.getTime()); // 输出: 1544424940087
		
		// 设置时间
		d.setTime(360000L);
		System.out.println(d.toLocaleString()); // 输出: 1970-1-1 8:06:00
		System.out.println(d.getTime()); // 输出: 360000
	}
}
