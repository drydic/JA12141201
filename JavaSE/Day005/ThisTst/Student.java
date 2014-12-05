public class Student{
	String name;
	public Student(String name){
		this.name = name;
	}
	//成员方法
	Student get(){
		return this;
	}
	
	
	public static void main(String[] args){
		Student s1 = new Student("geminno");
		Student s2 = new Student("gemptc");
		//System.out.println("name:" + s1.name);
		
		System.out.println(s1.name);
		System.out.println(s1.get().name);
		
		System.out.println(s2.name);
		System.out.println(s2.get().name);
	}
}