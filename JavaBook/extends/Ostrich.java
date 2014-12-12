 class Bird{
	public void fly(){
		System.out.println("我是鸟类  我会飞！！");
	}
}

public class Ostrich extends Bird{
	//super();
	public void fly(){
		//super.fly();
		System.out.println("我是鸵鸟 我只能跑！");
	}
	public static void main(String[] args){
		
		//super.fly();
		Ostrich t = new Ostrich();
		t.fly();
		
	}
}