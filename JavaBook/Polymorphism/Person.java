public class Person{
	{
		int a = 6;
		if(a > 4){
			System.out.println("Person��ʼ���飺�ֲ�����a��ֵ����4");
		}
		System.out.println("Person�ĳ�ʼ����");		
	}
	{
		System.out.println("Person�ĵڶ�����ʼ����");
	}
	public Person(){
		System.out.println("Person���޲ι��캯��");
	}
	public static void main(String[] args){
		new Person();
	}
}