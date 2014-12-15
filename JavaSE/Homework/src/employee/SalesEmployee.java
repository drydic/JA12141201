
package employee;


public class SalesEmployee extends Employee {

	private double sales;
	private double percent;
	public SalesEmployee() {
		super();
	}
	public SalesEmployee(String name, int birthMonth, double sales, double percent) {
		super(name, birthMonth);
		this.sales = sales;
		this.percent = percent;
	}
	
	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		return super.getSalary(month) + sales*percent;
	}	
}
