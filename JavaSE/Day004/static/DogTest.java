//��Ա������ʼ��������==���캯�����


public class DogTest{
	public static void main(String[] args){
		System.out.println("����main������ִ��");
		System.out.println("type=" + Dog.type);
		Dog.type = "����";
		System.out.println("Dog.type=" + Dog.type);
		
		//�෽����
		Dog.bark1();
		
		//Dog.age = 123;
		//Dog.bark();
		
		
		Dog dog = new Dog(12,"white");
		Dog dog2 = new Dog(15,"Black");
		
	/*	//�����
		System.out.println("dog.type=" + dog.type);
		System.out.println("dog2.type=" + dog2.type);
		System.out.println("Dog.type=" + Dog.type);
		
		
		//ʵ������ :�����ڶ���
		
		System.out.println("age=" + dog.age);
		System.out.println("age=" + dog2.age + "\tcolor=" + dog2.color);
		*/
		
		dog.bark();
		dog2.bark();
		
		//ʹ�ö������� ���� �෽����
		dog.bark1();
		dog2.bark1();
	}
}