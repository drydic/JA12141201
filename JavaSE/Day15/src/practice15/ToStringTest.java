package practice15;

class Apple{
	private String color;
	private double weight;
	public Apple() {}
	public Apple(String color, double weight) {
		this.color = color;
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	//重写toString方法，用于实现Apple对象的”自我描述“
	public String toString(){
		return "一个苹果，颜色是：" + color + "，重量是：" + weight;
	}
	
}


public class ToStringTest {

	public static void main(String[] args) {
		Apple apple = new Apple("红色", 5.68);
		System.out.println(apple);
	}

}
