 /*
	�����Ķ����ʽ
		�������� ������ = ��ʼ��ֵ
		
	��������:
		byte,short,int,long,float,double,char,boolean
		
	ע��:
		����long���ͱ�����ʱ�����ֱ�Ӽ�L
		����float���ͱ�����ʱ�����ֱ�Ӽ�F
 */
 public class Variable{
	public static void main(String[] args){
		// ����int���͵ı���
		int b = 10;
		System.out.println(b);
		
		// ����long���͵ı���
		// long data = 10000000000000; // ֱ������д���ᱨ��
		long data = 10000000000000L;
		System.out.println(data);
		
		// ����float���͵ı���
		// float f = 12.34;	// ����д�ᱨ��
		float f = 12.34F;
		System.out.println(f); 
		
		// ����double���͵ı���
		double d = 2.2;
		System.out.println(d);
	}
	
}