/**
 * 
 */
package employee;

/**
 * @author C4
 *
 */
public class SalariedEmployee extends Employee {
	private double monthSalary;
	/**
	 * 
	 */
	public SalariedEmployee() {}

	/**
	 * @param name
	 * @param salary
	 * @param birthMonth
	 */
	public SalariedEmployee(String name,double monthSalary, int birthMonth) {
		super(name, birthMonth);
		this.monthSalary = monthSalary;
	}

	@Override
	public double getSalary(int month) {
		return super.getSalary(month) + this.monthSalary;
	}
	
}
