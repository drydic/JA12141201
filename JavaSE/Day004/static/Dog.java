//Dog ����Ĺ�
//Dog ĳ��Ʒ�ֵĹ�
public class Dog{
	//����
	int age;//ʵ�������������ڶ��� ����������.ʵ��������
	String color;
	
	static String type;  //Ʒ�֡�//�����ԣ������ ��������.�������   
	
	
	//����
	Dog(){
	
	}
	Dog(int age,String color){
		this.age = age;
		this.color = color;
		this.type="��ʿ��";
	}
	void bark(){
		System.out.println("barking......");
	}
	
}