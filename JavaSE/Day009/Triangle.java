public class Triangle extends Shape{
	//����������
	private double a;
	private double b;
	private double c;
	
	public Triangle(){}
	
	public Triangle(String color,double a,double b,double c){
		super(color);
		this.setsides(a,b,c);
	}
	public void setsides(double a,double b,double c){
		if(a>b+c||b>a+c||c>a+b){
			System.out.println("����������֮�ͱ�����ڵ�����");
			return;
		}
		this.a=a;
		this.b=b;
		this.c=c;
	}
	//��дShape��ļ����ܳ��ĳ��󷽷�
	public double calPerimeter(){
		return a+b+c;
	}
	//��дShape��ķ�����״�ĳ��󷽷�
	public String getType(){
		return getColor() + "������";
	}
}