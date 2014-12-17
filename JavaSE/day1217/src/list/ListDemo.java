package list;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

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
		
		//增操作
		list.add("Android-001");
		list.add("Android-002");
		list.add("Android-003");
		list.add("Android-004");
		list.add("Android-005");
		
		list.add(3,"Google");
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));			
		}
		System.out.println("==========================");
		//2.删除操作
		try {
			System.out.println(list.remove(10));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		list.remove(3);
		list.remove("Android-003");
		
		//3.修改
		list.set(0,"GDG");
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));			
		}
		//遍历
		for (Iterator it = list.iterator();it.hasNext();) {
			Object object = (Object)it.next();
			System.out.println(object);
		}
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
		
		//ListIterator:
		System.out.println("=========ListIterator=======");
		ListIterator iit = list.listIterator();
		while (iit.hasNext()) {
			Object object = (Object) iit.next();
			//iit.add("Alibaba");
			System.out.println(object);
		}
		//System.out.println(list);
		while (iit.hasPrevious()) {
			System.out.println(iit.previous());
			
		}
	}

}










