/*
	+:����һ����������������ӷ�����ġ�
	�������������ʱ��һ��Ҫ�������������ݵ����ͱ���һ��
	
	����ת����
		��ʽת��
		ǿ��ת��
		
	��ʽת����
		byte,short,char ==> int ==>long ==> float ==> double
*/
public class TypeCast{
	public static void main(String[] args){
		// ������������
		int a = 3;
		int b = 4;
		int c = a + b;
		System.out.println(c);
		
		// ����һ��byte���͵ı�����һ��int���͵ı���
		byte bb = 6;
		int cc = 20;
		System.out.println(bb+cc); // ��ȷ��˵������Ҳ���Խ����������
		
		// ����Ҫ������������������һ�£������ڲ�һ�£�����Ӧ����ʲô���ͽ����أ�
		
		// byte dd = bb+cc; // ����
		 // System.out.println(dd); // ����
		
		int ee = bb + cc; // ��ȷ
		System.out.println(ee);
	}
}