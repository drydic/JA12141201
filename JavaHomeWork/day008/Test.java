/* ĳ��˾�Ĺ�Ա��Ϊ���������ࣺ Employee����������Ա���ܵĸ��࣬���ԣ�Ա���������������·ݡ� ������getSalary(int month) ���ݲ����·���ȷ�����ʣ��������Ա�������գ� ��˾����⽱��100Ԫ�� SalariedEmployee��Employee�����࣬�ù̶����ʵ�Ա�������ԣ���н HourlyEmployee��Employee�����࣬��Сʱ�ù��ʵ�Ա����ÿ�¹�������160Сʱ�Ĳ��ְ���1.5�����ʷ��ţ����ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ�� SalesEmployee��Employee�����࣬������Ա�������������۶������ʾ��������ԣ������۶����� BasePlusSalesEmployee��SalesEmployee�����࣬�й̶���н��������Ա�� �����ɵ�н����������ɲ��� ���ԣ���н�� ��д������Test����������ÿ������ÿ�µĹ������� */


class Employee{
	String name;
	int  month;//�����·�
	int getSalary(int month){
		if(this.month==month)
			return salary+100;
		else 
			return salary;
	}
}
class SalariedEmployee extends Employee{
	double salary;
}
class HourlyEmployee extends Employee{
	double hoursalary;
	double time;
}
class SalesEmployee extends Employee{
	double monthSales;
	double per;
}
BasePlusSalesEmployee extends SalariedEmployee{
	
}
public void Test{
	public static void main(String[] args){
		double salary;
		
	}
}
