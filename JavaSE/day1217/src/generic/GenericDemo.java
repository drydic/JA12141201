package generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/*
 * ���ͣ��ڳ�����ʹ��<>��ָ�����������
 * 	����������Ķ��塢�ӿڶ��塢�������塢����
 * 1.������ʱ������ǰ������ʱ�����緢�ִ���
 */
public class GenericDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> list = new TreeSet<>();
		//list.add(123);	//������ʱ������ǰ������ʱ�����緢�ִ���
		list.add("Google");
		list.add("baidu");
		
		System.out.println(list);
		
//		for (String string : list) {
//			System.out.println(string);
//		}
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String string = it.next();
			System.out.println(string);
		}
	}

}