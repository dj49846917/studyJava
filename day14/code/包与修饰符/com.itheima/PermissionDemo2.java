package com.itheima;
/*
 * 权限修饰符:
 * 		public		当前类，相同包下不同的类，不同包下的类
 * 		default		当前类，相同包下不同的类
 * 		private		当前类，相同包下不同的类
 * 		protected	当前类，相同包下不同的类
 * 
 * default:当前包下使用
 * protected:让子类对象使用
 */
public class PermissionDemo2 {
	public static void main(String[] args) {
		PermissionDemo pd = new PermissionDemo();
		pd.defaultMethod();
		pd.protectedMethod();
		pd.publicMethod();
		pd.privatedMethod(); // 报错
	}
}
