//�����ࡾֻ�ܱ��̳С�----->���ࣺʵ�����г��󷽷�--->����
//��������   		������
public abstract class Shape{
	//���������ɣ�
	{
		System.out.println("ִ��Shape�ĳ�ʼ����");
	}
	private String color;
	
	//����һ�������ܳ��ĳ��󷽷�
	
	public abstract double calPerimeter();
	
	//����һ��������״�ĳ��󷽷�
	
	public abstract String getType();
	
	//����Shape�Ĺ��������ù��������������ڴ���Shape����
	//�������ڱ��������,���̳У�����ʵ��������
	
	public Shape(){}//���췽������:���������
	public Shape(String color){
		System.out.println("ִ�й�����");
		this.color = color;
	}
	//ʡ��color���Ե�setter��getter����
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
}