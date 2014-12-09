public class ShapeTest{
	public static void main(String[] args){
		/* Shape s1 = new Triangle("黑色",3,4,5);
		Shape s2 = new Circle("黄色",3);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter());  */
		
		Shape s1 = new Triangle();
		//Shape s2 = new Circle();
		Triangle s3 = (Triangle)s1;
		//s1.setColor("黄");
		s3.setsides(6,7,8);
		
		//s2.setColor("绿");
		//s2.setRadius(10);
		//System.out.println(s1.getType());
		System.out.println("周长是：" + s3.calPerimeter());
		//System.out.println(s2.getType());
		//System.out.println("周长是：" + s2.calPerimeter()); 
	}
}
