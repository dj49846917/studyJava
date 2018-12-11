package com.itheima_02;
/*
 * 	校验qq号码:
 * 		要求必须是5-15位
 * 		0不能开头
 * 		必须是数字
 * 
 * 	正则表达式: 就是一套规则，可以用于匹配字符串
 * 	
 * 	boolean matches(String regex) : 判断当前字符串是否匹配指定的正则表达式，如果匹配则返回true,否则返回false
 * 
 */
public class RegexDemo {
	public static void main(String[] args) {
		String qq = "123";
		/*boolean flag = checkQQ(qq);
		System.out.println(flag);*/
		
		boolean flag = qq.matches("[1-9][0-9]{4,14}");
		System.out.println(flag);
	}
	
	public static boolean checkQQ(String qq){
		int length = qq.length();
		// 要求必须是5-15位
		if(length<5 || length>15){
			return false;
		}
		
		// 0不能开头
		if(qq.startsWith("0")){
			return false;
		}
		
		// 必须是数字
		for(int i=0; i<length;i++){
			// 得到每一个字符
			char c = qq.charAt(i);
			if(c<'0'||c>'9'){
				return false;
			}
		}
		return true;
	}
}
