public class Employee{
	int id;
	String name;
	double salary;
	
	//构造方法不能被继承
	public Employee(){
		
		System.out.println("父类无参构造函数。");
	} 
	
	//
	public Employee(int id){
	    this.id = id;
		System.out.println("父类一参构造函数");
		
		
	}
	public Employee(int id,String str){
	    this.id = id;
		System.out.println("父类两参构造函数");
		
		
	}
	
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	/* public int getId(){
		return id;
	} */
	public void info(){
		System.out.println("父类的info()方法。");
		System.out.println("id:" + id + "\tname:" + name + "\tsalary:" + salary);
	}
	
}