 class Bird{
	public void fly(){
		System.out.println("��������  �һ�ɣ���");
	}
}

public class Ostrich extends Bird{
	//super();
	public void fly(){
		//super.fly();
		System.out.println("�������� ��ֻ���ܣ�");
	}
	public static void main(String[] args){
		
		//super.fly();
		Ostrich t = new Ostrich();
		t.fly();
		
	}
}