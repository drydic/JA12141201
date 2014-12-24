package day12;

import java.util.LinkedList;

public class CollectionHome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		LinkedList<String> co = new LinkedList<String>();
		co.add("13913535174");
		String a = (String)co.peekFirst();
		
		char[] b = a.toCharArray();
		for (int i = 0; i < b.length; i++) {
			int count=1;
			for (int j = i+1; j < b.length; j++) {
				if (b[i]==b[j]) {
					count++;
				}
			}
			if (max<count) {
				max=count;	
			}			
		}
		System.out.println(max);
	}

}
