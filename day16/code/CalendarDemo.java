package com.itheima;

import java.util.Calendar;

/*
 * Clendar: 日历，提供了一些操作年月日时的方法
 * 
 * 获取
 * 修改
 * 添加
 * 
 */
public class CalendarDemo {
	public static void main(String[] args) {
		// static Calendar.getInstance()：  构造方法
		Calendar c = Calendar.getInstance();
		
		// void set(int field, int value): 把指定的字段修改成指定的
		c.set(Calendar.DATE, 20); // 后面的day输出:20
		
		// void add(int field, int amount): 在指定的字段上加上指定的值
		c.add(Calendar.MONTH, 2);
		
		// int get(int field): 返回给定的日历字段的值
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DATE);
		System.out.println(year); // 输出: 2018
		System.out.println(month); // 输出: 11
		System.out.println(day); // 输出: 11
	}
}
