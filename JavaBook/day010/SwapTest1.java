class DataWrap{
	public int a;
	public int b;
}
public class SwapTest1{
	public static void main(String[] args){
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("Ωªªª∫Ûa = " + dw.a+",b = " +dw.b);
	}
	public static void swap(DataWrap dw){
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println("swap÷–a = " + dw.a + ",b = " + dw.b);
	}
	
}