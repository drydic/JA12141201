package set;

import java.util.HashSet;
import java.util.Iterator;

import bean.Person;

/*
 * 把自定义对象添加到hashset中 
 */
public class HashSetTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Person person= new Person("Google",121);
		hs.add(new Person("Google",12));
		hs.add(person);
		hs.add(new Person("Alibaba",13));
		hs.add(new Person("Baidu",12));
		hs.add(new Person("Google",12));
		System.out.println("" + hs + "size=" + hs.size());
		
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Person object = (Person) it.next();
			System.out.println(object.getName() + "-" + object);
		}
	}

}
