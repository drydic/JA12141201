class Animal{
	private void beat(){
		System.out.println("心脏跳动...");
	}
	public void breath(){
		beat();
		System.out.println("呼吸中...");
	}
}
class Bird extends Animal{
	public void fly(){
		System.out.println("飞行中...");
	}
}
class Wolf extends Animal{
	public void run(){
		System.out.println("奔跑中...");
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