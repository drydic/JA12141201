package day1229;

/* 有五个学生，每个学生有三门课（语文，数学，英语）的成绩
 * 写一个程序接受从键盘输入学生的信息，输入格式为：name，30，30，30（姓名，三门课成绩）
 * 然后把输入的学生信息按总分从高到低的顺序 写入到一个名称为stu。txt文件中
 * 要求：stu.txt文件的格式要比较直观，打开这个文件，就可以很清楚的看到学生的信息；
 */
public class Student implements Comparable<Student>{
	private String name;
	private int chinese;
	private int math;
	private int english;
	public Student(String name, int chinese, int math, int english) {
		
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}
	
	public int compareTo(Student o) {
		
		return chinese+math+english;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+":"+chinese+"	"+math+"	"+english;
	}
}
