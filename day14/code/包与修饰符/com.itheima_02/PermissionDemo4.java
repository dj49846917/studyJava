package com.itheima_02;
import com.itheima.PermissionDemo;
// default:当前包下使用
// protected:让子类对象使用

public class PermissionDemo4 extends PermissionDemo {
	public void function(){
		super.protectedMethod();
		super.publicMethod();
		super.defaultMethod(); // 报错
	}
	
	public static void main(String[] args) {
	}
}
