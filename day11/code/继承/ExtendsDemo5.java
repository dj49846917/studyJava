package com.itheima_05;
/*
 * 方法重写的应用场景:
 * 		{1}.当父类的方法不能完全满足子类使用，这个时候子类重写父类的方法，并可以在方法中使用关键字super调用父类的方法，这样做既可以保有父类的功能，又可以拥有子类持有的功能
 * 		
 * 方法重写的注意事项:
 * 		不能重写父类私有的方法		
 * 		权限必须大于等于父类方法的权限
 * 注解： @
 */
public class ExtendsDemo5 {
	public static void main(String[] args) {
		NewPhone np = new NewPhone();
		np.call();
	}
}
class Phone {
	public void call(){
		System.out.println("打电话");
	}
//	private void call(){
//		System.out.println("打电话");
//	}
}
class NewPhone extends Phone {
	// 加入注解，可以规范代码
	@Override
	public void call(){ // 父类私有方法，重写会报错
		System.out.println("录音");
		super.call(); // 继承父类的方法
	}
}
