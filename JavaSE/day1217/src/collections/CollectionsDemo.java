package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bean.ComparatorByAge;
import bean.ComparatorByLength;
import bean.Person;

/*
 * Collections:�Ǽ��Ͽ�ܵĹ����� �������Ǿ�̬����  = �෽�� 
 * Tree set\map :��Ȼ���򡢼��ϱȽ������ڲ���ʽ�����������
 */
public class CollectionsDemo {

	
	public static void main(String[] args) {
		
		run();
		//run1();
	}
	public static void run(){
		List<String> list = new ArrayList<>();
		list.add("Oracle");
		list.add("Java");
		list.add("Baidu");
		list.add("Abcd");
		list.add("Facebook");
		list.add("Google");
		
//		for (String string : list) {
//			System.out.println(string);
//		}
		System.out.println(list);
		System.out.println("��ת=================");
		Comparator<String> com = Collections.reverseOrder();
		Collections.sort(list, com);
		System.out.println(list);
//		Collections.reverse(list);
//		System.out.println(list);
//		Collections.sort(list);//ʹ��Ԫ�ص���Ȼ˳������
//		Collections.sort(list,new ComparatorByLength());
//		for (String string : list) {
//			System.out.println(string);
//		}
//		String max = Collections.max(list);
//		String max = Collections.max(list,new ComparatorByLength());  
//		System.out.println("max="+ max);
	}
	public static void run1(){
		System.out.println("=================");
		List<Person> list2 = new ArrayList<>();
		list2.add(new Person("Android",12));
		list2.add(new Person("Java",1));
		list2.add(new Person("Baidu",23));
		list2.add(new Person("IBM",100));
		list2.add(new Person("IBM",15));
		list2.add(new Person("IBM",12));
		list2.add(new Person("IBM",1));
		list2.add(new Person("Google",1));
		for (Person person : list2) {
			System.out.println(person);
		}
		System.out.println("=================");
		Collections.sort(list2);
//		Collections.sort(list2,new ComparatorByAge());
		for (Person person : list2) {
			System.out.println(person);
		}
		Person person = Collections.max(list2);
		Person person2 = Collections.min(list2);
		System.out.println("Person���ֵ��" + person + "\nPerson��Сֵ��" + person2);
	}

}