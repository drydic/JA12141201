public class Manager extends Employee{
	//��������
	String car;
	String office;
	
	//���๹�췽����������á����๹�췽����
	//�����޲ι��췽�� + û����ʾ���ø��๹�캯��=�Զ����ø�����޲ι��췽��
	public Manager(){
		super();
		System.out.println("�����޲ι��캯��");
	}  
	
	//����һ�ι��췽��
	public Manager(int id){
		super(id);
		System.out.println("����һ�ι��췽��");
		//this.id = id;
	}
	public Manager(int id,String d){
		//super(id,"d");
		System.out.println("�������ι��췽��");
		//this.id = id;
	}
	
	//���з���
	public void drive(){
		
		System.out.println("super.name:" + super.name + "��" + this.car + "�ϰࡣ");
		System.out.println("this.name:"+this.name);
	}
	
	//super�����������
	public void info(){
		System.out.println("�����info()������");
		//System.out.println("id:" + id + "\tname:" + name + "\tsalary:" + salary);
		super.info();
		System.out.println("car:" + car + "\noffice:" + office);
	}

}

