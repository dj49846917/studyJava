package com.itheima_02;
/*
 * System: 包含一些有用的类字段和方法。它不能被实例化
 * static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) ： 复制数组
 * static long currentTimeMillis() : 系统时间(相对于1970-1-1 00:00:00)
 * static void exit(int status) ： 终止虚拟机
 * static void gc() ： 垃圾回收机制(系统自动调用)
 * 
 * 自动生成方法的快捷键: alt+shift+m
 * 
 */
public class SystemDemo {
	public static void main(String[] args) {
		// 复制数组
//		method();
		
		// 系统时间 
//		method2();
		
		// 终止虚拟机
		method3();
	}

	private static void method3() {
		// static void exit(int status) : 终止虚拟机
		for(int i=0;i<100000;i++){
			if(i==1000){
				System.exit(0); // 终止
			}
		}
	}

	private static void method2() {
		/*
		 * static long currentTimeMillis()： 以毫秒值返回当前系统时间
		 * 这个毫秒的时间是相对时间，相对于1970-1-1 00:00:00:0
		 * 1970-1-1 00:00:01 : 1000
		 * 1970-1-1 00:01:00 : 1000*60
		 * 1970-1-1 01:00:00 : 1000*60*60
		 * 1000毫秒 = 1秒
		 * 
		 */
//		System.out.println(System.currentTimeMillis()); // 输出： 1544420979524
		
		// 应用: 用来计算所用时间（毫秒数）
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	private static void method() {
		/*
		 * static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		 * 复制数组
		 * 参数1: 源数组
		 * 参数2: 源数组的起始索引位置
		 * 参数3: 目标数组
		 * 参数4: 目标数组的起始索引位置 参数5: 指定接收的元素个数
		 */
		int[] src = { 1, 2, 3, 4, 5 };
		int[] dest = new int[5];
		System.arraycopy(src, 0, dest, 0, 5); // 输出: 1,2,3,4,5,
//		System.arraycopy(src, 2, dest, 0, 3); // 输出: 3,4,5,0,0,
//		System.arraycopy(src, 2, dest, 2, 3); // 输出: 0,0,3,4,5,

		for (int i = 0; i < dest.length; i++) {
			System.out.print(dest[i]);
		}
	}
}
