/*
	强制转换：
		目标类型 变量名 = (目标类型)(被转换的数据)；
*/

public class TypeCast2{
	public static void main(String[] args){
		int a = 10;
		byte b = 20;
		/*
			//错误写法
			int c = a + b;
			System.out.println(c);
		*/
		
		/*
			// 正确写法
			byte d = (byte)(a + b);
			System.out.println(d);
		*/
		byte d = (byte)(a + b);
		System.out.println(d);
	}
}