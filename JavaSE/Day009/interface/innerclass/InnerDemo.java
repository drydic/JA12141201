class Outer{
	//��Ա����
	int a = 123;
	private String str = "�ⲿ��ı���";
	/* {Inner in = new Inner();
	in.run();} */
	
	//��Ա�ڲ���
	class Inner{
		final static int a = 123;
		//static int a;//���������ڲ�����������̬���� 
		//
		String str = "�ڲ���ı���";
		void run(){
			String str = "�ֲ�����";
			System.out.println("�ڲ���run");
			System.out.println(a + str);
			System.out.println(this.str);
			System.out.println(Outer.this.str);
		}
	}
	//��Ա����
	void run(){
		System.out.println("�ⲿ���run()");
		Inner in = new Inner();
		in.run();
	}
	static void static_run(){
		System.out.println("�ⲿstatic_run()");
		Outer.Inner out = new Outer().new Inner();
		out.run();
	}
	
	
}

public class InnerDemo{
	public static void main(String[] args){
		//�ⲿ��ʹ��
		//Outer out = new Outer();
		//out.run();
		
		
		//��Ա�ڲ���ʹ��
		Outer out = new Outer();
		//Outer.Inner in = out.new Inner();
		//in.run();
		out.static_run();
		
		
		//Inner inn = new Inner();
		/* Outer.Inner inn = new Outer().new Inner();
		inn.run(); */
		
		
	}
}