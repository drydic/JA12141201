
class Person{	
	String name;
	int age;
	public Person(){}
	public Person(String name,int age){
		this.name = name;
		this.age = age;	
	}
	
	public String toString(){
		return "name:" + name +"\t age:" + age;
		//return “复写了Object的toString方法”
	}
	
	
	//同一类对象  属性？
	public boolean equals(Object obj){
		 if(this == obj){
			return true; 
		} 
		//是否是同一类对象
		boolean res = obj instanceof Person;
		if (res){//同类
			Person obj2 = (Person)obj;
			if(this.name == obj2.name && this.age == obj2.age){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}



public class Test{
	public static void main(String[] args ){
		/* Test test = new Test();
		System.out.println(test.getClass());
		//直接打印对象时 会默认调用toString
		System.out.println(test);
		System.out.println(test.toString()); */
		
		
		
		
		
		Person p = new Person("geminno",12);
		Person p1 = new Person("google",13);
		Person p2 = p1;
		
		System.out.println("equals:" + p.equals(p1) + "\t==" +(p==p1));
		System.out.println("equals:" + p.equals(p2) + "\t==" +(p2==p1));
	}
}