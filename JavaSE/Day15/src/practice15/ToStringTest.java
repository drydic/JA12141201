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
	//��дtoString����������ʵ��Apple����ġ�����������
	public String toString(){
		return "һ��ƻ������ɫ�ǣ�" + color + "�������ǣ�" + weight;
	}
	
}


public class ToStringTest {

	public static void main(String[] args) {
		Apple apple = new Apple("��ɫ", 5.68);
		System.out.println(apple);
	}

}