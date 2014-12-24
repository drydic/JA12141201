package generic;

class More<String,Integer>{
	String name;
	int  age;
	public More(String name, int age){
		this.name = name;
		this.age = age; 
	}
	public String show() {
		return name;
	}
	public int getAge(){
		return age;
	}
}
public class Test <T>{

	public Test(T A){
		System.out.println(A);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<String> test = new Test<>("Hello");
		More<String, Integer> more = new More<String, Integer>("xiaoming", 12);
		System.out.println(more.name + more.age);
	}

}
