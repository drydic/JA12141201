package list;

import java.util.LinkedList;

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		LinkedList le = new LinkedList();
		LinkedList li = new LinkedList();
		LinkedList lt = new LinkedList();
		//���Ӳ���
		ll.add("it-001");
		ll.add("it-002");
		ll.add("it-003");
		ll.add("it-004");
		ll.add("it-005");
		ll.addFirst("Baidu");
		ll.add(3, "Google");
		ll.addLast("Alibaba");
		le.addAll(ll);
		li = (LinkedList)le.clone();
		System.out.println(li);
		System.out.println(le);
		System.out.println(ll);
		
	}

}
