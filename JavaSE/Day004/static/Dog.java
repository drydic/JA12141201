//Dog 抽象的狗
//Dog 某种品种的狗
public class Dog{
	//属性
	int age;//实例变量：依赖于对象 【对象引用.实例变量】
	String color;
	
	static String type;  //品种、//类属性，类变量 ：【类名.类变量】   
	
	
	//静态代码块
	static {//使命：初始化 类变量
		type = "XXXXXXX";
		System.out.println("我在static代码块中");
		
		
	}
	
	
	//方法
	Dog(){
	
	}
	Dog(int age,String color){
		this.age = age;
		this.color = color;
		this.type="哈士奇";
	}
	
	//实例方法：this代表调用者的引用
	void bark(){
		this.type = "泰迪";
		System.out.println("barking......" + age + color);
	}
	//类方法：不能访问【实例变量】==不依赖对象==
	static void bark1(){//因为没有对象，所以不能访问实例变量、实例方法
						//只能访问类变量、局部变量、
		type = "京巴";
		System.out.println("类方法");
	}
	
}