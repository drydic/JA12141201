//����Person��
public class PersonTest{
	public static void main(String[] args){
		//ʵ��������:����=����=ʵ��
		//�ڶ�����ʱû���Զ����޲ι��캯��
		//�������Զ����빹����
		Person geminno = new Person();
		Person gem = new Person("�߲�");
		Person gemptc = new Person("�߲�����",12);
		
		
		
		//�����ʹ�ã�����.��Ա����������.��Ա����
		//System.out.println("Name is " + geminno.name);
		//System.out.println("Age is " + geminno.age);
		
		
		geminno.info();
		gem.info();
		gemptc.info();
		
		
	}//end main
}//end class