package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	//���� 
	
	//����
	public static void main(String[] args) {
		// 
		Collection coll = new ArrayList();
		Collection co = new ArrayList();
		//Collection come = new ArrayList();
		
		
		//String ------Person
		//1.���Ӳ���
		coll.add("Google");
		coll.add("Apple");
		coll.add("Oracle");
		coll.add("xiaomi");
		
		//BAT:   TABLE:
		co.add("Baidu");
		co.add("Alibaba");
		co.add("Tencent");
		co.add("xiaomi");
//		System.out.println("����" + co);
//		System.out.println("����" + coll);
//		
		//co.addAll(coll);
		System.out.println("����" + co);
		System.out.println("����" + coll);
		
//		co.add(coll);
//		System.out.println(coll);
//		System.out.println(co);
//		
//		//2.ɾ��
//		System.out.println(coll.remove("xiaomi"));
//		System.out.println(coll.remove("Apple"));
//		System.out.println(coll);
		
		//ɾ������Ԫ��==ɾ������
		co.removeAll(coll);
		//coll.remove(co);
		//coll.clear();
		System.out.println(coll);
		System.out.println(co);
		
		//ȡ����Ԫ��
//		coll.retainAll(co);
//		System.out.println(coll);
		
		//�жϲ���
//		System.out.println("coll.isEmpty=" + coll.isEmpty());
//		System.out.println("co.isEmpty=" + co.isEmpty());
		
		//�Ӽ��ж�
//		System.out.println(coll.containsAll(co));
//		System.out.println(co.containsAll(coll));
		//System.out.println(coll.contains(co));
		
		
		Iterator it = co.iterator();
		
//		System.out.println("" + it.next() + co.size());
//		System.out.println("" + it.next() + co.size());
//		it.remove();
//		System.out.println("" + co + co.size());
		
		//��������  ====�ٽ���
//		while (it.hasNext()) {
//			Object object = (Object) it.next();
//			//co.add("geminno");
//			System.out.println(object);
//			
//		}
//		System.out.println("========================");
//		for (Iterator it1 = coll.iterator(); it1.hasNext();) {
//			Object object = (Object) it1.next();
//			System.out.println(object);
//		}
//		System.out.println("========================");
//		for (Object object : coll) {
//			System.out.println("coll:" + object);
//		}
		
	}

}