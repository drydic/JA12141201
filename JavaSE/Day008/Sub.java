public class Sub extends Base{
	String str;
	void sub_show(){
		System.out.println("�������еķ���");
	}
	void sub_show1(){
		System.out.println("�������з���2");
	}
	public static void main(String[] args){
		//Sub sub = new Sub();
		Base a1 = new Sub();//����ת��
		a1.base_show();
		/* if (b instanceof sub)
			 */
			 
		Sub b1 = (Sub)a1;
		b1.base_show();
		b1.sub_show();
		b1.sub_show1();
		//System.out.println("������ø�������a��" + sub.a);
		//����ת�ͺ���Է��ʸ��������
		Base a2 = new Base();
		if (a2 instanceof Sub){
		Sub b2 = (Sub)a2;
		b2.base_show();
		b2.sub_show();
		b2.sub_show1();
		}
		/* b.show();//���Է��ʱ����ิд�ķ���
		
		sub.base_show();//���Է��ʸ������еķ���
		
		sub.sub_show();//���Է����������еķ��� */
	
	
	
	
	
	
	
	
	
		/* //����ת�ͣ�Ĭ�ϣ��������� ָ�� �������
		Base base = new Sub();
		base.show();//���಻�ܵ���
		
		//System.out.println(base.str);//��������ò����Է������������ĳ�Ա�����Ժͷ�����
		System.out.println(base.a);
		base.base_show();
		base.show();
		
		
		//����ת�ͣ����������ָ����Ķ���
		Base ba = new Sub();
		Sub sub = (Sub)ba;//ǿ������ת��
		
		//���ʸ��������
		System.out.println(sub.a);
		sub.base_show();
		
		//���ิд����ķ���
		sub.show();
		
		//�������������
		System.out.println(sub.str); */
		
		
		
		
		
	}
}