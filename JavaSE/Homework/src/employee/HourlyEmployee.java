
package employee;

public class HourlyEmployee extends Employee {
	private double hourPay;
	private int hours;
	
	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(String name, int birthMonth, double hourPay, int hours) {
		super(name, birthMonth);
		this.hourPay = hourPay;
		this.hours = hours;
	}

	@Override
	public double getSalary(int month) {
		if (this.hours > 160) {
			return super.getSalary(month) + hourPay*160 + hourPay*(hours - 160)*1.5;
		}else{
		return super.getSalary(month) ;
		}
	}
	
}
