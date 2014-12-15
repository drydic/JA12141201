package practice15;

public class FinalVariableTest {

	final int a = 6;
	final String str;
	final int c;
	final static double d;
	final char ch;
	{
		str = "Hello";
		//a = 9;
	}
	static
	{
		d = 5.6;
	}
	public FinalVariableTest()
	{
		c = 5;
		ch  = 69;
	}
	public void changeFinal(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariableTest ft = new FinalVariableTest();
		System.out.println(ft.a);
		System.out.println(ft.c);
		System.out.println(FinalVariableTest.d);
		System.out.println(ft.ch);
	}

}
