package list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		for(int i = 0; i < 5; i++){
			v.addElement("it-" + i);
		}
		System.out.println(v);
		
		for(Enumeration e = v.elements();e.hasMoreElements();)
		System.out.println(e.nextElement());
		
		System.out.println("============================");
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			String object = (String) en.nextElement();
			System.out.println(object);
		}
	}

}
