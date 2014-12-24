package bean;

import java.util.Comparator;
/*
 * 比较器  ：先按年龄排序  再按姓名比较
 */

public class ComparatorByAge implements Comparator<Person> {

	@Override
	public int compare(Person arg0, Person arg1) {
		int res = arg0.getAge()-arg1.getAge();
		return res==0?arg0.getName().compareTo(arg1.getName()):res;
	}

	
	}


