package set;

import java.util.Iterator;
import java.util.TreeSet;

import bean.ComparatorByLength;

class Errs{
	
}
/*
 * TreeSet:Ҫ�����ӵ�Ԫ�ر�����пɱ��ԡ������������comparable��
 * Ԫ�رȽϱ�׼��compareTo����==0
 * 
 * 
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new ComparatorByLength());
//		ts.add(3);
//		ts.add(4);
//		ts.add(-12);
//		ts.add(9);
//		ts.add(8);
//		ts.add(12);
//		ts.add(65);
		
		ts.add("coc");
		ts.add("nbn");
		ts.add("cuba");
		ts.add("abc");
		ts.add("cab");
		ts.add("zxa");
		ts.add("hello");
		
		
		//��treeSet�����ӵ�Ԫ��Ӧ����ͬһ�����ͣ�
		//ts.add(123);
		
		for (Iterator it = ts.iterator(); it.hasNext();) {
			String object = (String) it.next();
			System.out.println(object);
		}
//		System.out.println("===================");
////		for (Object object : ts) {
////			System.out.println(object);
////		}
////		System.out.println("==================");
////		for (int i = 0; i < ts.size(); i++) {
////			System.out.println(ts[i]);
////		}
//		System.out.println(ts.first());
//		System.out.println(ts.last());
	}

}