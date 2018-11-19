package com.itheima_03;

import java.util.Scanner;

/*
 * 模拟登陆，给3次机会，并提示还有几次
 * 		
 * 分析：
 * 		A： 定义两个字符串对象，用于存储已经存在的用户名和密码
 * 		B： 键盘录入用户名和密码
 * 		C： A与B做比较
 * 			如果内容相同，提示登陆成功
 * 			如果内容不同，提示登陆失败，并提示还有几次机会
 */
public class StringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username = "admin";
		String password = "123456";
		for (int x = 0; x < 3; x++) {
			System.out.println("请输入一个数据");
			String user = sc.nextLine();
			String psd = sc.nextLine();
			if (username.equals(user) && password.equals(psd)) {
				System.out.println("登陆成功");
				break;
			} else {
				if ((2 - x) == 0) {
					System.out.println("你的账号已锁定，请联系管理员");
				} else {
					System.out.println("登陆失败,你还有" + (2 - x) + "次机会");
				}
			}
		}
	}
}
