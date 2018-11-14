package com.itheima;
/*
 * 需求: 写一个方法,在控制台输出10次helloworld案例
 * 
 * 两个明确：
 * 		返回值类型: void
 * 		参数列表: 没有参数
 * 
 * 当方法没有明确的返回值的时候使用void
 */
public class MethodDemo3 {
	public static void main(String[] args) {
		returnConsole();
	}
	
	public static void returnConsole(){
		for(int x = 0; x < 10; x++){
			System.out.println("HelloWorld");
		}
	}
}
