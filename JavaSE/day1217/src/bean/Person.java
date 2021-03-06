package bean;

import java.util.Collection;

public class Person implements Comparable{
	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "name=" + name + "\tage=" + age ;
	}
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Object o) {
		Person person = (Person)o;
//		// 先年龄比较，再姓名比较
//		int res = this.age - person.age;
//		if (res==0) {
//			return this.name.compareTo(person.name);
//		}else {
//			return res;
//		}
		//先姓名比较  在比较姓名
		int res = this.name.compareTo(person.name);
//		if (res==0) {
//			return this.age-person.age;
//		}else {
//			return res;
//		}
		return   res==0?this.age-person.age:res;
	}
	
}
