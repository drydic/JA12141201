package set;

import java.util.Iterator;
import java.util.TreeSet;

import bean.Person;
/*
 * 让普通类具有可比性：实现compa接口，复写comparable：自定义比较规则==排序规则
 * 添加的元素必须具有可比性【TreeSet】
 */
public class TreeSetDemo2 {

	
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
		ts.add(new Person("Google",12));
		ts.add(new Person("Baidu",16));
		ts.add(new Person("123",16));
		ts.add(new Person("Alibaba",19));
		ts.add(new Person("Geminno",2));
		ts.add(new Person("apple",16));
		ts.add(new Person("apple",654));
		ts.add(new Person("apple",10));
		ts.add(new Person("apple",15));
		ts.add(new Person("apple",19));
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println("===========================");
		for (Iterator iterator = ts.iterator(); iterator.hasNext();) {
			Person object = (Person) iterator.next();
			System.out.println(object);
		}
	}

}
