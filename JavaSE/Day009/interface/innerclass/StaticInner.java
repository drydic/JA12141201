class Outer{
	//��Ա����
	static int a = 123;
	static private String str = "�ⲿ��ı���";
	
	
	//��Ա�ڲ���
	static class Inner{
		String str = "gem";
		void run(){
			System.out.println("�ڲ���ķǾ�̬����");
			System.out.println(a + str);
		}
		
		
		static String static_str = "�ڲ���ľ�̬����";
		static void static_run(){
			System.out.println("�ڲ���ľ�̬����");
			
		}
		
	}
	void run(){
		//���ڲ��������� �෽������
		System.out.println(Inner.static_str);
		Inner.static_run();
		
		//���ڲ����ʵ������ �����ĵ���
		Inner in = new Inner();
		System.out.println(in.str);
		in.run();
	}
}

public class StaticInner{
	public static void main(String[] args){
		/* Outer.Inner in = new Outer.Inner();
		in.run();
		in.static_run(); */
		System.out.println(Outer.Inner.static_str);
		Outer.Inner.static_run();
		
		Outer.Inner in = new Outer.Inner();
		System.out.println(in.str);
		
		
		
		
		
	}
}