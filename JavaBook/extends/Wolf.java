class Creature{
	public Creature(){
		System.out.println("Creature�޲����Ĺ�����");
	}
}
class Animal extends Creature{
	public Animal(String name){
		//super();
		System.out.println("Animal��һ�����Ĺ��������ö����nameΪ��" + name);
	}
	public Animal(String name,int age){
		this(name);
		System.out.println("Animal���������Ĺ�������������Ϊ��" + age);
	}
}
public class Wolf extends Animal{
	public Wolf(){
		super("ϲ����",5);
		System.out.println("Wolf�޲����Ĺ�����");
	}
	public static void main(String[] args){
		new Wolf();
	}
}