//��ô�Զ�����

public class Person{
	//��Ա������ϵͳĬ�ϳ�ʼ�������ֵ��ȡ��������
	String name = "name";//������������
	int    age = 16;	//������������
	//String sex;
	
	
	//��Ա����
	void setName(String name){
		this.name = name;//this��set����������
	}
	String getName(){//void������������
		return this.name;
	}
	
	//������������ĳ�Ա���������ã���ʼ����Ա������Ҳ���ԡ����ء�
	//�޲ι��캯��
	Person(){//
		System.out.println("�����Զ����޲ι�����");
	}
	//һ�ι��캯��
	Person(String name){
		System.out.println("����һ�ι��캯��");
		this.name = name;
	}
	//���ι�����
	Person(String name,int age){
		System.out.println("�������ι�����");
		this.name = name;
		this.age = age;
	}
	
	//��ӡ����
	void info(){
		System.out.println("Name:" + this.name + "\tAge:" + this.age);
	}
	
}