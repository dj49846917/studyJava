/*
	+:这是一个运算符，用于做加法运算的。
	我们在做运算的时候，一般要求参与运算的数据的类型必须一致
	
	类型转换：
		隐式转换
		强制转换
		
	隐式转换：
		byte,short,char ==> int ==>long ==> float ==> double
*/
public class TypeCast{
	public static void main(String[] args){
		// 定义两个变量
		int a = 3;
		int b = 4;
		int c = a + b;
		System.out.println(c);
		
		// 定义一个byte类型的变量，一个int类型的变量
		byte bb = 6;
		int cc = 20;
		System.out.println(bb+cc); // 正确，说明我们也可以接受这个数据
		
		// 我们要求参与运算的数据类型一致，而现在不一致，我们应该用什么类型接受呢？
		
		// byte dd = bb+cc; // 报错
		 // System.out.println(dd); // 报错
		
		int ee = bb + cc; // 正确
		System.out.println(ee);
	}
}