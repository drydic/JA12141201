class Outer{
	int a = 123;
	private String str = "geminno";
	
	void run(){
		String local_var = "局部变量";
		final int num = 111;
		
		/* *局部内部类:
			1.不能使用权限修饰符、static修饰
			2.可以访问当前代码块常量、不能访问局部变量
			3.不可以静态定义变量、常量
		*/
		class Inner{
			int a = 888;
			//static String var = "static var";
			void inner_run(){
				System.out.println("内部类：成员方法" + num);
				System.out.println(a + "\t" + str);
				
			}
		}		
		
		Inner in = new Inner();
		in.inner_run();
	}	
}

public class LocalInner{
	public static void main(String[] args){
		Outer out = new Outer();
		out.run();
	}
}