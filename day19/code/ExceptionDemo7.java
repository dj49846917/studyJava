package com.itheima;

import javax.management.RuntimeErrorException;
/*
 * 需求:写一个方法，接收考试成绩，如果考试成绩的范围在0-100之间则属于正常，否则属于异常
 * 
 * 自定义异常：
 * 		1.运行时： 
 * 			继承 RuntimeException
 * 			public class myException extends RuntimeException
 * 	
 * 		2.编译时:
 * 			继承 Exception
 * 			public class myException extends Exception
 *		
 *	快捷键：
 *		右键 =》  Source =》 Generate Constructors and Superclass...
 * 
 * throws: 处理异常的一种方式，把异常抛出，由调用者来处理
 * throw: 制造异常的方式,并且结束方法
 * 
 * 注意: 如果抛出(throw)的是编译时期异常，必须在方法声明处抛出(throws)
 * 
 */
/*public class ExceptionDemo7 {
	public static void main(String[] args) {
		try {
			checkScore(110);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void checkScore(int score){
		if(score < 0 || score >100){
			throw new myException1("不符合要求");
		}
		System.out.println("成绩符合要求");
	}
}

class myException1 extends RuntimeException{
	public myException1() {
		super();
	}
	public myException1(String message) {
		super(message);
	}
}*/

public class ExceptionDemo7 {
	public static void main(String[] args) {
		try {
			checkScore(110);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void checkScore(int score) throws myException2{
		if(score < 0 || score >100){
			throw new myException2("不符合要求");
		}
		System.out.println("成绩符合要求");
	}
}

class myException2 extends Exception{
	public myException2() {
		super();
	}

	public myException2(String message) {
		super(message);
	}
}
