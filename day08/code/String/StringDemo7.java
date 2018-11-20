package myStringBuilder;
/*
 * StringBuilder： 是一个可变的字符串。字符串缓冲区类。
 * 
 * String和StringBuilder的区别:
 * 		String的内容是固定的。
 * 		String的Builder的内容是可变的。
 * 
 * 构造方法：
 * 		StringBuilder()
 * 
 * 成员方法:
 * 		public int capacity(): 返回当前容量
 * 		public int length(): 返回长度(字符数)
 * 
 * 		容量:理论值
 * 		长度:实际值	
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);
		System.out.println("sb.capacity"+sb.capacity()); // 输出16
		System.out.println("sb.length()"+sb.length()); // 输出0
	}
}
