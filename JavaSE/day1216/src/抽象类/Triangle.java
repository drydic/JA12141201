package 抽象类;

public class Triangle extends Shape {
	
	private double a;
	private double b;
	private double c;
	
	public Triangle(String color, double a, double b, double c) {
		super(color);
		this.setSides(a, b, c);
	}
	public void setSides(double a,double b,double c){
		if (a>b+c||b>a+c||c>a+b) {
			System.out.println("三角形的两边之和必须大于第三边");
			return ;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "三角形";
	}
	public static void main(String[] args) {
		Triangle triangle = new Triangle("红色", 2.9, 3.8, 4.5);
		System.out.println(triangle.getType()+"的周长是："+triangle.calPerimeter());
		
		
	}
}
