package com.itheima_02;

import com.itheima.PermissionDemo;

public class PermissionDemo3 {
	public static void main(String[] args) {
		PermissionDemo pd = new PermissionDemo();
		pd.defaultMethod(); // 报错
		pd.protectedMethod(); // 报错
		pd.publicMethod();
		pd.privatedMethod(); // 报错
	}
}
