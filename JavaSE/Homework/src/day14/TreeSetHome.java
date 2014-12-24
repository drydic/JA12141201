package day14;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetHome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		ts.add(new Student1("xiaoming", 85));
		ts.add(new Student1("daming", 88));
		ts.add(new Student1("drydic", 100));
		ts.add(new Student1("jack", 85));
		ts.add(new Student1("google", 88));
		ts.add(new Student1("gemptc", 70));
		ts.add(new Student1("geminno", 85));
		ts.add(new Student1("java", 90));
		ts.add(new Student1("android", 85));
		
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
	}

}
