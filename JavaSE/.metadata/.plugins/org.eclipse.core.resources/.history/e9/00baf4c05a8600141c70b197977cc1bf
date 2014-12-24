package list;

import java.util.ArrayList;

import bean.Person;

public class ArrayListDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		
		for (int i = 0; i < 5; i++) {
			al.add(new Person("it-" + i,i));
		}
		Person p = new Person("it-3",3);
		al.add(p);
		System.out.println(al);
		System.out.println(al.indexOf(p) + "=====" + al.lastIndexOf(p));
		System.out.println(al.indexOf(new Person("it-3",3)) + "=====" + al.lastIndexOf(new Person("it-3",3)));
				
	}

}
