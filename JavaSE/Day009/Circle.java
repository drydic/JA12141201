//抽象类的子类：实现父类所有的抽象方法

public class Circle extends Shape{
	private double radius;
	public Circle(){}
	public Circle(String color, double radius){
		//this.corlor = color
		super(color);	//抽象类的构造函数
		this.radius = radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	//重写Shape类的计算周长的抽象方法
	public double calPerimeter(){
		return 2*Math.PI*radius;
	}
	
	//重写Shape类的返回形状的抽象方法
	public String getType(){
		return getColor() + "圆形";
	}
	
}