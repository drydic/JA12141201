package day13;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetHome {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		float ave;
		Student s1 = new Student("13156", "Google", '��', 18, 80);
		Student s2 = new Student("13157", "Baidu", '��', 19, 65);
		Student s3 = new Student("13158", "Alibaba", 'Ů', 21, 92);
		Student s4 = new Student("13151", "IBM", '��', 20, 45);
		Student s5 = new Student("13155", "Tencent", 'Ů', 18, 87);
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		
		for (Iterator iterator = ts.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
		ave= (float)(s1.getsJava()+s2.getsJava()+s3.getsJava()+s4.getsJava()+s5.getsJava())/5;
		
		System.out.println("Java���Ե�ƽ��ֵ�ǣ�" + ave);
		Student s6 = (Student)ts.first();
		Student s7 = (Student)ts.last();
		System.out.println("Java���Գɼ�����Сֵ�ǣ�" + s6.getsJava() + "\tJava���Գɼ������ֵ�ǣ�" + s7.getsJava());
	}
}
