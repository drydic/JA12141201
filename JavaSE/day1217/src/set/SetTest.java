package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set������Ԫ�ز����ظ�
		Set set = new HashSet();
		set.add("abc");
		set.add("cba");
		set.add("bac");
		set.add("a");
		set.add("b");
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			String type = (String) iterator.next();
			System.out.println(type);
			
		}
		
		System.out.println(set.add("cba"));
		System.out.println(set);
	}

}