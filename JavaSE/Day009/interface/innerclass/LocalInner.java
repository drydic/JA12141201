class Outer{
	int a = 123;
	private String str = "geminno";
	
	void run(){
		String local_var = "�ֲ�����";
		final int num = 111;
		
		/* *�ֲ��ڲ���:
			1.����ʹ��Ȩ�����η���static����
			2.���Է��ʵ�ǰ����鳣�������ܷ��ʾֲ�����
			3.�����Ծ�̬�������������
		*/
		class Inner{
			int a = 888;
			//static String var = "static var";
			void inner_run(){
				System.out.println("�ڲ��ࣺ��Ա����" + num);
				System.out.println(a + "\t" + str);
				
			}
		}		
		
		Inner in = new Inner();
		in.inner_run();
	}	
}

public class LocalInner{
	public static void main(String[] args){
		Outer out = new Outer();
		out.run();
	}
}