/*
	���������ע������:
		A: ����δ��ֵ������ֱ��ʹ��
*/
public class Variable2{
	public static void main(String[] args){
		int a = 10;
		System.out.println(a); // ��ȷ
		
		int b;
		System.out.println(b); // ����
		
		int c;
		c = 20;
		System.out.println(c); // ��ȷ
		
		{
			// �����
			int d = 200;
			System.out.println(d);  // ��ȷ
		}
		System.out.println(d); // ����
		
		/*  
			// ����������д
			int aa,bb;
			aa = 10;
			bb = 20;
			System.out.println(aa);
			System.out.println(bb);
		*/
		
		/* 
			// �������д
			int aa = 10;
			int bb = 30;
			System.out.println(aa);
			System.out.println(bb);
		*/
	}
}