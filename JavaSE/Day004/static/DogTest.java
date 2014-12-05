//成员变量初始化工作？==构造函数完成


public class DogTest{
	public static void main(String[] args){
		//
		System.out.println("type=" + Dog.type);
		Dog.type = "藏獒";
		System.out.println("Dog.type=" + Dog.type);
		
		Dog dog = new Dog(12,"white");
		Dog dog2 = new Dog(15,"Black");
		
		//类变量
		System.out.println("dog.type=" + dog.type);
		System.out.println("dog2.type=" + dog2.type);
		System.out.println("Dog.type=" + Dog.type);
		
		
		//实例变量 :依赖于对象
		
		System.out.println("age=" + dog.age);
		System.out.println("age=" + dog2.age + "\tcolor=" + dog2.color);
		
	}
}