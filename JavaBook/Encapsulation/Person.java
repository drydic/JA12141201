public class Person{
	private String name;
	private int age;
	
	public void setName(String name){
		if (name.length() > 6 || name.length() < 2){
			System.out.print("�����õ�����������Ҫ��:");
			return;
		}
		else{
			System.out.print("�����õ�����Ϊ:");
			this.name = name;
		}
	}
	public String getName(){
		return this.name;
	}
	
	public void setAge(int age){
		if (age > 100 || age < 0){
			System.out.print("�����õ����䲻�Ϸ�:");
			return;
		}else{
			System.out.print("�����õ�����Ϊ:");
			this.age = age;
		}
	}
	public int getAge(){
		return this.age;
	}
}