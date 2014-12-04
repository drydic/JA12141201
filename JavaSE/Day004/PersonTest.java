//测试Person类
public class PersonTest{
	public static void main(String[] args){
		//实例化对象:引用=变量=实例
		//在定义类时没有自定义无参构造函数
		//编译器自动插入构造器
		Person geminno = new Person();
		Person gem = new Person("高博");
		Person gemptc = new Person("高博集团",12);
		
		
		
		//对象的使用：引用.成员变量、引用.成员方法
		//System.out.println("Name is " + geminno.name);
		//System.out.println("Age is " + geminno.age);
		
		
		geminno.info();
		gem.info();
		gemptc.info();
		
		
	}//end main
}//end class