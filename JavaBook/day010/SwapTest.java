public class SwapTest{
	public static void swap(int a,int b){
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("swap������a=" + a+"��b = " + b);
	}
	public static void main(String[] args){
		int a = 6;
		int b = 9;
		swap(a,b);
		System.out.println("������a=" + a+"��b = " + b);
	}
	

}