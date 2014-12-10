/* *某公司的雇员分为以下若干类： 
Employee：这是所有员工总的父类，属性：员工的姓名和生日月份。 方法：getSalary(int month) 
根据参数月份来确定工资，如果该月员工过生日， 则公司会额外奖励100元。 

SalariedEmployee：Employee的子类，拿固定工资的员工。属性：月薪 

HourlyEmployee：Employee的子类，按小时拿工资的员工，每月工作超出160小时的部分按照1.5倍工资发放，属性：每小时的工资、每月工作的小时数 

SalesEmployee：Employee的子类，销售人员，工资由月销售额和提成率决定。属性：月销售额、提成率 

BasePlusSalesEmployee：SalesEmployee的子类，有固定底薪的销售人员， 工资由底薪加上销售提成部分 属性：底薪。 

编写测试类Test，用来测试每个工种每月的工资数。 */



class Employee{
	private String name;//员工姓名
	private int  month;//生日月份
	
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

/* 固定工资员工 */
class SalariedEmployee extends Employee{
	private double salary;//月薪
	
	SalariedEmployee(String name,int month,double salary){
		super(name,month);
		this.salary = salary;
	}
	
	public double getSalary(int month){
		return salary+super.getSalary(month);
	}
	
}

/* 按小时拿工资员工 */
class HourlyEmployee extends Employee{
	private double hours;//每月工作小时数
	private double hourSalary;//每小时工资
	
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

/* 销售人员工资 */
class SalesEmployee extends Employee{
	private double monthSalary;//每月销售额
	 double	royaRate;//提成率
	
	SalesEmployee(String name,int month,double monthSalary,double royaRate){
		super(name,month);
		this.monthSalary = monthSalary;
		this.royaRate = royaRate;
	}
	
	public double getSalary(int month){
		return monthSalary+monthSalary*royaRate+super.getSalary(month);
	}
}

/* 有固定底薪的销售人员 */
class BasePlusSalesEmployee extends SalesEmployee{
	private double baseSalary;//固定底薪
	//private double	royaRate;//提成率
	
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
		Employee a = new SalariedEmployee("范晓飞",8,6500);
		Employee b = new HourlyEmployee("姚荣进",11,172.5,40);
		Employee c = new SalesEmployee("万  洋",12,6000,0.1);
		Employee d = new BasePlusSalesEmployee("倪昌杰",1,5000,0.1,1000);
		
		System.out.println(a.getname() + "的工资是：" + a.getSalary(12));
		System.out.println(b.getname() + "的工资是：" + b.getSalary(12));
		System.out.println(c.getname() + "的工资是：" + c.getSalary(12));
		System.out.println(d.getname() + "的工资是：" + d.getSalary(12));
	}
}
