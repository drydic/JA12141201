public class Exe03{
	public static void main(String[] args){
		
		byte a = 4,a1 = 2;
		System.out.println("byte���ͣ�\na+a1="+ (a+a1) +"\na-a1="+ (a-a1) +"\na/a1="+ (a/a1) +"\na*a1="+(a*a1));
		
		short b = 9,b1 = 3; 
		System.out.println("\nshort���ͣ�\nb+b1="+ (b+b1) +"\nb-b1="+ (b-b1) +"\nb/b1="+ (b/b1) +"\nb*b1="+(b*b1));
		
		int c = 999,c1=999;
		System.out.println("\nint���ͣ�\nc+c1="+ (c+c1) +"\nc-c1="+ (c-c1) +"\nc/c1="+ (c/c1) +"\nc*c1="+(c*c1));
		
		long d = 132,d1 = 654;
		System.out.println("\nlong���ͣ�\nd+d1="+ (d+d1) +"\nd-d1="+ (d-d1) +"\nd/d1="+ (d/d1) +"\nd*d1="+(d*d1));
		
		float e = 19,e1 = 94;
		System.out.println("\nfloat���ͣ�\ne+e1="+ (e+e1) +"\ne-e1="+ (e-e1) +"\ne/e1="+ (e/e1) +"\ne*e1="+(e*e1));
		
		double f = 654.94,f1 = 6874.32;
		System.out.println("\ndouble���ͣ�\nf+f1="+ (f+f1) +"\nf-f1="+ (f-f1) +"\nf/f1="+ (f/f1) +"\nf*f1="+(f*f1));
		
		System.out.println("\na+b-c*d/e+f="+(a+b-c*d/e+f));
	}
}