package _book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add("�����");
		c.add(6);
		System.out.println("C���ϵ�Ԫ�ظ���Ϊ��" + c.size());
		System.out.println(c);
		c.remove(6);
		System.out.println("C���ϵ�Ԫ�ظ���Ϊ��" + c.size());
		System.out.println("C�����Ƿ����\"�����\"�ַ�����" + c.contains("�����"));
		c.add("������Java EE��ҵӦ��ʵս");
		System.out.println("c���ϵ�Ԫ�أ�" + c);
		
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		System.out.println("c�����Ƿ���ȫ����books���ϣ�" + c.containsAll(books));
		c.removeAll(books);
		System.out.println("c���ϵ�Ԫ�أ�" + c);
		c.clear();
		System.out.println("c���ϵ�Ԫ��" + c);
		books.retainAll(c);
		System.out.println("books���ϵ�Ԫ�أ�" + books);
	}

}
