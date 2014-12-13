class Animal2{
	private void beat(){
		System.out.println("心脏跳动中...");
	}
	public void breath(){
		beat();
		System.out.println("呼吸中...");
	}
}
class Bird{
	private Animal2 a = new Animal2();
	public Bird(Animal2 a){
		this.a = a;
	}
	public void breath(){
		a.breath();
	}
	public void fly(){
		System.out.println("飞行中...");
	}
}
class Wolf{
	private Animal2 a = new Animal2();
	public Wolf(Animal2 a){
		this.a = a;
	}
	public void breath(){
		a.breath();
	}
	public void run(){
		System.out.println("奔跑中...");
	}
}

public class Test2{
	public static void main(String[] args){
		Animal2 a = new Animal2();
		Bird b = new Bird(a);
		b.breath();
		b.fly();
		
		Animal2 a2 = new Animal2();
		Wolf w = new Wolf(a2);
		w.breath();
		w.run();	
	}
}