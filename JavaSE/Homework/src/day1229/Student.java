package day1229;

/* �����ѧ����ÿ��ѧ�������ſΣ����ģ���ѧ��Ӣ��ĳɼ�
 * дһ��������ܴӼ�������ѧ������Ϣ�������ʽΪ��name��30��30��30�����������ſγɼ���
 * Ȼ��������ѧ����Ϣ���ִܷӸߵ��͵�˳�� д�뵽һ������Ϊstu��txt�ļ���
 * Ҫ��stu.txt�ļ��ĸ�ʽҪ�Ƚ�ֱ�ۣ�������ļ����Ϳ��Ժ�����Ŀ���ѧ������Ϣ��
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