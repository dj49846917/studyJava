package com.itheima;
/*
 * 权限修饰符:
 * 		public		当前类，相同包下不同的类，不同包下的类
 * 		default		当前类，相同包下不同的类
 * 		private		当前类，相同包下不同的类
 * 		protected	当前类，相同包下不同的类
 */
public class PermissionDemo {
	public static void main(String[] args) {
		PermissionDemo pd = new PermissionDemo();
		pd.defaultMethod();
		pd.privateMethod();
		pd.publicMethod();
		pd.protectedMethod();
	}
	
	public void publicMethod(){
		System.out.println("publicMethod");
	}
	
	void defaultMethod(){
		System.out.println("defaultMethod");
	}
	
	private void privateMethod(){
		System.out.println("privateMethod");
	}
	
	protected void protectedMethod(){
		System.out.println("protectedMethod");
	}
}
