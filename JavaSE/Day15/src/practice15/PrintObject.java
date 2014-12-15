package practice15;

class Person{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public void info(){
		System.out.println("此人名为：" + name);
	}	
}


public class PrintObject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个Person对象，将之赋给p变量
		Person p = new Person("孙悟空");
		System.out.println(p);
	}

}
