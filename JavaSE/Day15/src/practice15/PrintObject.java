package practice15;

class Person{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public void info(){
		System.out.println("������Ϊ��" + name);
	}	
}


public class PrintObject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��Person���󣬽�֮����p����
		Person p = new Person("�����");
		System.out.println(p);
	}

}
