package ������;

public abstract class Shape {
	{
		System.out.println("ִ��Shape�ĳ�ʼ����");
	}
	private String color;
	public abstract double calPerimeter();
	public abstract String getType();
	public Shape(){}
	public Shape(String color){
		System.out.println("ִ��Shape�Ĺ�����������");
		this.color = color;
		System.out.println("��ɫ�ǣ�" + color);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
