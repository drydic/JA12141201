class Person{
	private String name;
	public Person(String name){
		this.name = name;
	}
	public void info(){
		System.out.println("������Ϊ��" + name);
	}
}
public class PrintObject{
	public static void main(String[] args){
		Person p = new Person("�����");
		System.out.println(p);
	}
}