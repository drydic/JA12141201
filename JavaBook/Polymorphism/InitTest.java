class Root{
	static{
		System.out.println("Root的静态初始化块");
	}
	{
		System.out.println("Root的普通初始化块");
	}
	public Root(){
		System.out.println("Root的无参构造函数");
	}
}
class Mid extends Root{
	static{
		System.out.println("Mid的静态初始化块");
	}
	{
		System.out.println("Mid的普通初始化块");
	}
	public Mid(){
		System.out.println("Mid的无参构造函数");
	}
	public Mid(String msg){
		this();
		System.out.println("Mid的一参构造函数，其值为：" + msg);
	}
}
class Leaf extends Mid{
	static{
		System.out.println("Leaf的静态初始化块");
	}
	{
		System.out.println("Leaf的普通初始化块");
	}
	public Leaf(){
		super("疯狂Java讲义");
		System.out.println("Leaf的无参构造函数");
	}
}
public class InitTest{
	public static void main(String[] args){
		new Leaf();
		new Leaf();
	}
}











