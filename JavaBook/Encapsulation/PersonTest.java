public class PersonTest{
	public static void main(String[] args){
		Person p = new Person();
		
		p.setName("����ȫ");
		System.out.println(p.getName());
			
		p.setAge(1000);
		System.out.println(p.getAge());
		p.setAge(22);
		System.out.println(p.getAge());
	}
}