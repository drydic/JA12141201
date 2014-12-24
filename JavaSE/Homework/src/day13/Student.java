package day13;

public class Student implements Comparable{
	private String sNo;
	private String sName;
	char sSex;
	private int sAge;
	private int sJava;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String sNo, String sName, char sSex, int sAge, int sJava) {
		super();
		this.sNo = sNo;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}
	public String getsNo() {
		return sNo;
	}
	public void setsNo(String sNo) {
		this.sNo = sNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public char getsSex() {
		return sSex;
	}
	public void setsSex(char sSex) {
		this.sSex = sSex;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public int getsJava() {
		return sJava;
	}
	public void setsJava(int sJava) {
		this.sJava = sJava;
	}
	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return sNo + "\t" + sName + "\t" + sSex + "\t" + sAge + "\t" + sJava;
}
	@Override
	public int compareTo(Object arg0) {
		Student s = (Student)arg0;
		// TODO Auto-generated method stub
		return this.sJava - s.sJava;
	}
	
}
