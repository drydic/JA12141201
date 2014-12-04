public class ThisInConstructor{
	//定义一个名为foo的field
	public int foo;
	public ThisInConstructor(){
		//在构造器里定义一个foo变量
		int foo = 0;
		//使用this代表此构造器进行初始化的对象
		//下面的代码将会把刚创建对象的foo field设置为6
		this.foo = 6;
		
	}
	public static void main(String[] args){
		//所有使用thisinconstructor创建的对象的foo field
		//都将被设置为6，所以下面代码将输出6
		System.out.println(new ThisInConstructor().foo);
	}
}