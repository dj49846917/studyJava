/*
	变量定义的注意事项:
		A: 变量未赋值，不能直接使用
*/
public class Variable2{
	public static void main(String[] args){
		int a = 10;
		System.out.println(a); // 正确
		
		int b;
		System.out.println(b); // 报错
		
		int c;
		c = 20;
		System.out.println(c); // 正确
		
		{
			// 代码块
			int d = 200;
			System.out.println(d);  // 正确
		}
		System.out.println(d); // 报错
		
		/*  
			// 不建议这样写
			int aa,bb;
			aa = 10;
			bb = 20;
			System.out.println(aa);
			System.out.println(bb);
		*/
		
		/* 
			// 最好这样写
			int aa = 10;
			int bb = 30;
			System.out.println(aa);
			System.out.println(bb);
		*/
	}
}