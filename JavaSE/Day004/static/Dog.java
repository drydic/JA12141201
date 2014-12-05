//Dog 抽象的狗
//Dog 某种品种的狗
public class Dog{
	//属性
	int age;//实例变量：依赖于对象 【对象引用.实例变量】
	String color;
	
	static String type;  //品种、//类属性，类变量 ：【类名.类变量】   
	
	
	//方法
	Dog(){
	
	}
	Dog(int age,String color){
		this.age = age;
		this.color = color;
		this.type="哈士奇";
	}
	void bark(){
		System.out.println("barking......");
	}
	
}