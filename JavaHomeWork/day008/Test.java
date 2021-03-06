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
	
	Employee(String name,int month){
		this.name = name;
		this.month = month;
	}
	
	public float getSalary(int month){
		if(this.month==month)
			return 100;
		else 
			return 0;
	}
}
/* 固定工资员工 */
class SalariedEmployee extends Employee{
	private float salary;//月薪
	
	SalariedEmployee(String name,int month,float salary){
		super(name,month);
		this.salary = salary;
	}
	
	public float getSalary(int month){
		return salary+super.getSalary(month);
	}
	
}

/* 按小时拿工资员工 */
class HourlyEmployee extends Employee{
	private float hours;//每月工作小时数
	private float hourSalary;//每小时工资
	
	HourlyEmployee(String name,int month,float hours,float hourSalary){
		super(name,month);
		this.hours = hours;
		this.hourSalary = hourSalary;
	}
	
	public float getSalary(int month){
		if(hours>160){
			return 160*hourSalary+(hours-160)*1.5+super.getSalary(month);
		}else{
			return 160*hourSalary+super.getSalary(month);
		}
	}
}

/* 销售人员工资 */
class SalesEmployee extends Employee{
	private float monthSalary;//每月销售额
	private float	royaRate;//提成率
	
	SalesEmployee(String name,int month,float monthSalary,float royaRate){
		super(name,month);
		this.monthSalary = monthSalary;
		this.royaRate = royaRate;
	}
	
	public float getSalary(int month){
		return monthSalary+monthSalary*royaRate+super.getSalary(month);
	}
}

/* 有固定底薪的销售人员 */
class BasePlusSalesEmployee extends SalariedEmployee{
	private float baseSalary;//固定底薪
	
	BasePlusSalesEmployee(String name,int month,float monthSalary,float royaRate,float baseSalary){
		super(name,month,monthSalary,royaRate);
		this.baseSalary = baseSalary;
	}
	
	public float getSalary(int month){
		return baseSalary+super.getSalary(month);
	}
}
public void SalaryTest{
	public static void main(String[] args){
		
		
	}
}
