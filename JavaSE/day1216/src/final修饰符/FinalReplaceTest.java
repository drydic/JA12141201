package final���η�;

public class FinalReplaceTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a = 5+2;
		final double b = 1.2/3;
		final String string = "���" + "Java";
		final String  book = "���Java���壺" + 99.0;
		final String book2 = "���Java���壺" + String .valueOf(99.0);
		System.out.println(book == "���Java���壺99.0");
		System.out.println(book2 == "���Java���壺99.0");
	}

}
