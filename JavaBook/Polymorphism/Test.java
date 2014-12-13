class Animal{
	private void beat(){
		System.out.println("��������...");
	}
	public void breath(){
		beat();
		System.out.println("������...");
	}
}
class Bird extends Animal{
	public void fly(){
		System.out.println("������...");
	}
}
class Wolf extends Animal{
	public void run(){
		System.out.println("������...");
	}
}

public class Test{
	public static void main(String[] args){
		Bird b = new Bird();
		b.breath();
		b.fly();
	
		Wolf w = new Wolf();
		w.breath();
		w.run();
	}
}