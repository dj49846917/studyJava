package com.itheima;
/*
 * 方法的调用:(有明确返回值的方法调用)
 * 		A： 单独调用，没有意义
 * 		B: 输出调用，有意义，但是不够好，因为我可能要做进一步操作
 * 		C： 赋值调用（推荐）
 */
public class MethodDemo2 {
	public static void main(String[] args) {
		// 输出调用
		sum(10,20);
		
		// 输出调用
//		System.out.println(sum(10,20));
		
		// 赋值调用
		int c = sum(10,20);
		// 可以继续进行操作
		c +=10;
		System.out.println(c);
	}
	/*求和方法
	 * 
	 * 两个明确:
	 * 		返回值类型: int
	 * 		参数列表:int a, int b;
	 */
	public static int sum(int a, int b){
		int c = a + b;
		return c;
	}
}
