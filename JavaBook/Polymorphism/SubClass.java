//��ͬ���͵ı���������ͬһ������ʱ���ֳ����ֲ�ͬ����Ϊ����������̬

class BaseClase{
	public int book = 6;
	public void base(){
		System.out.println("�������ͨ����");
	}
	public void test(){
		System.out.println("���౻���ǵķ���");
	}
}

public class SubClass extends BaseClase{
	public String book = "������Java EE��ҵӦ��ʵ��";
	public void test(){
		System.out.println("���า�Ǹ���ķ���");
	}
	public void sub(){
		System.out.println("�������ͨ����");
	}
	
	public static void main(String[] args){
		BaseClase bc = new BaseClase();
		System.out.println(bc.book);
		bc.base();
		bc.test();
		
		SubClass sc = new SubClass();
		System.out.println(sc.book);
		sc.base();
		sc.test();
		
		BaseClase pbs = new SubClass();
		System.out.println(pbs.book);
		pbs.base();
		pbs.test();
		//pbs.sub();
		
		
	}
}