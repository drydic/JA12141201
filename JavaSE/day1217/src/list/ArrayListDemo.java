package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList();
		
		for (int i = 0; i < 5; i++) {
			arr.add("it-" + i);//�Զ�װ�䣬������������ ��װ�ɶ���
		}
		//����
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr);
		}
		System.out.println("=================");
		for(Iterator iterator = arr.iterator();iterator.hasNext();){
			String object = (String)iterator.next();
			System.out.println(object);
		}
		System.out.println("====================");
		for (Object object : arr) {
			System.out.println(object);
		}
		System.out.println("========================");
		
	}
	

}