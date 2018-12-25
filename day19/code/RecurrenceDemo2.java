package com.itheima;
/*
 * 需求:
 * 		有一对兔子，从出生后第3个月起每个月生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第20个月的兔子对数是多少？
 * 
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 * 
 * 规律: 除了第一个月和第二个月以外，其余每个月都是前两个月之和
 * 
 * 斐波那契数列
 * 
 */
public class RecurrenceDemo2 {
	public static void main(String[] args) {
		int result = method(20);
		System.out.println(result); // 输出: 6765
	}
	
	public static int method(int n){
		// 如果是第一个月，只有一对兔子
		if(n == 1){
			return 1;
		}else if(n == 2){
			return 1;
		}else{
			// 如果不是第一个月和第二个月，则兔子的数量是前两个月之和
			return method(n-1) + method(n-2);
		}
	}
}
