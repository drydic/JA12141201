public class Manager extends Employee{
	//特有属性
	String car;
	String office;
	
	//子类构造方法：必须调用【父类构造方法】
	//子类无参构造方法 + 没有显示调用父类构造函数=自动调用父类的无参构造方法
	public Manager(){
		super();
		System.out.println("子类无参构造函数");
	}  
	
	//子类一参构造方法
	public Manager(int id){
		super(id);
		System.out.println("子类一参构造方法");
		//this.id = id;
	}
	public Manager(int id,String d){
		//super(id,"d");
		System.out.println("子类两参构造方法");
		//this.id = id;
	}
	
	//特有方法
	public void drive(){
		
		System.out.println("super.name:" + super.name + "开" + this.car + "上班。");
		System.out.println("this.name:"+this.name);
	}
	
	//super：父类的引用
	public void info(){
		System.out.println("子类的info()方法。");
		//System.out.println("id:" + id + "\tname:" + name + "\tsalary:" + salary);
		super.info();
		System.out.println("car:" + car + "\noffice:" + office);
	}

}

