package set;

import java.util.Iterator;
import java.util.TreeSet;

import bean.ComparatorByAge;
import bean.Person;

/*
 * 使用比较器进行排序
 */
public class TreeSetDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet ts = new TreeSet();//默认使用Person的自然排序：先名字 后年龄
		//TreeSet：comparator比较器 先年龄、后名字
		TreeSet ts = new TreeSet(new ComparatorByAge());
		
		ts.add(new Person("Google",12));
		ts.add(new Person("Baidu",16));
		ts.add(new Person("123",16));
		ts.add(new Person("Alibaba",19));
		ts.add(new Person("Geminno",2));
		ts.add(new Person("apple",16));
		ts.add(new Person("apple",654));
		
		for (Iterator iterator = ts.iterator(); iterator.hasNext();) {
			Person object = (Person) iterator.next();
			System.out.println(object);
		}
	}

}
