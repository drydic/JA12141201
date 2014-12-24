package day13;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetHome {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		float ave;
		Student s1 = new Student("13156", "Google", '男', 18, 80);
		Student s2 = new Student("13157", "Baidu", '男', 19, 65);
		Student s3 = new Student("13158", "Alibaba", '女', 21, 92);
		Student s4 = new Student("13151", "IBM", '男', 20, 45);
		Student s5 = new Student("13155", "Tencent", '女', 18, 87);
		
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
		
		System.out.println("Java语言的平均值是：" + ave);
		Student s6 = (Student)ts.first();
		Student s7 = (Student)ts.last();
		System.out.println("Java语言成绩的最小值是：" + s6.getsJava() + "\tJava语言成绩的最大值是：" + s7.getsJava());
	}
}
