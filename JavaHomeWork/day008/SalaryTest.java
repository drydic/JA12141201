/* *ĳ��˾�Ĺ�Ա��Ϊ���������ࣺ 
Employee����������Ա���ܵĸ��࣬���ԣ�Ա���������������·ݡ� ������getSalary(int month) 
���ݲ����·���ȷ�����ʣ��������Ա�������գ� ��˾����⽱��100Ԫ�� 

SalariedEmployee��Employee�����࣬�ù̶����ʵ�Ա�������ԣ���н 

HourlyEmployee��Employee�����࣬��Сʱ�ù��ʵ�Ա����ÿ�¹�������160Сʱ�Ĳ��ְ���1.5�����ʷ��ţ����ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ�� 

SalesEmployee��Employee�����࣬������Ա�������������۶������ʾ��������ԣ������۶����� 

BasePlusSalesEmployee��SalesEmployee�����࣬�й̶���н��������Ա�� �����ɵ�н����������ɲ��� ���ԣ���н�� 

��д������Test����������ÿ������ÿ�µĹ������� */



class Employee{
	private String name;//Ա������
	private int  month;//�����·�
	
	public String getname(){
		return name;
	}
	Employee(String name,int month){
		this.name = name;
		this.month = month;
	}
	
	public double getSalary(int month){
		if(this.month==month)
			return 100;
		else 
			return 0;
	}
}

/* �̶�����Ա�� */
class SalariedEmployee extends Employee{
	private double salary;//��н
	
	SalariedEmployee(String name,int month,double salary){
		super(name,month);
		this.salary = salary;
	}
	
	public double getSalary(int month){
		return salary+super.getSalary(month);
	}
	
}

/* ��Сʱ�ù���Ա�� */
class HourlyEmployee extends Employee{
	private double hours;//ÿ�¹���Сʱ��
	private double hourSalary;//ÿСʱ����
	
	HourlyEmployee(String name,int month,double hours,double hourSalary){
		super(name,month);
		this.hours = hours;
		this.hourSalary = hourSalary;
		
	}
	
	public double getSalary(int month){
		if(hours>160){
			return 160*hourSalary+(hours-160)*1.5+super.getSalary(month);
		}else{
			return 160*hourSalary+super.getSalary(month);
		}
	}
}

/* ������Ա���� */
class SalesEmployee extends Employee{
	private double monthSalary;//ÿ�����۶�
	 double	royaRate;//�����
	
	SalesEmployee(String name,int month,double monthSalary,double royaRate){
		super(name,month);
		this.monthSalary = monthSalary;
		this.royaRate = royaRate;
	}
	
	public double getSalary(int month){
		return monthSalary+monthSalary*royaRate+super.getSalary(month);
	}
}

/* �й̶���н��������Ա */
class BasePlusSalesEmployee extends SalesEmployee{
	private double baseSalary;//�̶���н
	//private double	royaRate;//�����
	
	BasePlusSalesEmployee(String name,int month,double monthSalary,double royaRate,double baseSalary){
		super(name,month,monthSalary,royaRate);
		this.baseSalary = baseSalary;
	}
	
	public double getSalary(int month){
		return baseSalary+super.getSalary(month);
	}
}
public class SalaryTest{
	public static void main(String[] args){
		Employee a = new SalariedEmployee("������",8,6500);
		Employee b = new HourlyEmployee("Ҧ�ٽ�",11,172.5,40);
		Employee c = new SalesEmployee("��  ��",12,6000,0.1);
		Employee d = new BasePlusSalesEmployee("�߲���",1,5000,0.1,1000);
		
		System.out.println(a.getname() + "�Ĺ����ǣ�" + a.getSalary(12));
		System.out.println(b.getname() + "�Ĺ����ǣ�" + b.getSalary(12));
		System.out.println(c.getname() + "�Ĺ����ǣ�" + c.getSalary(12));
		System.out.println(d.getname() + "�Ĺ����ǣ�" + d.getSalary(12));
	}
}
