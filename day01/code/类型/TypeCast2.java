/*
	ǿ��ת����
		Ŀ������ ������ = (Ŀ������)(��ת��������)��
*/

public class TypeCast2{
	public static void main(String[] args){
		int a = 10;
		byte b = 20;
		/*
			//����д��
			int c = a + b;
			System.out.println(c);
		*/
		
		/*
			// ��ȷд��
			byte d = (byte)(a + b);
			System.out.println(d);
		*/
		byte d = (byte)(a + b);
		System.out.println(d);
	}
}