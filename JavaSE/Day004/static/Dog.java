//Dog ����Ĺ�
//Dog ĳ��Ʒ�ֵĹ�
public class Dog{
	//����
	int age;//ʵ�������������ڶ��� ����������.ʵ��������
	String color;
	
	static String type;  //Ʒ�֡�//�����ԣ������ ��������.�������   
	
	
	//��̬�����
	static {//ʹ������ʼ�� �����
		type = "XXXXXXX";
		System.out.println("����static�������");
		
		
	}
	
	
	//����
	Dog(){
	
	}
	Dog(int age,String color){
		this.age = age;
		this.color = color;
		this.type="��ʿ��";
	}
	
	//ʵ��������this��������ߵ�����
	void bark(){
		this.type = "̩��";
		System.out.println("barking......" + age + color);
	}
	//�෽�������ܷ��ʡ�ʵ��������==����������==
	static void bark1(){//��Ϊû�ж������Բ��ܷ���ʵ��������ʵ������
						//ֻ�ܷ�����������ֲ�������
		type = "����";
		System.out.println("�෽��");
	}
	
}