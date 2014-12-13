class Animal2{
	private void beat(){
		System.out.println("����������...");
	}
	public void breath(){
		beat();
		System.out.println("������...");
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
		System.out.println("������...");
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
		System.out.println("������...");
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