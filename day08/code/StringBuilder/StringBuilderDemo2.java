package com.itheima_07;

/*
 * 添加功能:
 * 		public StringBuilder append(任意类型): 添加数据，并返回自身对象
 * 反转功能:
 * 		public StringBuilder reverse()
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		// 创建对象
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = sb.append("hello");
		
		/*
		System.out.println("sb2" + sb2); // 输出"hello"
		System.out.println("sb" + sb);// 输出"hello"
		System.out.println(sb == sb2);// 输出true 说明作用于同一个地址
		*/
		
		/*
		sb.append("world");
		sb.append(true);
		System.out.println(sb); // 输出"helloworldtrue"
		*/
		
		// 链式编程
		sb.append("hello").append("world").append(true);
		System.out.println(sb); // 输出"helloworldtrue"
	}
}
