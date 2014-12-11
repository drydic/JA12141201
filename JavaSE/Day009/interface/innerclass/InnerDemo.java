class Outer{
	//成员变量
	int a = 123;
	private String str = "外部类的变量";
	/* {Inner in = new Inner();
	in.run();} */
	
	//成员内部类
	class Inner{
		final static int a = 123;
		//static int a;//不允许在内部类中声明静态变量 
		//
		String str = "内部类的变量";
		void run(){
			String str = "局部变量";
			System.out.println("内部类run");
			System.out.println(a + str);
			System.out.println(this.str);
			System.out.println(Outer.this.str);
		}
	}
	//成员方法
	void run(){
		System.out.println("外部类的run()");
		Inner in = new Inner();
		in.run();
	}
	static void static_run(){
		System.out.println("外部static_run()");
		Outer.Inner out = new Outer().new Inner();
		out.run();
	}
	
	
}

public class InnerDemo{
	public static void main(String[] args){
		//外部类使用
		//Outer out = new Outer();
		//out.run();
		
		
		//成员内部类使用
		Outer out = new Outer();
		//Outer.Inner in = out.new Inner();
		//in.run();
		out.static_run();
		
		
		//Inner inn = new Inner();
		/* Outer.Inner inn = new Outer().new Inner();
		inn.run(); */
		
		
	}
}