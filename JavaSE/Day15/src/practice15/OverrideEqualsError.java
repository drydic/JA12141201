package practice15;

class Person1{
	private String name;
	private String idStr;
	public Person1() {}
	public Person1(String name, String idStr) {
		this.name = name;
		this.idStr = idStr;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdStr() {
		return idStr;
	}
	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}
	public boolean equals(Object obj){
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == Person1.class) {
			Person1 personObjPerson1 = (Person1)obj;
			if (this.getIdStr().equals(personObjPerson1.getIdStr())) {
				return true;
			}
		}
		return false;
	}
}
class Dog{}


public class OverrideEqualsError {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 person1 = new Person1("孙悟空","123443433433");
		Person1 person2 = new Person1("孙行者","123443433433");
		Person1 person3 = new Person1("孙悟饭","99933433");
		System.out.println("Person1和person2是否相等？" + person1.equals(person2));
		System.out.println("Person2和person3是否相等？" + person2.equals(person3));
	}

}
