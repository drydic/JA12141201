package day14;

public class Student1 implements Comparable{
	private String name;
	private int score;
	
	public Student1() {
		
		// TODO Auto-generated constructor stub
	}
	
	public Student1(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name:" + name + "\tscore:" + score;
	}

	@Override
	public int compareTo(Object o) {
		Student1 st = (Student1)o;
		int res = st.score - this.score;
		return res == 0 ? this.name.compareTo(st.name):res;
	}
	
}
