class Root{
	static{
		System.out.println("Root�ľ�̬��ʼ����");
	}
	{
		System.out.println("Root����ͨ��ʼ����");
	}
	public Root(){
		System.out.println("Root���޲ι��캯��");
	}
}
class Mid extends Root{
	static{
		System.out.println("Mid�ľ�̬��ʼ����");
	}
	{
		System.out.println("Mid����ͨ��ʼ����");
	}
	public Mid(){
		System.out.println("Mid���޲ι��캯��");
	}
	public Mid(String msg){
		this();
		System.out.println("Mid��һ�ι��캯������ֵΪ��" + msg);
	}
}
class Leaf extends Mid{
	static{
		System.out.println("Leaf�ľ�̬��ʼ����");
	}
	{
		System.out.println("Leaf����ͨ��ʼ����");
	}
	public Leaf(){
		super("���Java����");
		System.out.println("Leaf���޲ι��캯��");
	}
}
public class InitTest{
	public static void main(String[] args){
		new Leaf();
		new Leaf();
	}
}











