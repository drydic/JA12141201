package employee;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�̶���нԱ��
		SalariedEmployee se = new SalariedEmployee("google",2222.2,1); 
		System.out.println("name:" + se.getName() + "\tSalary:" + se.getSalary(1));
		System.out.println("name:" + se.getName() + "\tSalary:" + se.getSalary(12));
		
		//Сʱ��
		HourlyEmployee heEmployee = new HourlyEmployee("baidu",2,233.33,169);
		System.out.println("name:" + heEmployee.getName() + "\tSalary:" + (float)heEmployee.getSalary(2));
		System.out.println("name:" + heEmployee.getName() + "\tSalary:" + (float)heEmployee.getSalary(12));
	}

}
