<<<<<<< HEAD

public class PrintObject {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
=======
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
>>>>>>> origin/master
