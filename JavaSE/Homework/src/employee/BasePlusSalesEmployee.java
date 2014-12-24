package employee;

public class BasePlusSalesEmployee extends SalesEmployee {
	private double baseSalary;

	public BasePlusSalesEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BasePlusSalesEmployee(String name, int birthMonth, double sales,	double percent, double baseSalary) {
		super(name, birthMonth, sales, percent);
		this.baseSalary = baseSalary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		return super.getSalary(month)  + baseSalary;
	}
	
	
}