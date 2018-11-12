 /*
	变量的定义格式
		数据类型 变量名 = 初始化值
		
	数据类型:
		byte,short,int,long,float,double,char,boolean
		
	注意:
		定义long类型变量的时候，最好直接加L
		定义float类型变量的时候，最好直接加F
 */
 public class Variable{
	public static void main(String[] args){
		// 定义int类型的变量
		int b = 10;
		System.out.println(b);
		
		// 定义long类型的变量
		// long data = 10000000000000; // 直接这样写，会报错
		long data = 10000000000000L;
		System.out.println(data);
		
		// 定义float类型的变量
		// float f = 12.34;	// 这样写会报错
		float f = 12.34F;
		System.out.println(f); 
		
		// 定义double类型的变量
		double d = 2.2;
		System.out.println(d);
	}
	
}