package com.itheima;
/*
 * 需求: 求5的阶乘
 * 5！ = 5 * 4 * 3 * 2 * 1
 * 5! = 5 * 4!
 * 		4! = 4 * 3!
 * 			3! = 3 * 2!
 * 				2! = 2 * 1!
 * 					1! = 1
 * 
 * 递归:把大问题拆成很多小问题，再把小问题拆成更多的小问题，当我们把小问题解决了，大问题也随之解决
 * 
 * 递归注意事项:
 * 		递归一定要有出口（内存溢出）
 * 		递归次数不宜过多（内存溢出）
 * 
 */
public class RecurrenceDemo {
	public static void main(String[] args) {
		int result = jc(5);
		System.out.println(result);
	}
	
	public static int jc(int n){
		// 必须要有出口
		if(n == 1){
			return 1;
		}else {
			return n * jc(n - 1);
		}
	}
}
