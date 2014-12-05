//怎么自定义类

public class Person{
	//成员变量：系统默认初始化具体的值，取决于类型
	String name = "name";//引用数据类型
	int    age = 16;	//基本数据类型
	//String sex;
	
	
	//成员方法
	void setName(String name){
		this.name = name;//this是set方法的引用
	}
	String getName(){//void不可以做参数
		return this.name;
	}
	
	//构造器：特殊的成员方法，作用：初始化成员变量、也可以【重载】
	//无参构造函数
	Person(){//
		System.out.println("我是自定义无参构造器");
	}
	//一参构造函数
	Person(String name){
		System.out.println("我是一参构造函器");
		this.name = name;
	}
	//两参构造器
	Person(String name,int age){
		System.out.println("我是两参构造器");
		this.name = name;
		this.age = age;
	}
	
	//打印属性
	void info(){
		System.out.println("Name:" + this.name + "\tAge:" + this.age);
	}
	
}