package _book;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set books = new HashSet();
		books.add(new String("·è¿ñJava½²Òå"));
		boolean result = books.add(new String("·è¿ñJava½²Òå"));
		System.out.println(result + "--->" + books);
				
	}

}
