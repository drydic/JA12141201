package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	//变量 
	
	//方法
	public static void main(String[] args) {
		// 
		Collection coll = new ArrayList();
		Collection co = new ArrayList();
		//Collection come = new ArrayList();
		
		
		//String ------Person
		//1.增加操作
		coll.add("Google");
		coll.add("Apple");
		coll.add("Oracle");
		coll.add("xiaomi");
		
		//BAT:   TABLE:
		co.add("Baidu");
		co.add("Alibaba");
		co.add("Tencent");
		co.add("xiaomi");
//		System.out.println("国内" + co);
//		System.out.println("国外" + coll);
//		
		//co.addAll(coll);
		System.out.println("国内" + co);
		System.out.println("国外" + coll);
		
//		co.add(coll);
//		System.out.println(coll);
//		System.out.println(co);
//		
//		//2.删除
//		System.out.println(coll.remove("xiaomi"));
//		System.out.println(coll.remove("Apple"));
//		System.out.println(coll);
		
		//删除共有元素==删除交集
		co.removeAll(coll);
		//coll.remove(co);
		//coll.clear();
		System.out.println(coll);
		System.out.println(co);
		
		//取交集元素
//		coll.retainAll(co);
//		System.out.println(coll);
		
		//判断操作
//		System.out.println("coll.isEmpty=" + coll.isEmpty());
//		System.out.println("co.isEmpty=" + co.isEmpty());
		
		//子集判断
//		System.out.println(coll.containsAll(co));
//		System.out.println(co.containsAll(coll));
		//System.out.println(coll.contains(co));
		
		
		Iterator it = co.iterator();
		
//		System.out.println("" + it.next() + co.size());
//		System.out.println("" + it.next() + co.size());
//		it.remove();
//		System.out.println("" + co + co.size());
		
		//遍历操作  ====再进行
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
