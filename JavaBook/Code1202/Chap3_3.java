public class Chap3_3{
	public static void main(String args[]){
		int n = 123456789;
		float f = n;
		System.out.println("f = " + f);
		
		double x = 9.997;
		int nx = (int)x;
		System.out.println("nx = " + nx);
		
		double x1 = 9.997;
		int nx1 = (int)Math.round(x1);
		System.out.println("nx1 = " + nx1);
	}
}