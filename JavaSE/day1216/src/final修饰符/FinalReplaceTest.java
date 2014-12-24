package finalĞŞÊÎ·û;

public class FinalReplaceTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a = 5+2;
		final double b = 1.2/3;
		final String string = "·è¿ñ" + "Java";
		final String  book = "·è¿ñJava½²Òå£º" + 99.0;
		final String book2 = "·è¿ñJava½²Òå£º" + String .valueOf(99.0);
		System.out.println(book == "·è¿ñJava½²Òå£º99.0");
		System.out.println(book2 == "·è¿ñJava½²Òå£º99.0");
	}

}
