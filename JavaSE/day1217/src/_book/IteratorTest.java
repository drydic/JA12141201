package _book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Collection books = new ArrayList();
//		books.add("Google");
//		books.add("Java");
//		books.add("Android");
		// it = books.iterator();
		//while ѭ��
//		while (it.hasNext()) {
//			Object object = (Object) it.next();
//			System.out.println(object);
//			if (object.equals("Android")) {
//				it.remove();
//			}
//			object = "Test";
//		}
//		System.out.println(books);
		
		//foreach ѭ��
		Collection books = new HashSet();
		books.add(new String("Google"));
		books.add(new String("Java"));
		books.add(new String("Android"));
		books.add(new String("Why"));
		System.out.println(books);
		for (Object object : books) {
			String object2 = (String)object;
			System.out.println(object2);
			if (object2.equals("Java")) {
				books.remove(object2);
			}
		}
		System.out.println(books);
	}

}