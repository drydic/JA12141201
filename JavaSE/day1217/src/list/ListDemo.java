package list;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class A{
	public boolean equals(Object object){
		return true;
	}
}
public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List:存储各种数据、元素可以重复、有序【可以使用索引访问元素】
		 * 相对Collection：特有方法：带索引index的方法
		 * 
		 * */
		List list = new ArrayList();
		List list2 = new ArrayList();
		
		list.add("Google");
		list.add("Java");
		list.add("Apple");
		list.add(2, "Baidu");
		System.out.println(list);
		
//		list2.add("Alibaba");
//		list2.add("xiaomi");
//		System.out.println(list2);
		
//		list.addAll(list2);
//		System.out.println(list);
//		
//		list.addAll(1, list2);
//		System.out.println(list);
//		
//		list.remove(0);
//		list.remove("Baidu");
//		System.out.println(list);
		
		//增操作
//		list.add("Android-001");
//		list.add("Android-002");
//		list.add("Android-003");
//		list.add("Android-004");
//		list.add("Android-005");
//		
//		list.add(3,"Google");
		//list中用equals判断与元素是否相等
//		System.out.println(list);
//		System.out.println("Android--002:" + list.indexOf(new String("Android-002")));
//		
//		list.remove(new A());
//		list.remove(new A());
//		System.out.println(list);
//		for(int i = 0; i < list.size(); i++){
//			System.out.println(list.get(i));			
//		}
//		System.out.println("==========================");
		//2.删除操作
//		try {
//			System.out.println(list.remove(10));
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		list.remove(3);
//		list.remove("Android-003");
//		
		//3.修改
//		list.set(0,"GDG");
//		for(int i = 0; i < list.size(); i++){
//			System.out.println(list.get(i));			
//		}
//		//遍历
//		for (Iterator it = list.iterator();it.hasNext();) {
//			Object object = (Object)it.next();
//			System.out.println(object);
//		}
//		Iterator it = list.iterator();
//		while (it.hasNext()) {
//			Object object = (Object) it.next();
//			System.out.println(object);
//		}
//		
//		//ListIterator:
//		System.out.println("=========ListIterator=======");
//		ListIterator iit = list.listIterator();
//		while (iit.hasNext()) {
//			Object object = (Object) iit.next();
//			//iit.add("Alibaba");
//			System.out.println(object);
//		}
//		//System.out.println(list);
//		while (iit.hasPrevious()) {
//			System.out.println(iit.previous());
//			
//		}
	}

}










